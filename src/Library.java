import java.util.ArrayList;

public class Library {
    // List of physical books
    private ArrayList<Book> physicalBooks;
    // List of digital books
    private ArrayList<EBook> digitalBooks;

    // Library constructor
    public Library() {
        physicalBooks = new ArrayList<>();
        digitalBooks = new ArrayList<>();
    }

    // Add a physical book
    public void addPhysicalBook(Book b) {
        physicalBooks.add(b);
    }

    // Add a digital book
    public void addDigitalBook(EBook eb) {
        digitalBooks.add(eb);
    }

    // Borrow a book by ID
    public void borrowBook(int id) {
        for (Book b : physicalBooks) {
            if (b.getIsbn() == id && !b.isBorrowed()) {
                b.borrow();
                System.out.println("Borrowed: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already checked out.");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (Book b : physicalBooks) {
            if (b.getIsbn() == id && b.isBorrowed()) {
                b.returnBook();
                System.out.println("Returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not checked out.");
    }

    // Getters for lists
    public ArrayList<Book> getPhysicalBooks() {
        return physicalBooks;
    }
    public ArrayList<EBook> getDigitalBooks() {
        return digitalBooks;
    }
}
