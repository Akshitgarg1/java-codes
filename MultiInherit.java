interface eat{
    void eating();
}
interface sleep{
    void sleeping();
}
class A implements eat , sleep
{
    public void eating(){
        System.out.println("A is eating");
    }
    public void sleeping(){
        System.out.println("A is sleeping");
    }
}
class B implements eat , sleep
{
    public void eating(){
        System.out.println("B is eating");
    }
    public void sleeping(){
        System.out.println("B is sleeping");
    }

}
class MultiInherit
{
    public static void main(String[] args) {
         A a = new A();
         B b = new B();
         
         a.eating();
         a.sleeping();
         b.eating();
         b.sleeping();

    }
}