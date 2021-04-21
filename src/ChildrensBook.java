public class ChildrensBook extends Book {
    private String illustrator;

    public ChildrensBook() {
        super();
        illustrator = "No illustrator";
    }

    public ChildrensBook(String title, String author, String dateAdded, int numPages, boolean read, String illustrator) {
        super(title, author, dateAdded, numPages, read);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ", Illustrator: " + illustrator;
        return result;
    }

}
