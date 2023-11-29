
class CommandLineArg
{
    public static void main(String arg[])
    {
        double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

    if(arg.length == 0)
    {
        for(int i = 0; i < opCodes.length; i++)
        {
          results[i] = execute(opCodes[i], leftVals[i],rightVals[i]);
        }
    
        for (double currentResult: results)
            System.out.println(currentResult);
    }
    else if(arg.length == 3)
    {
        handleCommandLine(arg);
    }
    else
    {
        System.out.println("Please provide an operation code and 2 numeric values");
    }
    }

    private static void handleCommandLine(String[] arg)     // Arguments are coming as string
    {
        char opCode = arg[0].charAt(0);     //Converting string into char
        double leftVal = Double.parseDouble(arg[1]);
        double rightVal = Double.parseDouble(arg[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

        static double execute(char opCodes, double leftVals, double rightVals)
        {
            double result;
             switch(opCodes)
            {
                case 'a':
                    result = leftVals + rightVals;
                    break;
                
                case 's':
                    result = leftVals - rightVals;
                    break;

                case 'm':
                    result = leftVals * rightVals;
                    break;
                case 'd':
                    result = rightVals != 0 ? leftVals / rightVals : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opcode: "+ opCodes);
                    result = 0.0d;
                    break;
            }
            return result;
        }
}