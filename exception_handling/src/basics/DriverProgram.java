package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverProgram
{
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        double num = getDoubleFromConsole();
        double den = getDoubleFromConsole();

        try
        {
            System.out.println(CalculatorModule.divide(num, den));
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Do something after dividing...");
    }

    public static double getDoubleFromConsole()
    {
        double number = 0;

        boolean badInput = true;
        while (badInput)
        {
            try
            {
                System.out.print("Enter a number: ");
                number = console.nextDouble();
                badInput = false;
            }
            catch (InputMismatchException ex)
            {
                console.nextLine(); //clear the buffer
                System.out.println("User input not recognized as a number!");
            }
        }

        return number;
    }
}
