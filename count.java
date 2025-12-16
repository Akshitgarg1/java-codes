class ObjectCounter {
    private static int count = 0;

    public ObjectCounter() {
        count++;
    }

    public void show() {
        System.out.println("Total number of objects created: " + count);
    }
}

class Count {
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        obj1.show(); // Display total number of objects created
    }
}
