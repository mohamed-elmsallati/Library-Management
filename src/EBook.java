// Class representing an electronic book (EBook), which extends Book
public class EBook extends Book {
    // File size of the eBook in megabytes (MB)
    private double fileSize; 

    // Constructor to initialize an EBook object
    public EBook(String title, String author, int isbn, double fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    // Getter for the file size
    public double getFileSize() {
        return fileSize;
    }

    // Setter for the file size
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // String representation of the EBook object
    @Override
    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn=" + getIsbn() +
                ", isBorrowed=" + isBorrowed() +
                ", fileSize=" + fileSize +
                '}';
    }
    
}
