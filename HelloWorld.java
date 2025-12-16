import java.util.*;
class HelloWorld
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            /*System.out.println("enter your name:");
            String name=sc.nextLine();
            System.out.println("your name is ::" + name);
            System.out.println("-------------------------");
            System.out.println("enter your age:");
            int age=sc.nextInt();
            if(age>18)
            {
                System.out.println("you are adult "+name);
            }
            else
            {
                System.out.println("you are kid "+name);
            }*/

            
            //calculator
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("enter operator(+,-,*,/,%)");
        String operator = sc.next();
        int c = 0; // Declare c outside switch
        switch (operator) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            case "%":
                c = a % b;
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("The result is: " + c);
        sc.close();
    }
}
