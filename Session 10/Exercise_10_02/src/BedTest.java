public class BedTest
{
    public static void main(String[] args)
    {
        Bed bedtype = new Bed("Single");
        System.out.println(bedtype.isSingle());
        System.out.println(bedtype.isDouble());
        System.out.println(bedtype.isKingsize());
    }
}
