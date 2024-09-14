/*
You are tasked with implementing a basic library system in Java. The program should allow users to add books to the library, borrow books, and return books. The system maintains a record of the available quantity of each book.

Question:

Write a Java program that accomplishes the following tasks:

1. Implement the following options:

Add Books
Borrow Books
Return Books
Exit
2.     For "Add Books":

Prompt the user to enter the book title, author, and quantity.
If the book already exists in the library, update the quantity.
If the book is new, add it to the library.
3.     For "Borrow Books":

Prompt the user to enter the book title and the number of books to borrow.
Check if the requested number of books is available in the library.
If the books are available, update the quantity and display a success message.
If not, display an error message.
4.     For "Return Books":

Prompt the user to enter the book title and the number of books to return.
Check if the books being returned belong to the library system.
If they do, update the quantity and display a success message.
If not, display an error message.
5.     Handle invalid input and display appropriate error messages.

6.     Implement an exit option to allow the user to exit the program.


Remember to use appropriate variable names and follow coding best practices.

Submit the assignment in MS Word or PDF file format. Your submission should contain the program code, explanation, and output screenshot
This assignment will be assessed by your instructor using the rubric below
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String, Integer> bookQuantity;

    public Main() {
        bookQuantity = new HashMap<>();

    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the archives.");
            System.out.println("What would you like to do?");
            System.out.println("1) Add a book to the archive?");
            System.out.println("2) Borrow a book?");
            System.out.println("3) Return a book?");
            System.out.println("4) Exit?");

            int selection = scanner.nextInt();

            switch (selection){
                case 1 -> addBooks(scanner);
                case 2 -> borrowBooks(scanner);
                case 3 -> returnBooks(scanner);
                case 4 -> {System.out.println("exiting the program");
                    return;
                }
                default -> System.out.println("Im sorry, I didn't quite get that... try again");
            }
        }
    }

    // UPDATE
    private void addBooks(Scanner scanner) {
        /*
         For "Add Books": Prompt the user to enter the book title, author, and quantity.
        If the book already exists in the library, update the quantity.
        If the book is new, add it to the library.
         */
        System.out.println("Add a book?");

        System.out.println("Enter the books title:");
        String title = scanner.next();

        System.out.println("Enter the authors name:");
        String author  = scanner.next();

        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();

        if (bookQuantity.containsKey(title)){
            int currentQuantity = bookQuantity.get(title);
            bookQuantity.put(title, currentQuantity + quantity);
            System.out.println("Book updated successfully!");
        } else {
            bookQuantity.put(title, quantity);
            System.out.println("Book added successfully!");
        }
    }

//    3.     For "Borrow Books":
//
//    Prompt the user to enter the book title and the number of books to borrow.
//            Check if the requested number of books is available in the library.
//    If the books are available, update the quantity and display a success message.
//    If not, display an error message.

    private void borrowBooks(Scanner scanner){
        System.out.println("Enter the title and the number of books you wish to borrow:");

        System.out.println("Enter the books title:");
        String title = scanner.next();

        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();

        if (bookQuantity.containsKey(title)){
            int currentQuantity = booksQuantity.get(title);
                    books.get(quantity);
            System.out.println();

        } else {
            // enter error book not found in the library
        }
    }


    public static void main(String[] args) {


    }


}