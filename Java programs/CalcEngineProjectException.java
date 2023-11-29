import java.util.*;

public class InvalidStatementException extends Exception
{
    public InvalidStatementException(String message)
    {
        super(message);
    }
     public InvalidStatementException(String message,Exception ex)
    {
        super(message,ex);
    }
}

public class CalcEngineProjectException
{
    public static void main(String arg[])
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(arg[0]))){
            
            processFile(reader);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found : "+ ex.getMessage());
        }
        catch(IOException ex)
        {
            System.out.println("Error : "+ ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Error processing file : "+ ex.getMessage());
        }
    }

    private static void processFile(BufferedReader reader) throws IOException
    {
        String inputLine = null;
         while((inputLine = reader.readLine()) != null)
            try
            {
                performOperation(inputLine);
            }
            catch(InvalidStatementException ex)
            {
                System.out.println(ex.getMessage()+ " - "+ inputLine);
                writeInvalidStatementExceptionToLog(ex, inputLine);
            }
    }

    private static void performOperation(String inputLine)throws InvalidStatementException
    {
        try{
            String [] parts = inputLine.split(" ");

        if(parts.length != 3)
        {
            throw new InvalidStatementException("Statement must have 3 parts : operation leftval rightval");
        }

        MathOperation opCode = MathOperation.valueOf(parts[0].toUpperCase());
        int leftVal = valueFromWord(parts[1]);
        int rightVal = valueFromWord(parts[2]);

        int result = execute(operation, leftVal,rightVal);
        System.out.println(inputLine + " = " + result);
        }
        catch(InvalidStatementException ex)
        {
            throw ex;
        }
        catch(Exception ex)
        {
            throw new InvalidStatementException("Error processing statement",ex);
        }
    }

     static int execute(char opCode, int leftVal, int rightVal)
    {

         int result;
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

        static void writeInvalidStatementExceptionToLog(InvalidStatementException ex, String inputLine)
        {
            System.err.println("");
            System.err.println("*******************");
            System.err.println("Information written to the log system");
            System.err.println("*******************");
            
            System.err.println(ex.getMessage()+ " - "+ inputLine);
            if(ex.getCause() != null)
                {
                    System.err.println("caused by : "+ex.getCause());
                ex.printStactTrace(System.err);// Stack trace
                }
            


        }
    }
    

}