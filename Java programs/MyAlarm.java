import java.awt.color;
import java.time.LocalDateTime;

//public sealed class MyAlarm permits PrioritizedAlarm HighVisibilityAlarm

public abstract class MyAlarm implements Widget, PersistenObject
{
    protected boolean active;
    final String message;
    LocalDateTime snoozeUntil;

    MyAlarm(String message)
    {
        this.message = message;
        stopSnoozing();
    }

    @Override
    public String getHelptext()
    {
        return "I am an alarm. You can turn me on or off and snooze me.";
    }

    @Override
    public void save()
    {
        System.out.println("Saving...");
    }

    public abstract Color getColor();

    public LocalDateTime getSnoozeUntil()
    {
        return snoozeUntil;
    }

    public void snooze(){
        if(active)
        {
        snoozeUntil = LocalDateTime.now().plusSeconds(5);
        }
    }

    boolean isSnoozing()
    {
        return (snoozeUntil.isAfter(LocalDateTime.now()));
    }

     private void stopSnoozing()
    {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public String getMessage()
    {
        return message;
    }

    void turnOn()
    {
        active = true;
        stopSnoozing();
    }

    void trueOff()
    {
        active = false;
        stopSnoozing();
    }

    String getReport()
    {
        return getReport(false);
    }

    public String getReport(boolean uppercase)
    {
        if(active && !isSnoozing())
        {
            if(uppercase)
            {
                return message.toUpperCase();
            }
            else
            {
                return message;
            }
        }
        else
        {
            return " ";
        }
    }

    void sendReport()
    {
        System.out.println(getReport(true));
    }

}