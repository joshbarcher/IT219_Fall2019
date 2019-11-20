package static_vs_non_static;

public class TestPoints
{
    private Point origin = Point.getOrigin();

    public static void main(String[] args)
    {
        Point point1 = Point.getOrigin();
        Point point2 = new Point(12, 6);
        Point point3 = new Point(3, -4);
        Point point4 = new Point(1, 2);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println("Num points: " + Point.getPointCount());

        //cannot access an instance member from a static methods
        //System.out.println(origin);
    }
}
