public class Apartment
{
    private String address;
    private double rent;
    private Tenant tenant;

    public Apartment(String address, double rent)
    {
        address = null;
        this.rent=rent;
    }
    public String getAddress()
    {
        return address;
    }

    public void setRent(double rent)
    {
        this.rent = rent;
    }
    public double getRent()
    {
        return rent;
    }
    public void rentTo(String name, String phone)
    {

    }
}
