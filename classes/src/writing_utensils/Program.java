package writing_utensils;

public class Program
{
    public static void main(String[] args)
    {
        //instantiate a new Pencil object
        Pencil myPencil = new Pencil("mechanical", "gray",
                true, 0.7);

        //access and change our field values
        System.out.println(myPencil.color.toUpperCase());
        myPencil.size = 0.5;
        System.out.println("Size of the pencil is " + myPencil.size);

        //create another pencil
        Pencil pencil = new Pencil();

        System.out.println(pencil.color.toUpperCase());
        pencil.size = 0.5;
        System.out.println("Size of the pencil is " + pencil.size);
    }
}
