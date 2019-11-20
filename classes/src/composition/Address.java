package composition;

public class Address
{
    private int number;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public Address(int number, String street, String city, String state, int zipCode)
    {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public int getNumber()
    {
        return number;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    @Override
    public String toString()
    {
        return number + " " + street + " " + city +
                ", " + state + " " + zipCode;
    }
}
