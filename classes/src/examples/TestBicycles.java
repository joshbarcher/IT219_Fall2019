package examples;

public class TestBicycles
{
    public static void main(String[] args)
    {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle("Trek", 2019, "blue");

        System.out.println(bike1);
        System.out.println(bike2);
    }
}
