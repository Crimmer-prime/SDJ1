import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudents
{
    public static void main(String[] args) throws FileNotFoundException {
        StudentList student = new StudentList();
        File file = new File("Students.txt");
        Scanner in = new Scanner(file);      // Open the file
        while (in.hasNext())
        {
            String line = in.nextLine();      // Read a line
            String[] token = line.split(", "); // Split the line into an array

             // store the first entry in the array
            int groupnumber = Integer.parseInt(token[0].trim());
            int studynumber = Integer.parseInt(token[1].trim());
            String name = token[2].trim();
            String nationality = token[3].trim();
            int birthDay = Integer.parseInt(token[4].trim());
            int birthMonth = Integer.parseInt(token[5].trim());
            int birthYear = Integer.parseInt(token[6].trim());

            //Reads the list from studentlist
            student.add(new Student(name,studynumber, nationality,groupnumber,
                            (new MyDate(birthDay,birthMonth,birthYear))));
        }
        in.close();

        System.out.println(student + "\n\r");
        System.out.println("End reading data from file: " +file.getAbsolutePath());
    }
}
