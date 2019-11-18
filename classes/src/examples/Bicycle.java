/*
    This file contains a Bicycle class.
    File: Bicycle.java
    Date: Nov 18, 2019
    Author: Josh Archer
 */

package examples;

/**
 * This is a Bicycle class that has a brand,
 * year and color.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Bicycle
{
    private String brand;
    private int year;
    private String color;

    /**
     * Creates a new Cannondale bike.
     */
    public Bicycle()
    {
        brand = "Cannondale";
        year = 2015;
        color = "red";
    }

    /**
     * This creates a new bike with all three
     * fields set to the input parameters.
     *
     * @param brand the new bike brand
     * @param year the new bike color
     * @param color the color of the new bike
     */
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

    /**
     * Returns a string representation of the bike
     * @return a string version of the bike
     */
    public String toString()
    {
        return "A " + color + " " + brand +
               " bicycle (" + year + ")";
    }
}
