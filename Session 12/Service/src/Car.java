public class Car
{
    private String registrationnumber;
    private int mileage;


    public Car (int mileage, String registrationnumber)
    {
        this.mileage = mileage;
        this.registrationnumber=registrationnumber;
    }
    public String getRegistrationnumber() {
        return registrationnumber;
    }
    public int getMileage() {
        return mileage;
    }
}
