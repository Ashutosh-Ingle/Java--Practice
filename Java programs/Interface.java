interface Circle
{
    public final float PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumference(float Radius);


}
class Demo implements Circle
{
     public static void main(String Arg[])
    {
        public float CalculateArea(float Radius)
        {
            return PI* Radius*Radius;

        }
        public float CalculateCircumference(float Radius)
        {
            return 2 *PI* Radius;
        }
    }
}

class Interface
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();

        float fRet = 0.0f;
    }
}