import java.io.*;

public class WriteBinary {

    public static void main(String[] args) throws IOException {

        String filename = "friends.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Friends friends = new Friends();

        //Person object can be saved directly, since it implements Serializable
        out.writeObject(friends);

        out.close();    // Close the file

        System.out.println("End writing data to file: " + file.getAbsolutePath());


        out.close();
    }
}

