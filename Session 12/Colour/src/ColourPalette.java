import java.util.Arrays;
import java.util.Objects;

public class ColourPalette
{
    private int numberOfColour;
    //array from UML box
    private Colour [] colours;

    public ColourPalette(int maxNumberOfColours)
    {
        this.numberOfColour = maxNumberOfColours;
        colours = new Colour[maxNumberOfColours];
    }
    public int getNumberOfColour()
    {
        return numberOfColour;
    }
    public void add(Colour colour)
    {
        this.add(colour);
    }
    public int getNumberOfGrayColours()
    {
        return numberOfColour;
    }
    public void mixColour (int index, Colour colour2)
    {
        colours [index].mixWith(colour2);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColourPalette)) return false;
        ColourPalette that = (ColourPalette) o;
        return getNumberOfColour() == that.getNumberOfColour() &&
                Arrays.equals(colours, that.colours);
    }

    public int hashCode() {
        int result = Objects.hash(getNumberOfColour());
        result = 31 * result + Arrays.hashCode(colours);
        return result;
    }
    public String toString() {
        return "ColourPalette{" +
                "numberOfColour=" + numberOfColour +
                ", colours=" + Arrays.toString(colours) +
                '}';
    }
}
