import java.util.Objects;

public class Person
{
    private String name;
    private MyDate birthday;

    public Person (String name, MyDate birthday)
    {
        this.name=name;
        MyDate birthdayCopy = birthday;
        this.birthday=birthdayCopy;
    }

    public String getName()
    {
        return name;
    }

    public MyDate getBirthday()
    {
        return birthday;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getBirthday(), person.getBirthday());
    }
    public int hashCode() {
        return Objects.hash(getName(), getBirthday());
    }
}
