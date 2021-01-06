public class ColourTest
{
    public static void main(String[] args) {
        Colour colour = new Colour(1, 5, 8);
        Colour colour1 = new Colour(1,1,1);
        Colour colour2 = new Colour(5,2,6);

        ColourPalette colourPalette=new ColourPalette(10);

        colour.isGray();
        System.out.println(colour.isGray());
        System.out.println("The colours are: " + colour);
        System.out.println(colourPalette.getNumberOfColour());

        colour1.isGray();
        System.out.println(colour1.isGray());
        System.out.println("The colours are: " + colour1);
        System.out.println(colourPalette.getNumberOfGrayColours());

        colour2.isGray();
        System.out.println(colour2.isGray());
        System.out.println("The colours are: " + colour2);
    }
}
