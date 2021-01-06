public class Bed
{
    private String type;

    public Bed(String type)
    {
        this.type= type;
    }
    public boolean isSingle()
    {
        if (type.equals("Single")) return true;
        else return false;
    }
    public boolean isDouble()
    {
        return type.equals("Double");
    }
    public boolean isKingsize()
        {
            return type == "King size";
        }
}
