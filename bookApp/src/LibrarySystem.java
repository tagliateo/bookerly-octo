import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {
    private Map<String, Integer> bookQuantity;

    public LibrarySystem() {
        bookQuantity = new HashMap<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. See All Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException("THERE WAS AN ERROR.... PLEASE TRY AGAIN " + e);
            }

            switch (choice) {
                case 1 -> addBooks(scanner);
                case 2 -> borrowBooks(scanner);
                case 3 -> returnBooks(scanner);

                case 4 -> getAllBooks(scanner);
                case 5 -> {
                    System.out.println("Exiting the program...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void getAllBooks(Scanner scanner) {
        System.out.println("retrieving all books...");

        for (String i : bookQuantity.keySet()) {
            System.out.println("title: " + i + " quantity: " + bookQuantity.get(i));
        }
    }

    private void addBooks(Scanner scanner) {
        System.out.print("Enter the book title: ");
        String title = scanner.next();

        System.out.print("Enter the author: ");
        String author = scanner.next();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        if (bookQuantity.containsKey(title)) {
            int currentQuantity = bookQuantity.get(title);
            bookQuantity.put(title, currentQuantity + quantity);
            System.out.println("Book updated successfully!");
        } else {
            bookQuantity.put(title, quantity);
            System.out.println("Book added successfully!");
        }
    }

    private void borrowBooks(Scanner scanner) {
        System.out.print("Enter the book title: ");
        String title = scanner.next();

        System.out.print("Enter the number of books to borrow: ");
        int quantityToBorrow = scanner.nextInt();

        if (bookQuantity.containsKey(title)) {
            int currentQuantity = bookQuantity.get(title);
            if (currentQuantity >= quantityToBorrow) {
                bookQuantity.put(title, currentQuantity - quantityToBorrow);
                System.out.println("Books borrowed successfully!");
            } else {
                System.out.println("Not enough books available. Please try again.");
            }
        } else {
            System.out.println("Book not found in the library. Please try again.");
        }
    }

    private void returnBooks(Scanner scanner) {
        System.out.print("Enter the book title: ");
        String title = scanner.next();

        System.out.print("Enter the number of books to return: ");
        int quantityToReturn = scanner.nextInt();

        if (bookQuantity.containsKey(title)) {
            int currentQuantity = bookQuantity.get(title);
            if (currentQuantity >= quantityToReturn) {
                bookQuantity.put(title, currentQuantity + quantityToReturn);
                System.out.println("Books returned successfully!");
            } else {
                System.out.println("You do not have that many books to return. Please try again.");
            }
        } else {
            System.out.println("Book not found in the library. Please try again.");
        }
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.run();
    }
}