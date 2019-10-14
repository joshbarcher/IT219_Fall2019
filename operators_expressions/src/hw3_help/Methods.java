package hw3_help;

public class Methods
{
    public static void main(String[] args)
    {
        //int sum = add(10, 100);
        System.out.println(add(10, 100));
        System.out.println(repeatString("*", 25));
        System.out.println(repeatString("*", 35));
        System.out.println(repeatString("*", 45));

        String bar = repeatString("-", 10);
        int sum = add(2, 3);
    }

    public static String repeatString(String input, int times)
    {
        String result = "";

        for (int i = 1; i <= times; i++)
        {
            //add to the string (times) times
            result += input;
        }

        return result;
    }

    public static int add(int one, int two)
    {
        //add together the numbers
        int result = one + two;

        //return them as the result of my method
        return result;
    }
}
