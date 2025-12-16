import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count[]=new int[4];
        System.out.println("enter number of students:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter marks of student"+" "+(i+1)+":");
            int marks=sc.nextInt();
            if(marks>=81 && marks<=100)
            count[0]++;
            else if(marks>=61 && marks<=80)
            count[1]++;
            else if(marks>=41 && marks<=60)
            count[2]++;
            else
            count[3]++;
        }
        System.out.println("81-100:"+count[0]);
        System.out.println("61-80:"+count[1]);
        System.out.println("41-60:"+count[2]);
        System.out.println("0-40:"+count[3]);

    }
    
}
