package practice;

public class Rational {
    private double num;
    private double den;

    public Rational(double num, double den) {
        this.num = num;
        this.den = den;

        try
        {
            if (den == 0) {
                throw new ArithmeticException("Denominator cannot be zero!");
            }
        }
        catch (ArithmeticException ex)
        {
            //do something...
        }
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getDen() {
        return den;
    }

    public void setDen(double den) {
        this.den = den;

        if (den == 0) {
            throw new ArithmeticException("Denominator cannot be zero!");
        }
    }

    public String toString()
    {
        return num + "/" + den;
    }
}
