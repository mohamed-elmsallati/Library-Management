import java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<EBook> EBooks = new ArrayList<EBook>();

    public Library() {
        Books = new ArrayList<Book>();
        EBooks = new ArrayList<EBook>();
    }

    public void addBook(Book book) {
        Books.add(book);
    }

    public void addEBook(EBook eBook) {
        EBooks.add(eBook);
    }

    public void borrowBook(int isbn) {
        for (Object book : Books) {
            if (((Book) book).getIsbn() == isbn && !((Book) book).isBorrowed()) {
                ((Book) book).borrow();
                System.out.println("You have borrowed: " + ((Book) book).getTitle());
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

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

    public ArrayList<Book> getBooks() {
        return Books;
    }

    public ArrayList<EBook> getEBooks() {
        return EBooks;
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Object book : Books) {
            System.out.println(book);
        }
    }

    public void listEBooks() {
        System.out.println("EBooks in the library:");
        for (Object eBook : EBooks) {
            System.out.println(eBook);
        }
    }
}
