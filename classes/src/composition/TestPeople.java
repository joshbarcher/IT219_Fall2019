package composition;

public class TestPeople
{
    public static void main(String[] args)
    {
        Name name = new Name("Josh", "Archer", 'B');
        Address address = new Address(100, "Peach Tree Ln.", "Seattle", "WA", 98999);
        Person me = new Person(name, address, 35);

        //print out my "age"
        System.out.println(me.getAge());

        //print out my last name
        Name theName = me.getName();
        System.out.println(theName.getLast());

        Name other = new Name("Josh", "Archer", 'B');
        if (name == other)
        {
            System.out.println("Same name!");
        }

        //print the street
        System.out.println(me.getAddress().getStreet());

        //print out the entire person
        System.out.println(me);
    }
}

