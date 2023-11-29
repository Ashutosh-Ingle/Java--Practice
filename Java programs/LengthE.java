class LengthE
{
    public static void main(String arg[])
    {
        if(arg.length !=1)
        {
            System.out.println("Enter only one word");
        }
        String word = arg[0];
        int length = word.length();

        System.out.println("Length of word is "+ length);
    }
}