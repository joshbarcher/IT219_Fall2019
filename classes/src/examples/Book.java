package examples;

/**
 * Represents a book with an isbn, title,
 * author and page count.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Book
{
    private String isbn;
    private String title;
    private String author;
    private int pages;

    /**
     * Creates a new book by isbn.
     * @param isbn the isbn of the new book
     */
    public Book(String isbn)
    {
        lookupBook(isbn);
    }

    private void lookupBook(String isbn)
    {
        //lookup book and assign fields...
    }

    /**
     * Returns a string representation of a
     * book.
     * @return a book string
     */
    public String getDescription()
    {
        return "(" + isbn + ") " + title +
                " by " + author;
    }
}

