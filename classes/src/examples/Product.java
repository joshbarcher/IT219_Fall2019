package examples;

/**
 * Represents a generic product.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Product
{
    private String name;
    private double value;
    private String description;

    /**
     * Creates a new product with the given
     * name, value and description
     * @param newName the new product name
     * @param newValue the new product value
     * @param newDescription the new product description
     */
    public Product(String newName,
                   double newValue,
                   String newDescription)
    {
        name = newName;
        value = newValue;
        description = newDescription;
    }

    /**
     * Calculates the sub-total of a purchase that
     * contains several of this product.
     * @param quantity the number of items of this type
     * @return the sub-total
     */
    public double buySeveral(int quantity)
    {
        return quantity * value;
    }
}

