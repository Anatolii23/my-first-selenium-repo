package zadanie5;

public class Main {
    public static void main(String[] args) {

//    static <T extends Integer> void makeInt(T integer){
//        integer.toString();
//    }
        Dog dog = new Dog();
        Cat cat = new Cat();
        Person person = new Person();
        makeNoise(dog);
        makeNoise(cat);
       // makeNoise(person); nie dziedziczy po Animal

    }

    public static  <T extends Animal> void makeNoise(T animal) {
        animal.makeNoise();
    }
}
