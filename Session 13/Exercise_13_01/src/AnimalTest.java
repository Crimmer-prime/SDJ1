public class AnimalTest extends Animal
{
    public AnimalTest(String name, int speed) {
        super(name, speed);
    }

    public static void main(String[] args)
    {
        Animal animal = new Animal("Fin", 2);
        Cow cow = new Cow(1, "Tim",true);
        Cat cat = new Cat(5, "Kitty",9);
        Dog dog = new Dog(2, "Bob",3);
        Duck duck = new Duck(5, "Lenny",2);

        animal.makeAnimalSound();
        System.out.println(animal.makeAnimalSound());
        cat.makeAnimalSound();
        System.out.println(cat.makeAnimalSound());
        dog.makeAnimalSound();
        System.out.println(dog.makeAnimalSound());
        cow.makeAnimalSound();
        System.out.println(cow.makeAnimalSound());
        duck.makeAnimalSound();
        System.out.println(duck.makeAnimalSound());
    }
}
