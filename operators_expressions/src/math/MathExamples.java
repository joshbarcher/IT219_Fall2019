package math;

public class MathExamples
{
    public static void main(String[] args)
    {
        //you can't create Math objects...
        //Math math = new Math();

        //round numbers
        long result = Math.round(12.7);
        System.out.println(result);

        double result2 = Math.ceil(12.1);
        System.out.println(result2);

        double result3 = Math.floor(13.9);
        System.out.println(result3);

        //practice using Math.min() after reading
        //about it from the API
        System.out.println(Math.min(-20, Math.min(2, -12)));
    }
}
