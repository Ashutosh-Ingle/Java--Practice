import java.util.*;

class Digits
{
    boolean CheckArmstrong(int iNo)
    {
        int iTemp = iNo;

        int iCount = 0;
        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp /10;
        }
        iTemp = iNo;

        int iSum =0;
        int iPower = 1;
        int iCnt = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            for(iCnt = 1; iCnt <= iCount; iCnt++)
            {
                iPower = iPower + iDigit;
            }
            iSum = iSum + iPower;
            iPower = 1;
            iNo = iNo/10;
        }
        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Armstrong
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        boolean bRet = dobj.CheckArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
             System.out.println("Number is not armstrong");
        }
    }
}