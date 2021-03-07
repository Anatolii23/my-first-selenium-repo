package zadanie13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> people = new ArrayList<>();
        people.add(new Employee("Jaro", 50, 65000));
        people.add(new Employee("Daro", 45, 5000));
        people.add(new Employee("Mati", 30, 25000));
        people.add(new Employee("Seba", 23, 3500));
        people.add(new Employee("Deba", 28, 4000));
        Employee olders = people.stream()
                .max(Comparator.comparing(employee -> employee.getAge()))
                .get();
        Employee youngers = people.stream()
                .min(Comparator.comparing(employee -> employee.getAge()))
                .get();
        Employee rich = people.stream()
                .max(Comparator.comparing(employee -> employee.getSalary()))
                .get();
        Employee poor = people.stream()
                .min(Comparator.comparing(employee -> employee.getSalary()))
                .get();
        List<Employee> salary5000 = people.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .collect(Collectors.toList());
        List<String> listname = people.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        int sumSalary = people.stream()
                .mapToInt(employee -> employee.getSalary())
                .sum();
        List<String> salary5000Name = people.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println("Najstarszy " + olders);
        System.out.println("Najmlodszy " + youngers);
        System.out.println("Najbogatszy " + rich);
        System.out.println("Najbiednejszy " + poor);
        System.out.println("Wyplata powyzej 5000 " + salary5000);
        System.out.println("Imiona wyplaty powyzej 5000" + salary5000Name);
        System.out.println("Lista imion" + listname);
        System.out.println("suma wyplat " + sumSalary);

    }


}
