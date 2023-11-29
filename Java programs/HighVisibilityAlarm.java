public class HighVisibilityAlarm extends MyAlarm
{
    public HighVisibilityAlarm(String message)
    {
        super(message);
    }

    @Override
    public String getReport(boolean uppercase)
    {
       String report = super.getReport();
       if(report.isEmpty())
       {
        return report;
       }
       else
       {
        return report + "!";
       }
    }
}