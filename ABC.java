import java.io.*;

public class ABC {
    public static void main(String a[]) {
        try {
            FileWriter f = new FileWriter("myfile.txt");
            String sent[] = {"akshit", "garg", "is", "my", "name"};
            for (String x : sent) f.write(x + " ");
            f.close();
            System.out.println("Writing to file completed");
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Vowels in \"" + line + "\": " + extractVowels(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading from file");
            e.printStackTrace();
        }
    }

    public static String extractVowels(String str) {
        StringBuilder vowel = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) vowel.append(ch);
        }
        return vowel.toString();
    }
}
