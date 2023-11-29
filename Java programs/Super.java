class Base
{
    public int A;

    public Base()
    {
        System.out.println("Inside base default constructor");
        this.A = 11;
    }
    public Base(int i)
    {
        System.out.println("Inside base parametrised constructor");
        this.A = i;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}
class Derived extends Base 
{
    public int A;

    public Derived()
    {
        super(101);
        System.out.println("Inside derived constructor");
        this.A = 51;
    }
    public void gun()
    {
        System.out.println("Inside derived gun");

        System.out.println("Value of A : "+this.A);
        System.out.println("Value of A : "+A);
        System.out.println("Value of A : "+super.A);
        super.fun();
    }

}
class Super
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        dobj.gun();
    }
}