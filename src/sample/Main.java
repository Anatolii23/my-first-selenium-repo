package sample;


public class Main {
    public static void main(String[] args){
        Person person = new Person("Daro", "Super", 1234);
        Person person1 = new Person("Daro", "Super", 1234);
        Person person2 = new Person("Jaro", "Mega", 9876);
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        System.out.println(person1.equals(person2));
    }


}
