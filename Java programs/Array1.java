
class Array1
{
    public static void main(String Arg[])
    {
        int Arr1[] = {10,20 ,30,40};      //Static way

        int Arr2[] = new int[4];          //Dynamic way
        Arr2[0] = 10;
        Arr2[1] = 20;
        Arr2[2] = 30;
        Arr2[3] = 40;

        System.out.println("Length of Arr1 is: "+Arr1.length);
        System.out.println("Length of Arr2 is: "+Arr2.length);
        
    }
}