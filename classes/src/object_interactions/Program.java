package object_interactions;

public class Program
{
    public static void main(String[] args)
    {
        //create a user
        User me = new User("books4me", "Josh Archer");

        //create a shelf for the user with books
        BookShelf shelf = new BookShelf();

        //create a few books
        Book book1 = new Book("213412341234", "IT", "Stephen King");
        Book book2 = new Book("243324234326", "Fellowship of the Ring", "J.R.R. Tolkien");
        Book book3 = new Book("453453453455", "Hunger Games", "Suzanne Collins");

        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);

        //we should have a total of 11 books possibly
        //added to the shelf
        for (int i = 1; i <= 8; i++)
        {
            shelf.addBook(book1);
        }

        System.out.println("This is " + me.getUsername() + "'s bookshelf.");
        shelf.printShelf();
    }
}
