/*
    This is an example of user input on the console.
    Author: Josh Archer
    Date: 9/25/2019
    File: ConsoleInput.java
 */

package consoleio;

import java.util.Scanner;

public class ConsoleInput
{
    public static void main(String[] args)
    {
        //get a reader for the console
        Scanner consoleReader = new Scanner(System.in);

        //get user inputs
        System.out.print("Please enter your name: ");
        String name = consoleReader.nextLine();

        System.out.println("How many programming languages do you know " +
                           "(integer)?");
        int progLanguages = consoleReader.nextInt();

        System.out.println("Do you have a pet (true/false)?");
        boolean ownsPet = consoleReader.nextBoolean();

        //print some output for the user
        System.out.println("Hello " + name);
        System.out.println("You program in " + progLanguages +
                           "!");
        System.out.println("Do you have a pet? " + ownsPet);
    }
}
