package practice;

public class TestRationals
{
    public static void main(String[] args)
    {
        try
        {
            Rational goodFraction = new Rational(10, 3);
            System.out.println(goodFraction);

            Rational badFraction = new Rational(10, 1);
            System.out.println(badFraction);

            badFraction.setDen(0);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Error working with rationals: " +
                    ex.getMessage());
        }
    }
}
