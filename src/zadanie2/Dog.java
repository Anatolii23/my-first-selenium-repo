package zadanie2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bitePostman(){
        System.out.println("bite by " + name);
    }
}
