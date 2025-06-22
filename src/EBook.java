// Represents a digital book, inheriting from Book
public class EBook extends Book {
    // Size in MB
    private double fileSize;

    // EBook constructor
    public EBook(String name, String writer, int id, double fileSize) {
        super(name, writer, id);
        this.fileSize = fileSize;
    }

    // Get the size in MB
    public double getfileSize() {
        return fileSize;
    }

    // Set the size in MB
    public void set(double fileSize) {
        this.fileSize = fileSize;
    }

    // Custom string output for EBook
    @Override
    public String toString() {
        return "EBook{" +
                "name='" + getTitle() + '\'' +
                ", writer='" + getAuthor() + '\'' +
                ", id=" + getIsbn() +
                ", checkedOut=" + isBorrowed() +
                ", fileSize=" + fileSize +
                '}';
    }
}
