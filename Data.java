import java.util.Scanner;
/**
 * Data
 */
class Staff {
    protected int code;
    protected String name;
    public void getdata()
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter code:");
        code=sc.nextInt();
        System.out.println(:enter name:);
        name=sc.next();
        

    }
    public void showdata()
    {
        System.out.println("code:"+code);
        System.out.println("name:"+name);

    }


    
}
class Teacher extends Staff
{
    private String subject;
    private String publication;

    public void getdata(){
    super.getdata();
    System.out.println("enter subject:");
    subject=sc.next();
    System.out.println("enter publication:");
    publication=sc.next();
    }
    public void show data()
    {
        super.showdata();
        System.out.println("subject:"+subject);
        System.out.println("publication:"+publication);
    }

}