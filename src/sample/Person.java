package sample;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int pesel;

    public Person(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return pesel == person.pesel && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }
}
