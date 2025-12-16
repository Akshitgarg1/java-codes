import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class Q2 {
    public static void main(String[] args) {
        try {
            String filename = "numbers.txt";
            createFileIfNotExists(filename);
            readNumbersFromFile(filename);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (OddNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void createFileIfNotExists(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created: " + filename);
        }
    }

    public static void readNumbersFromFile(String filename) throws IOException, OddNumberException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(",");
                for (String num : numbers) {
                    int number = Integer.parseInt(num.trim());
                    if (number % 2 == 0) {
                        System.out.println("Even number: " + number);
                    } else {
                        throw new OddNumberException("Odd number encountered: " + number);
                    }
                }
            }
        }
    }
}
