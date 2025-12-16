class Student {
    private int ID;
    private String name;
    private String branch;
    private String city;
    private String university;

    // Constructor with one argument
    public Student(int ID) {
        this(ID, "", "", "", "");
    }

    // Constructor with two arguments
    public Student(int ID, String name) {
        this(ID, name, "", "", "");
    }

    // Constructor with three arguments
    public Student(int ID, String name, String branch) {
        this(ID, name, branch, "", "");
    }

    // Constructor with four arguments
    public Student(int ID, String name, String branch, String city) {
        this(ID, name, branch, city, "");
    }

    // Constructor with five arguments
    public Student(int ID, String name, String branch, String city, String university) {
        this.ID = ID;
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.university = university;
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    // toString method to represent the Student object as a string
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
class Mainp {
    public static void main(String[] args) {
        // Creating Student objects using different constructors
        Student student1 = new Student(101);
        Student student2 = new Student(102, "John");
        Student student3 = new Student(103, "Alice", "Computer Science");
        Student student4 = new Student(104, "Bob", "Electrical Engineering", "New York");
        Student student5 = new Student(105, "Emily", "Mechanical Engineering", "Los Angeles", "XYZ University");

        // Printing details of each student
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Student 4: " + student4);
        System.out.println("Student 5: " + student5);

        // Modifying details of a student
        student1.setName("Mike");
        student1.setBranch("Information Technology");
        student1.setCity("Chicago");
        student1.setUniversity("ABC University");

        // Printing modified details of the student
        System.out.println("\nModified details of Student 1: " + student1);
    }
}
