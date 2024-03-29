package decomposition;

import java.util.Scanner;

public class MyConsoleProgram {
    public static void main(String[] args) {
        //this allows us to read user input
        Scanner console = new Scanner(System.in);

        //welcome the user to our program
        System.out.println("Welcome to my program!");
        System.out.println("----------------------");

        //show the user a menu
        System.out.println("1. Print my favorite word");
        System.out.println("2. Print my favorite movie");
        System.out.println("3. Print my pet names");
        System.out.println("4. Do nothing (exit)");

        int choice = console.nextInt();
        if (choice == 1) {
            System.out.println("Bedazzle");
        }
        else if (choice == 2) {
            System.out.println("John Wick");
        }
        else if (choice == 3) {
            System.out.println("Fluffy");
            System.out.println("Ender");
            System.out.println("Beauregard");
        }
        else if (choice == 4) {
            //say goodbye
            System.out.println("Thanks for using my program!");
            System.out.println("----------------------------");
        }
        else {
            System.out.println("I don't understand your input!");
        }
    }
}

