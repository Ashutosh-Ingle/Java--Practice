class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    final public void gun()
    {
        System.out.println("Base gun final");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
  /* public void gun()
    {
        System.out.println("Derived gun final");
    }
*/}
class Final2
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived();
        bobj.fun();
        bobj.gun();
    }
}