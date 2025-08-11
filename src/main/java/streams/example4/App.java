package streams.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "IT", "Developer", 1750);
        Employee employee2 = new Employee("Stephen", "Cleaning", "Cleaner", 1000);
        Employee employee3 = new Employee("Sean", "IT", "Developer", 1400);
        Employee employee4 = new Employee("Washington", "Engineering", "Engineer", 850);
        Employee employee5 = new Employee("George", "Engineering", "Engineer", 1200);
        Employee employee6 = new Employee("Sean", "IT", "QA", 1350);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Map<String, Map<String, List<Employee>>> result = employeeService.groupEmployeesByDepartmentAndJob(employees);
        for (Map.Entry<String, Map<String, List<Employee>>> stringMapEntry : result.entrySet()) {
            System.out.println(stringMapEntry);
        }
    }
}
