import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Library {
    private String id;
    private String author;
    private String name;
    private String price;
    private String search;

    private static final String FILENAME = "bookData.txt";

    private boolean isValidPrice(String price) {
        return price.matches("\\d+");
    }

    private void addBookToFile() {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(FILENAME, true))) {
            fileWriter.write(id + "*" + name + "*" + author + "*" + price + "\n");
            System.out.println("Book added successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private void createFileIfNeeded() {
        File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Created new file: " + FILENAME);
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        }
    }

    public void addBooks() {
        createFileIfNeeded();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID:");
        id = scanner.nextLine();
        System.out.println("Enter Book Name:");
        name = scanner.nextLine();
        System.out.println("Enter Author Name:");
        author = scanner.nextLine();
        System.out.println("Enter Book Price:");
        price = scanner.nextLine();

        if (isValidPrice(price)) {
            addBookToFile();
        } else {
            System.err.println("Invalid price entered. Please enter a numeric value.");
        }
    }

    public void showAllBooks() {
        createFileIfNeeded();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME))) {
            System.out.printf("%-15s%-30s%-30s%-10s%n", "BOOK ID", "BOOK NAME", "BOOK'S AUTHOR", "PRICE");
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] data = line.split("\\*");
                System.out.printf("%-15s%-30s%-30s%-10s%n", data[0], data[1], data[2], data[3]);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public void extractBooks() {
        createFileIfNeeded();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID:");
        search = scanner.nextLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            boolean found = false;
            while ((line = fileReader.readLine()) != null) {
                String[] data = line.split("\\*");
                if (search.equals(data[0])) {
                    System.out.printf("%-15s%-30s%-30s%-10s%n", "BOOK ID", "BOOK NAME", "BOOK'S AUTHOR", "PRICE");
                    System.out.printf("%-15s%-30s%-30s%-10s%n", data[0], data[1], data[2], data[3]);
                    System.out.println("Book extracted successfully.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Book not found.");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public void showMenu() {
        System.out.println("----------------------------");
        System.out.println("1. Show all books");
        System.out.println("2. Extract book by ID");
        System.out.println("3. Add books (ADMIN)");
        System.out.println("4. Exit");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Library obj = new Library();
        char choice;
        Scanner input = new Scanner(System.in);

        do {
            obj.showMenu();
            System.out.println("Enter your choice:");
            choice = input.next().charAt(0);
            input.nextLine(); // consume newline character

            switch (choice) {
                case '1':
                    obj.showAllBooks();
                    break;
                case '2':
                    obj.extractBooks();
                    break;
                case '3':
                    obj.addBooks();
                    break;
                case '4':
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}
