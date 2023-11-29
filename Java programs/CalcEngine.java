import java.util.*;

class MathEquation
{
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public MathEquation()
    {
    }

    public MathEquation(char opCode)
    {
        this.opCode = opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal)
    {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getResult()
    {
        return result;
    }

    public void setLeftVal(double leftVal)
    {
    this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal)
    {
    this.rightVal = rightVal;
    }

public void setOpCode(char opCode) {
    this.opCode = opCode;
}

    void execute()
    {
        switch(opCode)
        {
         case 'a':
                result = leftVal + rightVal;
                break;
            
            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opcode: "+ opCode);
                result = 0.0d;
                break;
        }
        
    }
}

class CalcEngine
{
    public static void main(String arg[])
    {

    if(arg.length == 0)
    { 
        performCalculations();
    }
    else if(arg.length == 3)
    {
        handleCommandLine(arg);
    }
    else if(arg.length == 1 && arg[0].equals("interactive"))
    {
        executeInteractively();
    }
    else
    {
        System.out.println("Please provide an operation code and 2 numeric values");
    }

    }

    static void performCalculations()
    {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d,50.0d);
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');
        
        for(MathEquation equation : equations)
        {
            equation.execute();
            System.out.println("result = "+ equation.getResult());
        }
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode)
    {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }

    static void executeInteractively()
    {
        System.out.println("Enter an operation and two numbers");
        Scanner sobj = new Scanner(System.in);
        String userInput = sobj.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }
    
    private static void performOperation(String[] parts)
    {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode,leftVal,rightVal);
        
        displayResult(opCode,leftVal,rightVal,result);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result)
    {
        char symbol = symbolFromOpcode(opCode);

        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromOpcode(char opCode)
    {
        char[] opCodes = {'a','s', 'm','d'};
        char[] symbols ={ '+','-', '*','/'};

        char symbol = ' ';

        for (int index = 0; index < opCodes.length; index++)
        {
            if(opCode == opCodes[index])
            {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }
    

    private static void handleCommandLine(String[] arg)     // Arguments are coming as string
    {
        char opCode = arg[0].charAt(0);     //Converting string into char
        double leftVal = Double.parseDouble(arg[1]);
        double rightVal = Double.parseDouble(arg[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal)
    {

         double result;
            switch(opCode)
        {
            case 'a':
                result = leftVal + rightVal;
                break;
            
            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opcode: "+ opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
    

    static char opCodeFromString(String operationName)
    {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word)
    {
        String[] numberWords = {"zero", "one","two", "three","four","five","six","seven","eight","nine"};
        double value = 0.0d;
        for(int index = 0; index < numberWords.length;index++)
        {
            if(word.equals(numberWords[index]))
            {
                value = index;
                break;
            }
        }
        return value;
    }
}