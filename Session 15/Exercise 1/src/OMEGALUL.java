import java.util.*;
public class OMEGALUL {
        public static void main( String args[] )
        {
            //declare an integer num
            int num=0;
            //Scanner object
            Scanner kbd = new Scanner(System.in);
            //do -while loop
            do
            {
                //calling try-catch block
                try
                {
                    System.out.print("Type an Integer in the range from 10 to 90: ");
                    //read num value from keyboard
                    num=kbd.nextInt();
                    //read new line and ignore
                    kbd.nextLine();

                    //throw user defined exception , NumberOutOfRangeException
                    if(num<10 || num>90)
                        throw new NumberOutOfRangeException("Number out of range." +  "Must be in 1..100 inclusive:" +num);
                }
                //thorw system defined , InputMismatchException exception
                catch (InputMismatchException e) {
                    System.out.println("Input was not an integer");
                    //read new line and ignore
                    kbd.nextLine();
                }
                //thorw system defined , NumberOutOfRangeException exception
                catch (NumberOutOfRangeException e) {
                    System.out.println(e.getMessage());
                }
                catch (Exception e) {
                    System.out.println(e);
                    System.exit(10);
                }
            } while(num<10 || num>90);
            System.out.format("Program successfully ended");
        } //END main
    } //END CLSS

    class NumberOutOfRangeException extends Exception
    {
        public NumberOutOfRangeException(String msg) {
            super(msg);
        }
    }
