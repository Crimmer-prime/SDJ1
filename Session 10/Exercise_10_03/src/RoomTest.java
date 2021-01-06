public class RoomTest
{
    public static void main(String[] args)
    {
        Room room = new Room(801, "Single");
        System.out.println(room.isOccupied());
        Guest guest = new Guest("Jens");
        room.registerGuest(guest);
        System.out.println(room.isOccupied());
        room.vacate();
        System.out.println(room.isOccupied());

        Room room1 = new Room(802, "Double");
        System.out.println(room1.isOccupied());
        Guest guest1 = new Guest("Martin");
        room1.registerGuest(guest1);
        System.out.println(room1.isOccupied());
        room1.vacate();
        System.out.println(room1.isOccupied());

        Room room2 = new Room(803, "King size");
        System.out.println(room2.isOccupied());
        Guest guest2 = new Guest("Dennis");
        room2.registerGuest(guest2);
        System.out.println(room2.isOccupied());
        room2.vacate();
        System.out.println(room2.isOccupied());

        Room room3 = new Room(804, "Singel");
        System.out.println(room3.isOccupied());
    }
}
