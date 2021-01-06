import java.time.Year;
import java.util.Objects;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date (int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date()
    {
    }
    //input your setters.
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    //Make a copy of the date.
    public Date copy()
    {
        Date copy = new Date(year,month,day);
        if (Date);
        copy().setYear(year);
        if (Date);
        copy().setMonth(month);
        if (Date);
        copy().setDay(day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
