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

import textio.TextIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private Map<String, Integer> bookQuantity;
    public LibrarySystem() {
        bookQuantity = new HashMap<>();
        textIO = new TextIO();
    }

    public void menu(){
        while(true){
            System.out.println("Welcome to the archives.");
            System.out.println("What would you like to do?");
            System.out.println("1) Add a book to the archive?");
            System.out.println("2) Borrow a book?");
            System.out.println("3) Return a book?");
            System.out.println("4) Exit?");

            int selection = getSelection();

            switch (selection){
                case 1 -> addBooks();
                case 2 -> borrowBooks();
                case 3 -> returnBooks();
                case 4 -> System.out.println("exiting the program");return;
                default -> System.out.println("Im sorry, I didn't quite get that... try again");
            }
        }
    }

    // handle user selection
    private int getSelection(){
        int selection;

        while (true){
            try {
                selection = TextIO.getlnInt("Enter your choice: ");
                if (selection < 1 || selection > 4){
                    System.out.println("Im sorry, I didn't quite get that... try again");
                } else {
                    return selection;
                }
            } catch (Exception e){
                System.out.println("Computer is hung up on thinking ... There appears to be a problem");
            }
        }
    }

    // UPDATE
    private void addBooks() {
        /*
         For "Add Books": Prompt the user to enter the book title, author, and quantity.
        If the book already exists in the library, update the quantity.
        If the book is new, add it to the library.
         */


        /* intitializing Getter and Setters    */

        String title = getTitle();
        String author = getAuthor();
        int quantity = getQuantity();

        System.out.println("Add a book?");
        userInput = TextIO.getlnWord();


//        books.add("hello");
    }


    public static void main(String[] args) {

        addBooks();

    }


}