package composition;

public class Person
{
    private Name name;
    private Address address;
    private int age;

    public Person(Name name, Address address, int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Name getName()
    {
        return name;
    }

    public Address getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name=" + name +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
