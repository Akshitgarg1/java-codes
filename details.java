import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Details {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Employee details:");
        System.out.println("Enter number of employees:");
        int n = Integer.parseInt(br.readLine());
        
        String[] names = new String[n];
        int[] ids = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            names[i] = br.readLine();
            
            System.out.println("Enter id:");
            ids[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Details are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s, %d%n", names[i], ids[i]);
        }
    }
}
