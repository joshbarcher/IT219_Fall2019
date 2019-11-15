package examples;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int pages;

    public Book(String isbn) {
        lookupBook(isbn);
    }

    private void lookupBook(String isbn) {
        //lookup book and assign fields...
    }

    public String getDescription() {
        return "(" + isbn + ") " + title +
                " by " + author;
    }
}

