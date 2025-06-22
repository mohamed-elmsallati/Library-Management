import java.util.Scanner;

// Main class to run the Library Management System
public class Main {

    public static void main(String[] args) {
        // Create a new Library instance
        Library library = new Library();
        boolean running = true;

        // Main loop for user interaction
        while (running) {
            displayMenu();
            
            // Get user choice from menu
            int choice = getScanner().nextInt();

            switch (choice) {
                case 1:
                    // Add a new Book
                    System.out.println("Enter Book Title:");
                    String bookTitle = getScanner().next();
                    System.out.println("Enter Book Author:");
                    String bookAuthor = getScanner().next();
                    System.out.println("Enter Book ISBN:");
                    int bookIsbn = getScanner().nextInt();
                    Book book = new Book(bookTitle, bookAuthor, bookIsbn);
                    library.addBook(book);
                    break;
                    
                case 2:
                    // Add a new EBook, possibly from an existing Book
                    System.out.println("do you want to add an EBook from an already existing book? (yes/no)");
                    String response = getScanner().next();
                    if (response.equalsIgnoreCase("yes")) {
                        System.out.println("Enter the ISBN of the existing book:");
                        int existingIsbn = getScanner().nextInt();
                        Book existingBook = null;
                        // Search for the existing book by ISBN
                        for (Book b : library.getBooks()) {
                            if (b.getIsbn() == existingIsbn) {
                                existingBook = b;
                                break;
                            }
                        }
                        if (existingBook != null) {
                            System.out.println("Enter EBook File Size:");
                            double fileSize = getScanner().nextDouble();
                            EBook eBook = new EBook(existingBook.getTitle(), existingBook.getAuthor(), existingBook.getIsbn(), fileSize);
                            library.addEBook(eBook);
                        } else {
                            System.out.println("No book found with that ISBN.");
                        }
                    } 
                    else {
                        // Add a new EBook with user input
                        System.out.println("Enter EBook Title:");
                        String eBookTitle = getScanner().next();
                        System.out.println("Enter EBook Author:");
                        String eBookAuthor = getScanner().next();
                        System.out.println("Enter EBook ISBN:");
                        int eBookIsbn = getScanner().nextInt();
                        System.out.println("Enter EBook File Size:");
                        double eFileSize = getScanner().nextDouble();
                        EBook eBook = new EBook(eBookTitle, eBookAuthor, eBookIsbn, eFileSize);
                        library.addBook(eBook);
                        library.addEBook(eBook);
                    }
                    break;
                
                case 3:
                    // Borrow a book by ISBN
                    library.listBooks();
                    System.out.println("Enter the ISBN of the book you want to borrow:");
                    int borrowIsbn = getScanner().nextInt();
                    library.borrowBook(borrowIsbn);
                    break;
                
                case 4:
                    // Return a borrowed book by ISBN
                    library.listBooks();
                    System.out.println("Enter the ISBN of the book you want to return:");
                    library.returnBook(getScanner().nextInt());
                    break;
                case 5:
                    // List all books and eBooks
                    library.listBooks();
                    library.listEBooks();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Thank you for using the Library Management System!");
                    running = false;
                    return;
                default:
                    // Handle invalid menu choice
                    System.out.println("Invalid choice. Please try again.");
                    main(args);
                    return;
            }
        }
    }

    // Display the main menu options
    public static void displayMenu() {
        System.out.println("Welcome to the Library Management System!");
        System.out.println("1. Add a Book");
        System.out.println("2. Add an EBook");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. List all Books and EBooks");
        System.out.println("6. Exit");
        System.out.print("Please enter your choice: ");
    }

    // Get a new Scanner instance for user input
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
