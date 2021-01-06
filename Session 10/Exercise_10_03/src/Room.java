public class Room
{
    private int number;
    private Bed bed;
    private Guest guest;

    public Room (int number, String bedType)
    {
        this.number = number;
        bed = new Bed(bedType);
    }

    public int getNumber() {
        return number;
    }
    public int getFloor()
    {
        //There is two ways to do it.
        //int floor = number/100;
        //return floor;

        return number/100;
    }
    public double getPrice()
    {
       if (bed.isSingle())
            return 59.50;
       else if (bed.isDouble())
           return 72.40;
       else
           return 89.00;
    }
    public boolean isOccupied()
    {
        return guest != null;
    }
    public void registerGuest(Guest guest)
    {
        this.guest = guest;
    }
    public void vacate()
    {
        this.guest = null;
    }
    public String getBedType()
    {
            if (bed.isSingle())
                    return "Single";
            else if (bed.isDouble())
                return "Double";
           else return "King size";
    }
    public Guest getGuest()
    {
        return guest;
    }
}
