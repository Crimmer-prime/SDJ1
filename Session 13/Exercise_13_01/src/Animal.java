import java.util.ArrayList;

public class Animal
{
    private int speed;
    private String name;
    protected int positionX;
    protected int positionY;
    ArrayList<Animal> animals;

    public Animal (String name, int speed)
    {
        super();
        this.name=name;
        this.speed=speed;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void moveTo (int newPosX, int newPosY)
    {
        positionX = newPosX;
        positionY = newPosY;
    }
    public String makeAnimalSound()
    {
        return "I don't have a sound yet! :(";
    }

}
