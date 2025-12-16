import java.util.Scanner;
class p2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month no.:");
        int x=sc.nextInt();
        if(x==1 || x==3||x==5||x==7||x==8||x==10||x==12)
        System.out.println("31 days:");
        else if(x==4||x==6||x==9||x==11)
        System.out.println("30 days");
        else
        System.out.println("29 days");

    }
}