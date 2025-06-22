public class EBook extends Book {
    private double fileSize; 

    public EBook(String title, String author, int isbn, double fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

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
