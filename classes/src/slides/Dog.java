package slides;

public class Dog
{
    private String name;
    private String breed;
    private boolean domesticated;
    private double weight;

    //default constructor (no params)
    public Dog()
    {
        name = "Fluffy";
        breed = "Boxer";
        domesticated = true;
        weight = 60;
    }

    //parameterized constructor
    public Dog(String name, String breed,
               boolean domesticated, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.domesticated = domesticated;
        this.weight = weight;
    }

    //getters (accessors)
    public String getName()
    {
        //we control how to return values!
        return name.toUpperCase();
    }

    public String getBreed()
    {
        return breed;
    }

    //we can use "is" or "get" here...
    public boolean isDomesticated()
    {
        return domesticated;
    }

    public double getWeight()
    {
        return weight;
    }

    //setters (mutators)

    public void setName(String newName)
    {
        if (newName != null && !newName.equals(""))
        {
            name = newName;
        }
    }

    public void setBreed(String newBreed)
    {
        if (newBreed != null && !newBreed.equals(""))
        {
            breed = newBreed;
        }
    }

    public void setDomesticated(boolean newDomesticated)
    {
        domesticated = newDomesticated;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight > 0)
        {
            weight = newWeight;
        }
    }

    public void makeNoise()
    {
        System.out.println("ruffffff");
    }

    public void makeNoise(String noise)
    {
        System.out.println(noise);
    }

    public boolean isPopularBreed()
    {
        if (breed.equals("Pug") || breed.equals("Boxer"))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Name: " + name + ", breed: " + breed;
    }
}















