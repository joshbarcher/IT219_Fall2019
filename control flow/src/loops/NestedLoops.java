package loops;

public class NestedLoops
{
    public static void main(String[] args)
    {
        //print out a multiplication table
        for (int i = 1; i <= 30; i++)
        {
            for (int j = 1; j <= 30; j++)
            {
                int value = i * j;
                if (value < 10)
                {
                    System.out.print(" ");
                }
                if (value < 100)
                {
                    System.out.print(" ");
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
