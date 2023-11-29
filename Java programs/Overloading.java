/*
class Object
{
    //Code
}
*/
class Demo          //class Demo extends Object
{
    public int Addition(int a,int b)
    {
        return a+b;
    }
    public int Addition(int a,int b,int c)
    {
        return a+b+c;
    }
    public double Addition(double a,double b)
    {
        return a+b;
    }
    public double Addition(double a, double b,double c)
    {
        return a+b+c;
    }
}

class Overloading
{
    public static voif main(String Arg[])
    {
        Demo obj = new Demo();

        int A = 10, B = 20, C = 30, iRet = 0;
        double X = 10.9, Y = 90.8, Z = 44.6, dRet = 0;

        iRet = obj.Addition(A,B,C);
    }
}