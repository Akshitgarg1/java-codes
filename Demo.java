interface Area
{
    final static float PI=3.14F;
    float compute(float a, float b);
}
class Rectangle implements Area{
    public float compute(float a,float b)
    {
        return (a*b);
    }
}
class Circle implements Area{
    public float compute(float x,float y)
    {
        return (PI*x*y);
    }
}
class Demo
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Area a;
        a=r;
        System.out.println("rectangle area is:"+a.compute(10,20));
        a=c;

        System.out.println("circle area:"+a.compute(10,10));
    }
}