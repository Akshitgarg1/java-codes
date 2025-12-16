import java.util.Scanner;
public class Matrix {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers of rows and columns:");
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int m1[][]=new int[rows][cols];
    int m2[][]=new int[rows][cols];
    int sum[][]=new int[rows][cols];
    System.out.println("enter elements of first matrix:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            m1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter elements of matrix 2:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            m2[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            sum[i][j]=m1[i][j]+m2[i][j];
        }

    }
    System.out.println("result:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }


 }   
}
