public class Dog extends Animal
{
    private int dailyWalks;
    private int walksToday;

    public Dog (int speed, String name, int dailyWalks)
    {
        super(name, speed);
        this.dailyWalks=dailyWalks;
    }
    public String makeAnimalSound()
    {
        return "Bark bark";
    }
    public void walk()
    {
        positionX = getSpeed();
        positionY = getSpeed();
        if (walksToday<dailyWalks)
        dailyWalks++;
        walksToday++;
    }
}
