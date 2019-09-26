package consoleio;

import java.util.Scanner;

public class PetsProgram
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of pets you own: ");
        int numPets = reader.nextInt();

        System.out.println("Enter your name: ");
        String fullName = reader.nextLine();

        System.out.println("Thanks for playing " + fullName + "!");
        System.out.println("You own " + numPets + " pets");
    }
}
