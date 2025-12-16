import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AcceptFromKeyboard
{
    public static void main(String []args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String name="";
        for(int i=0;i<2;i++)
        {
        System.out.println("Enter data:");
        name=br.readLine();
        System.out.println("data is :"+name);
        }

    }
}