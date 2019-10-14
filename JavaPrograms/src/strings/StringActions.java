package strings;

public class StringActions
{
    public static void main(String[] args)
    {
        //create a string and print it
        String saying = "I'll burn that bridge when I get to it";
        System.out.println(saying);

        //make some changes and print them
        System.out.println(saying.toUpperCase());
        System.out.println(saying.toLowerCase());
        System.out.println(saying);

        saying = saying.toUpperCase();
        System.out.println(saying);

        int number = 10;
        System.out.println(number); //10
        System.out.println(number + 20); //30
        System.out.println(number); //10

        number = number + 20; //change 10 to 30
        System.out.println(number); //30
    }
}
