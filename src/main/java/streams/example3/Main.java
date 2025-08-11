package streams.example3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeBuilder.create();
        employees.stream()
                .filter(Employee::isFemale)
                .forEach(System.out::println);
    }
}


