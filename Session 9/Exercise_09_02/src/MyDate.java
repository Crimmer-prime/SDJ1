public class MyDate
{
    private int day, month, year;

    public MyDate(int day, int month, int year)
    {
        set(day, month, year);
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void set(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return ((day<31) ? ("0"+day) : day) + "/" + ((month<12) ? ("0"+month) : month) + "/" + year;
    }
}
