package zadanie10;

public class EmployeeName {
    public static void main(String[] args) {
        Employee employee = new Employee("Mati", "Super", 1976);
        Employee employee1 = new Employee("Mati", "Super", 1976);
        Employee employee2 = new Employee("Jaro", "Mega", 1973);

        System.out.println(employee.equals(employee1));
        System.out.println(employee.equals(employee2));
        System.out.println(employee1.equals(employee2));
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
    }
}
