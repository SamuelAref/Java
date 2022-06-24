public class BookStorage {

    private String bookName;
    private String bookAuthor;

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookName(String BookName) {
        bookName = BookName;
    }

    public void setBookAuthor(String BookAuthor) {
        bookAuthor = BookAuthor;
    }

    // Default Constructor
    BookStorage() {
    }

    BookStorage(String BookName, String BookAuthor) {
        setBookName(BookName);
        setBookAuthor(BookAuthor);
    }

}
