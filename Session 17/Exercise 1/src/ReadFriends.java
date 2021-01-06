import java.io.*;

public class ReadFriends {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filename = "friends.bin";
        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        //We can read the Person object directly, remebering to cast
        Friends friends = (Friends) in.readObject();
        System.out.println(friends);

        in.close(); // Close the file

        System.out.println("End reading data from file: " + file.getAbsolutePath());

    }

}

