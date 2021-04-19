package src;
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private LocalDate dateAdded;
    private int numPages;
    private boolean read;

    public Book() {
        title = "";
        author = "";
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

    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.author.compareTo(other.author);
        }
        return result;
    }
}