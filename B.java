
abstract class A {
    void display() {
        System.out.println("Display version of Parent Class");
    }
}

class B extends A {
    void display() {
        System.out.println("hello");
    }

    public static void main(String args[]) {
        B b = new B();
        b.display(); // Calls the display method of class B
        b.callSuperDisplay(); // Calls the display method of class A using super
    }

    void callSuperDisplay() {
        super.display(); // Calls the display method of class A
    }
}
