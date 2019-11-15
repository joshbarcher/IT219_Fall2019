package examples;

public class Bicycle
{
    private String brand;
    private int year;
    private String color;

    public Bicycle()
    {
        brand = "Cannondale";
        year = 2015;
        color = "red";
    }

    public Bicycle(String brand, int year,
                   String color)
    {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getYear()
    {
        return year;
    }

    public String getColor()
    {
        return color;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        return "A " + color + " " + brand +
               " bicycle (" + year + ")";
    }
}
