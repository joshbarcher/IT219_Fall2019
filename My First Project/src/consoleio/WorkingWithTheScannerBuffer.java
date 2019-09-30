package consoleio;

import java.util.Scanner;

public class WorkingWithTheScannerBuffer
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of pets you own: ");
        int numPets = reader.nextInt();
        reader.nextLine(); //clear the new line in the scanner buffer

        System.out.print("Enter your name: ");
        String fullName = reader.nextLine();

        System.out.println("Thanks for playing " + fullName + "!");
        System.out.println("You own " + numPets + " pets");

    }
}
