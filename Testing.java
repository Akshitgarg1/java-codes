abstract class Shape {
    abstract void draw();

    
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}
/**
 * Testing
 */
class Testing {
    public static void main(String[] args) {
        Shape s= new Rectangle();
        s.draw();
        System.out.println("-------------");
        Shape s1= new Circle();
        s1.draw();
    }

    
}