import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class sort {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter word:");
        String input =br.readLine();
        String sortedString = sorted(input);
        System.out.println("Original string: " + input);
        System.out.println("String in alphabetical order: " + sortedString);
    }

    public static String sorted(String input) {
        // Convert string to char array
        char[] charArray = input.toCharArray();

        // Sort the char array
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        return sortedString;
    }
}
