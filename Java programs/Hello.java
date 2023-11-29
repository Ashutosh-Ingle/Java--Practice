class Hello
{
    public static void main(String arg[])
    {
        String word = arg[0];
        int length = word.length();
        
        System.out.println("Length of word is "+ length);
        
        if(arg.length !=1)
        {
            System.out.println("Enter only one word");
            return;
        }
    }
}