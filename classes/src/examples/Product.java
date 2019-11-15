package examples;

public class Product {
    private String name;
    private double value;
    private String description;

    public Product(String newName,
                   double newValue,
                   String newDescription) {
        name = newName;
        value = newValue;
        description = newDescription;
    }

    public double buySeveral(int quantity) {
        return quantity * value;
    }
}

