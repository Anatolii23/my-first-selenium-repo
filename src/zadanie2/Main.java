package zadanie2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Dog dog = new Dog("DOg");
        Cat cat = new Cat("Cat");
        bitePostman(animal);
        bitePostman(dog);
        bitePostman(cat);

    }

    public static void bitePostman(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bitePostman();
        }
    }
}
