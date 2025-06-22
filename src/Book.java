// Class representing a physical book in the library
public class Book {
    // Title of the book
    private String title;
    // Author of the book
    private String author;
    // ISBN (International Standard Book Number) as an integer
    private int isbn;
    // Status indicating if the book is currently borrowed
    private boolean isBorrowed;

    // Constructor to initialize a Book object
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    // Getter for the book's title
    public String getTitle() {
        return title;
    }
    // Getter for the book's author
    public String getAuthor() {
        return author;
    }
    // Getter for the book's ISBN
    public int getIsbn() {
        return isbn;
    }
    // Check if the book is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }
    // Borrow the book if it is not already borrowed
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }
    // Return the book if it was borrowed
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    // Setter for the book's title
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter for the book's author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Setter for the book's ISBN
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    // String representation of the Book object
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
