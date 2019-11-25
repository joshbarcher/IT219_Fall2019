package object_interactions;

public class User
{
    private String username;
    private String fullName;

    public User(String username, String fullName)
    {
        this.username = username;
        this.fullName = fullName;
    }

    public String getUsername()
    {
        return username;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String toString()
    {
        return fullName + " (" + username + ")";
    }
}
