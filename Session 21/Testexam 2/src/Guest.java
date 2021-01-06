import java.util.Objects;

public class Guest
{

    private String name;

    public Guest(String name)
    {
        this.name=name;
    }


    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return Objects.equals(getName(), guest.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
