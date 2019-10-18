package examples;

public class StarsLadder
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++) //count rows
        {
            for (int j = 1; j <= i; j++) //count columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
