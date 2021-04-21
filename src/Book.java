import java.time.LocalDate;
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private LocalDate dateAdded;
    private int numPages;
    private boolean read;

    public Book() {
        title = "No title";
        author = "No author";
        dateAdded = LocalDate.now();
        numPages = 0;
        read = false;
    }

    public Book(String title, String author, String dateAdded, int numPages, boolean read) {
        this.title = title;
        this.author = author;
        this.dateAdded = Helpers.convertStrToDate(dateAdded);
        this.numPages = numPages;
        this.read = read;
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = Helpers.convertStrToDate(dateAdded);
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String toString() {
        String result = "";
        result += "Title: " + title;
        result += ", Author: " + author;
        return result;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.author.compareTo(other.author);
        }
        return result;
    }
}