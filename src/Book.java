// Represents a physical book in the library system
public class Book {
    // Title of the book
    private String title;
    // Author of the book
    private String author;
    // ISBN (International Standard Book Number) as an integer
    private int isbn;
    // Status indicating if the book is currently borrowed
    private boolean isBorrowed;

    // Book constructor
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Get the book's title
    public String getTitle() {
        return title;
    }
    // Get the book's author
    public String getAuthor() {
        return author;
    }
    // Get the book's ISBN
    public int getIsbn() {
        return isbn;
    }
    // Is the book borrowed?
    public boolean isBorrowed() {
        return isBorrowed;
    }
    // Mark the book as borrowed
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("Book is already checked out.");
        }
    }
    // Mark the book as returned
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("Book was not checked out.");
        }
    }
}
