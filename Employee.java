class Person{
    void draw()
    {
  System.out.println("can run");
    }
}
class Employee extends Person{
    void draw()
    {
        System.out.println("running fast");
    }
    public static void main(String[] args) {
        Person p = new Employee();
        p.draw();
    }
}