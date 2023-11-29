public class PrioritizedAlarm extends MyAlarm
{
    private final int priority;

    public PrioritizedAlarm(String message,int priority)
    {
        super(message);
        this.priority = priority;
    }

    public int getPriority()
    {
        return priority;
    }

}