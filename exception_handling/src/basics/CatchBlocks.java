package basics;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CatchBlocks
{
    public static void main(String[] args)
    {
        try
        {
            Scanner console = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int number = console.nextInt(); //<-- something can go wrong here...
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Please enter a valid integer");
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("This will never happen...");
        }
        catch (IllegalStateException ex)
        {
            System.out.println("Don't close your scanner and then use it silly!");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        System.out.println("The program continues to execute...");
    }
}
