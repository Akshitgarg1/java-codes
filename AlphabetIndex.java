import java.util.Scanner;

public class AlphabetIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert the input string to lowercase to handle both cases
        input = input.toLowerCase();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Calculate the index of the character in the alphabet
                int index = ch - 'a' + 1;
                // Print the character and its index
                System.out.println("Character: " + ch + ", Index: " + index);
            } else {
                // If the character is not a letter, print an appropriate message
                System.out.println("Character: " + ch + " is not a letter in the alphabet");
            }
        }

        scanner.close();
    }
}
