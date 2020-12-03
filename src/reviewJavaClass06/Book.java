package reviewJavaClass06;

public class Book {
    private String bookName, title, author, ISBN;
    private int year;
    private boolean isAvailable;

    public Book(String bookName, String title, String author, String ISBN, int year, boolean isAvailable) {
        this.bookName = bookName;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
