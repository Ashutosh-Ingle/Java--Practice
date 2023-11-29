
class Calc
{
    public static void main(String arg[])
    {
        double value1;
        double value2;
        double result;
        char opCode;

        if(opCode == 'a')
        {
            result = value1 + value2;
        }
        else if(opCode == 's')
        {
            result = value1 - value2;
        }
        else if(opCode == 'm')
        {
            result = value1 * value2;
        }
        else
        {
            return 0.0d;
        }
    }
}