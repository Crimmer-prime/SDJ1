public class Duck extends Animal
{
    private int swamToday;

    public Duck (int speed, String name, int swamToday)
    {
        super(name, speed);
        this.swamToday=swamToday;
    }

    @Override
    public String makeAnimalSound() {
        return "Wrap wrap";
    }
}
