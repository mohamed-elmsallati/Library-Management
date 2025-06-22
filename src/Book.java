public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getIsbn() {
        return isbn;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
