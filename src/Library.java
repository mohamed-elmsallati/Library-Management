import java.util.ArrayList;

public class Library {
    // List to store physical books
    private ArrayList<Book> Books = new ArrayList<Book>();
    // List to store electronic books
    private ArrayList<EBook> EBooks = new ArrayList<EBook>();

    // Constructor initializes the book lists
    public Library() {
        Books = new ArrayList<Book>();
        EBooks = new ArrayList<EBook>();
    }

    // Add a physical book to the library
    public void addBook(Book book) {
        Books.add(book);
    }

    // Add an eBook to the library
    public void addEBook(EBook eBook) {
        EBooks.add(eBook);
    }

    // Borrow a book by its ISBN if available
    public void borrowBook(int isbn) {
        for (Object book : Books) {
            // Check if ISBN matches and book is not borrowed
            if (((Book) book).getIsbn() == isbn && !((Book) book).isBorrowed()) {
                ((Book) book).borrow();
                System.out.println("You have borrowed: " + ((Book) book).getTitle());
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    // Return a borrowed book by its ISBN
    public void returnBook(int isbn) {
        for (Object book : Books) {
            if (((Book) book).getIsbn() == isbn && ((Book) book).isBorrowed()) {
                ((Book) book).returnBook();
                System.out.println("You have returned: " + ((Book) book).getTitle());
                return;
            }
        }
        System.out.println("Book not found or was not borrowed.");
    }

    // Get the list of physical books
    public ArrayList<Book> getBooks() {
        return Books;
    }

    // Get the list of eBooks
    public ArrayList<EBook> getEBooks() {
        return EBooks;
    }

    // Print all physical books in the library
    public void listBooks() {
        System.out.println("Books in the library:");
        for (Object book : Books) {
            System.out.println(book);
        }
    }

    // Print all eBooks in the library
    public void listEBooks() {
        System.out.println("EBooks in the library:");
        for (Object eBook : EBooks) {
            System.out.println(eBook);
        }
    }
}
