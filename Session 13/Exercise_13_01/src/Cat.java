public class Cat extends Animal
{
    private int numberOfLives;

    public Cat (int speed, String name, int numberOfLives)
    {
        super(name,speed);
        this.numberOfLives = numberOfLives;
    }
    public String makeAnimalSound()
    {
        return "meow";
    }
    public void decreaseLives()
    {
        numberOfLives--;
    }
}
