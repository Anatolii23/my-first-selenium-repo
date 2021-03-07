package zadanie10;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final int year;

    public Employee(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return year == employee.year && name.equals(employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }
}
