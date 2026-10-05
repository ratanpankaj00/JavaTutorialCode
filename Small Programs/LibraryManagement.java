import java.util.Scanner;

class Library {
    Scanner scan = new Scanner(System.in);
    private int code;
    private int numberOfBooksAvailable = 0;
    private int maxBook = 100;
    private String[] availBooks = new String[maxBook];

    public void addBook() {
        String addBook = "YOUR-BOOK-NAME";
        boolean b = true;
        while (b) {
            System.out.print("Enter Name of Book (Enter 'EXIT' to exit): ");
            addBook = scan.nextLine();
            if (addBook.equalsIgnoreCase("EXIT")) {
                b = false;
                System.out.println();
                break;
            } else {
                availBooks[numberOfBooksAvailable] = addBook;
                numberOfBooksAvailable++;
                System.out.println("Book added successfully.");
            }
        }
    }

    public void showAvailableBooks() {
        for (int j = 0; j < numberOfBooksAvailable; j++) {
            System.out.println(availBooks[j] + " (Code: " + j + ")");
        }
        System.out.print("Total Available Books: " + numberOfBooksAvailable + "\n");
    }

    public void issueBook() {
        System.out.println("Enter Code to Issue Book.");
        code = scan.nextInt();
        if (availBooks[code].endsWith("(Issued Book)")) {
            System.out.println("This book is not available.");
        } else {
            System.out.println("Book has been issued successfully.");
            availBooks[code] = availBooks[code] + "(Issued Book)";
        }

    }

    public void returnBook() {
        System.out.println("Enter Code to Return Book.");
        code = scan.nextInt();
        if (availBooks[code].endsWith("(Issued Book)")) {
            System.out.println("Book return is Successful.");
            int a = availBooks[code].indexOf("Issued Book");
            availBooks[code] = availBooks[code].substring(0, a - 1);
        } else {
            System.out.println("Book is Already in the Library.");
        }
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // You have to implement a library using JAVA Class Library.
        // Methods: addBooks, issueBooks, returnBook, showAvailableBooks
        // Properties : Array to store the available books
        // Array to store issued books.
        Library lib = new Library();
        boolean bool = true;
        while (bool) {
            System.out.println(
                    "--------------------------------------------------------------------------------------------------");
            System.out.println(
                    "| Add-Book(Press 1) | Show-Available-Books(Press 2) | Issue-Book(Press 3) | Return-Book(Press 4) |");
            System.out.println(
                    "--------------------------------------------------------------------------------------------------");
            System.out.print("Input: ");
            String userInput = scan.next();

            if (userInput.equals("1")) {
                lib.addBook();
            } else if (userInput.equals("2")) {
                lib.showAvailableBooks();
            } else if (userInput.equals("3")) {
                lib.issueBook();
            } else if (userInput.equals("4")) {
                lib.returnBook();
            } else if (userInput.equalsIgnoreCase("EXIT")) {
                System.out.println("ThankYou! Come Back Soon.");
                bool = false;
            } else {
                System.out.println("Enter Valid Code.");
                continue;
            }
        }

    }

}