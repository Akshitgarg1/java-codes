import java.io.*;
import java.util.Scanner;
class File1{
    public static void main(String[] args) {
        try{
        FileWriter f = new FileWriter("myfile.txt");
        f.write("is my name");
        f.close();
        System.out.println("successfully written");
        
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}