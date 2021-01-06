import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        do {
            Scanner input = new Scanner(String.valueOf(sum));
            try {
                System.out.println("Type an Integer: ");
                sum = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number.");
            }
            input.nextLine();
        } while (sum <= 0);
    }
}