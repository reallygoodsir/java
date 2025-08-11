package scjp.collections.comparable.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask4 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Steve", 27500.5));
        employeeList.add(new Employee(2, "Peter", 27501.0));
        employeeList.add(new Employee(3, "George", 5500.0));
        employeeList.add(new Employee(4, "Paul", 45000.0));

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        Collections.sort(employeeList);
        System.out.println("\n\nAfter:\n");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
