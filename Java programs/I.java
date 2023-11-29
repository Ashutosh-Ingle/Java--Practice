import java.util.*;

class I
{
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int iNo1 = Sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = Sobj.nextInt();

        int Ans = 0;

        Ans  = iNo1 + iNo2;
        System.out.println("Addirion is : "+Ans);
        Sobj.close();
    }
}