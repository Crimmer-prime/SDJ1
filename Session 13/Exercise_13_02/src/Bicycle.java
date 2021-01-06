import java.util.Objects;

public class Bicycle extends Vehicle
{
    private int gears;

    public Bicycle(String owner, double price, int numberOfGears)
    {
        super(owner,price);
        this.gears=numberOfGears;
    }

    public void setGears(int gears)
    {
        this.gears = gears;
    }

    public int getGears()
    {
        return gears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle)) return false;
        if (!super.equals(o)) return false;
        Bicycle bicycle = (Bicycle) o;
        return getGears() == bicycle.getGears();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGears());
    }
}
