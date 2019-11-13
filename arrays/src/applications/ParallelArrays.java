package applications;

public class ParallelArrays
{
    public static void main(String[] args)
    {
        String[] dates = {
            "10/31/2019",
            "7/4/2019",
            "11/15/2019"
        };

        String[] names = {
           "Halloween Party",
            "Fourth of July",
            "Party at my Place!"
        };

        //search for a 4th of july event
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals("Fourth of July"))
            {
                System.out.println("Yes!");
            }
        }

        for (int i = 0; i < dates.length; i++)
        {
            if (dates[i].equals("7/4/2019"))
            {
                System.out.println("Yes!");
            }
        }
    }
}
