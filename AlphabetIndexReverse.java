import java.util.Scanner;

public class AlphabetIndexReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter indices
        System.out.println("Enter the indices (space-separated):");
        String input = scanner.nextLine();

        // Split the input string by spaces to get individual indices
        String[] indices = input.split(" ");

        StringBuilder result = new StringBuilder();

        // Loop through each index and convert to the corresponding alphabet character
        for (String indexStr : indices) {
            try {
                int index = Integer.parseInt(indexStr);

                // Check if the index is within the valid range (1 to 26)
                if (index >= 1 && index <= 26) {
                    char ch = (char) ('a' + index - 1);
                    result.append(ch);
                } else {
                    System.out.println("Index out of range: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + indexStr);
            }
        }

        // Print the resulting string
        System.out.println("Converted string: " + result.toString());

        scanner.close();
    }
}
