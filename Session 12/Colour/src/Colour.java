import java.util.Objects;

public class Colour
{
    private int red;
    private int green;
    private int blue;

    public Colour (int red, int green, int blue)
    {
        this.red=red;
        this.green=green;
        this.blue=blue;
    }
    public void setRed(int red)
    {
        this.red = red;
    }
    public void setGreen(int green)
    {
        this.green = green;
    }
    public void setBlue(int blue)
    {
        this.blue = blue;
    }
    public int getRed()
    {
        return red;
    }
    public int getGreen()
    {
        return green;
    }
    public int getBlue()
    {
        return blue;
    }
    public boolean isGray()
    {
        if (red == blue && red == green)
            return true;
        else return false;
    }
    public void mixWith(Colour colour2)
    {
        this.red = (int) (0.5*red +0.5*colour2.red);
        this.blue = (int) (0.5*blue + 0.5*colour2.blue);
        this.green = (int) (0.5*blue + 0.5*colour2.green);
    }
    public Colour copy()
    {
       Colour copy = new Colour(red,green,blue);
       if (isGray());
       copy.setRed(red);
       if (isGray());
       copy.setBlue(blue);
       if (isGray());
       copy.setGreen(green);
       return copy;
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Colour)) return false;
        Colour colour = (Colour) o;
        return getRed() == colour.getRed() &&
                getGreen() == colour.getGreen() &&
                getBlue() == colour.getBlue();
    }
    public int hashCode()
    {
        return Objects.hash(getRed(), getGreen(), getBlue());
    }

    public String toString()
    {
        return "Colour{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
