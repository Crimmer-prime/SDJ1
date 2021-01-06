import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Friends
{
    public static void main(String[] args) throws IOException
    {
        // The reader and writer objects must be declared BEFORE the try block, otherwise they are not 'visible' to close in the finally block
        Scanner reader = null;
        FileWriter writer = null;
        String inputText;
        String filename;

        try
        {

            // Reader and writer are instantiated within the try block because they can already throw an IOException
            reader = new Scanner(System.in);

            System.out.println("input File Name: ");
            filename = reader.nextLine().trim();
            writer = new FileWriter(filename);

            while (true)
            {

                System.out.println("Input next name: ");
                inputText = reader.nextLine();

                // If you type 'QUIT', the application quits
                if (inputText.equals("QUIT"))
                {
                    break;
                }

                writer.write(inputText);

                // Add the newline character, because it is cut off by the reader, when reading a whole line
                writer.write("\n");

            }

        }
        catch (IOException e)
        {

            // This exception may occur while reading or writing a line
            System.out.println("A fatal exception occurred!");

        }
        finally
        {
            // The finally branch is ALWAYS executed after the try or potential catch block execution
            if (reader != null)
            {
                reader.close();
            }

            try
            {
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                // This second catch block is a clumsy notation we need in Java, because the 'close()' call can itself throw an IOException.
                System.out.println("Closing was not successful.");
            }
        }
    }
}