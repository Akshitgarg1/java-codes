import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hi
{
    public static void main(String [] args) throws IOException 
    {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter your name:");
        String str=br.readLine();
        System.out.println("welcome "+str);
        }
    }
