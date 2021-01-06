import java.util.Objects;

public class Service
{
    private Date date;
    private int mileage;
    private Object Date;

    public Service (int mileage, Date date)
    {
        this.mileage = mileage;
        this.date = date;
    }

    public Object getDate()
    {
        return Date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service)) return false;
        Service service = (Service) o;
        return mileage == service.mileage &&
                Objects.equals(getDate(), service.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), mileage);
    }

    @Override
    public String toString() {
        return "Service{" +
                "Date=" + Date +
                ", mileage=" + mileage +
                '}';
    }
}
