import java.util.*;

public class Dashboard
{
    private final List<Alarm> allAlarms = new ArrayList<>();

    public void add(Alarm alarm)
    {
        alarm.turnOn();
        allAlarms.add(alarm);
    }

    public void printBigReport()
    {
        for(Alarm alarm : allAlarms)
        {
            System.out.println(alarm.getReport(true))
        }
    }

    public static void main(String arg[])
    {
        Dashboard dash = new Dashboard();

        dash.add(new PrioritizedAlarm("Temperature too high", 42));
        dash.add(new HighVisibilityAlarm("Pressure too low"));
        
    }
}