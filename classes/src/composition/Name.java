package composition;

public class Name
{
    private String first;
    private String last;
    private char middle;

    public Name(String first, String last, char middle)
    {
        this.first = first;
        this.last = last;
        this.middle = middle;
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }

    public char getMiddle()
    {
        return middle;
    }

    public String toString()
    {
        return first + " " + middle + ". " + last;
    }
}
