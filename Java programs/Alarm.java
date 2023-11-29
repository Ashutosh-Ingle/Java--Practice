import java.util.*;
import java.time.LocalDateTime;

class Alarm 
{
    public static void main(String arg[]) throws InterruptedException
    {
        HighVisibilityAlarm hobj = new HighVisibilityAlarm("Temperature too high");
        hobj.turnOn();
        hobj.sendReport();

        p
        //PrioritizedAlarm pobj = new PrioritizedAlarm("Temperature too high",42);
        
        /*MyAlarm aobj = new MyAlarm("Temperature too high");
        aobj.turnOn();
        aobj.snooze();
        Thread.sleep(6000);
        aobj.sendReport();*/
    }
}