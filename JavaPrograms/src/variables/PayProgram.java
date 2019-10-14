package variables;

import java.util.Scanner;

public class PayProgram
{
    public static void main(String[] args)
    {
        final int OVERTIME_HOURS = 40;
        final int MIN_HOURS = 20;
        final int MAX_HOURS = 60;
        final double OVERTIME_RATE = 0.5;

        Scanner scan = new Scanner(System.in);

        //step #1 - let's ask the user for their name and hours
        System.out.print("What is your name? ");
        String name = scan.nextLine();

        System.out.println("How many hours did you work this paycheck? ");
        int hours = scan.nextInt();

        //step #2 - we'll calculate the user's pay

        //the pay can only be within [20, 60]
        hours = Math.max(MIN_HOURS, hours);
        hours = Math.min(MAX_HOURS, hours);

        double payRate = 25.0;
        double pay = hours * payRate;

        //do we also owe the user for overtime?
        if (hours > OVERTIME_HOURS)
        {
            double overtimeHours = hours - OVERTIME_HOURS;
            pay = pay + (overtimeHours * OVERTIME_RATE * payRate);
        }

        System.out.println("Your pay is: $" + pay);
    }
}