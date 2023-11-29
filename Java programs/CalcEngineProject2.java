
public class CalcEngineProject2
{
    public static void main(Strin arg[])
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(arg[0]))){

        String inputLine = null;
        while((inputLine = reader.readLine()) != null)
            performOperation(inputLine);
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

    private static void performOperation(String[] parts)
    {
        MathOperation opCode = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);

        MathEquation equation = new MathEquation(opCode,leftVal,rightVal);
        equation.execute();
        System.out.println(equation);
    }

     static int execute(MathOperation opCode, int leftVal, int rightVal)
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

                if(rightVal == 0)
                {
                   // IllegalArgumentException exception = new IllegalArgumentException("Zero rightval not permitted with divide operation ");
                    //throw exception;
                    throw new IllegalArgumentException("Zero rightval not permitted with divide operation ");
                }
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opcode: "+ opCode);
                result = 0.0d;
                break;
        }
        return result;
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