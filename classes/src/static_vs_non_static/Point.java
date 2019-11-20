package static_vs_non_static;

public class Point
{
    //instance (non-static) members (fields)
    private double x;
    private double y;

    //static member (field)
    private static int pointCount;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;

        //count the number of points created
        pointCount++;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public static int getPointCount()
    {
        return pointCount;
    }

    public static Point getOrigin()
    {
        return new Point(0, 0);
    }

    public static void printPoint()
    {
        //cannot access an instance member from a static methods
        //System.out.println(x + ", " + y);
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
