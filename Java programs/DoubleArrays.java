
class DoubleArrays
{
    public static void main(String arg[])
    {
        double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++)
        {
          results[i] = execute(opCodes[i], leftVals[i],rightVals[i]);
        }
        for (double currentResult: results)
            System.out.println(currentResult);
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