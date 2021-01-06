import java.util.Objects;

public class Car extends Vehicle
{
    private String regNo;

    public Car(String owner, double price, String regNo)
    {
        super(owner,price);
        this.regNo=regNo;
    }

    public String getRegNo()
    {
        return regNo;
    }

    public void setRegNo(String regNo)
    {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNo='" + regNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(getRegNo(), car.getRegNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRegNo());
    }
}
