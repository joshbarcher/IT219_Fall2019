package object_interactions;

public class BookShelf
{
    private static final int MAX_SIZE = 20;
    private Book[] shelf;
    private int nextSpot; //defaults to zero...

    public BookShelf()
    {
        shelf = new Book[MAX_SIZE];
    }

    public boolean addBook(Book book)
    {
        //add the book to the shelf
        if (nextSpot < shelf.length)
        {
            shelf[nextSpot] = book;
            nextSpot++;
            return true; //success!
        }
        else
        {
            return false; //unsuccessful!
        }
    }

    public void printShelf()
    {
        for (int i = 0; i < shelf.length; i++)
        {
            if (shelf[i] != null)
            {
                System.out.println(shelf[i]);
            }
        }
    }
}
