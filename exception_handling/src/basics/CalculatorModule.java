package basics;

public class CalculatorModule
{
    public static double divide(double num, double den) throws Exception
    {
        if (den != 0)
        {
            return num / den;
        }

        //there isn't a good choice to return a value here,
        //so... we'll throw an exception and be done with it
        throw new Exception("Cannot divide by zero! - " + num + "/" + den);
    }
}
