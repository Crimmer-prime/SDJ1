import java.util.Objects;

public class Cow extends Animal
{
    private boolean hasSpots;

    public Cow (int speed, String name, boolean hasSpots)
    {
        super(name, speed);
        this.hasSpots=hasSpots;
    }
    @Override
    public String makeAnimalSound() {
        return "mooh";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cow)) return false;
        Cow cow = (Cow) o;
        return hasSpots == cow.hasSpots;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasSpots);
    }
}
