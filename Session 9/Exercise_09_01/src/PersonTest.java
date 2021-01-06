public class PersonTest
{
    public static void main(String[] args)
    {
        MyDate birthday = new MyDate(18,9,1995);
        Person dennis = new Person("Dennis ",birthday);
        birthday.set(18,9,1995);
        System.out.println("Dennis your birthday is : " + birthday);
    }
}
