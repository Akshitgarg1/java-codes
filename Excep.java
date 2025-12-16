import java.util.Scanner;
class MyException extends Exception
{
    public String getMessage(){
        return "you can write only india";

    }
}
class Excep
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        try{
            if( !s.equals("india")){
                throw new MyException();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("exception handled !");
        
    }
}