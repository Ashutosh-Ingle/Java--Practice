class Array2
{
    public static void main(String Arg[])
    {
        int Arr[][] = new int[3][4];
        /*
        Arr is 2 dimensional array
        which contains 3 one dimensional array
        each one dimensional array contains 4 elements
        each element is a type of integer
        */

       Arr[0][0] = 10;
       Arr[0][1] = 20;
       Arr[0][2] = 30;
       Arr[0][3] = 40;

       Arr[1][0] = 50;
       Arr[1][1] = 60;
       Arr[1][2] = 70;
       Arr[1][3] = 80;

       System.out.println(Arr.length);
    }
}