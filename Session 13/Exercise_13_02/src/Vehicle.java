import java.util.ArrayList;
import java.util.Objects;

public class Vehicle
{
    private String owner;
    private double price;
    ArrayList<Vehicle>vehicles;

    public Vehicle (String owner, double price)
    {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner()
    {
        return owner;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.getPrice(), getPrice()) == 0 &&
                Objects.equals(getOwner(), vehicle.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOwner(), getPrice());
    }
}
