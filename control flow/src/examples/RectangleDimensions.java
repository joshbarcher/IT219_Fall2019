package examples;

import java.util.Scanner;

public class RectangleDimensions
{
    public static void main(String[] args)
    {
        //repeatedly ask the user for rectangle dimensions
        //until the area is zero

        Scanner console = new Scanner(System.in);

        double area = -1;
        while (area != 0)
        {
            //ask the user for input values
            System.out.println("Length? ");
            double length = console.nextDouble();
            System.out.println("Width? ");
            double width = console.nextDouble();

            //print the area
            area = length * width;
            System.out.println("Area: " + area);
        }
    }

    public static void doWhile()
    {
        //repeatedly ask the user for rectangle dimensions
        //until the area is zero

        Scanner console = new Scanner(System.in);

        double area;
        do
        {
            //ask the user for input values
            System.out.println("Length? ");
            double length = console.nextDouble();
            System.out.println("Width? ");
            double width = console.nextDouble();

            //print the area
            area = length * width;
            System.out.println("Area: " + area);

        } while (area != 0);
    }
}






