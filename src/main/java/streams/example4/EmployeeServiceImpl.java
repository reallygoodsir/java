package streams.example4;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findEmployeesByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> findEmployeesByName(List<Employee> employees, String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> findEmployeesBySalary(List<Employee> employees, double salary) {
        return employees.stream()
                .filter(employee -> (employee.getSalary() == salary))
                .collect(Collectors.toList());
    }

    @Override
    public Employee findEmployeeWithLowestSalary(List<Employee> employees) {
        Optional<Employee> maxSalaryEmployee = employees
                .stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        return maxSalaryEmployee.orElse(null);
    }

    @Override
    public List<Department> findAllDepartments(List<Employee> employees) {
        return employees
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .map(Department::new)
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, Double> findHighestPaidEmployees(List<Employee> employees, int topEmployeesCount) {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(topEmployeesCount)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
    }

    @Override
    public Map<String, Double> calculateEmployeesTotalSalaryByDepartment(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
    }

    @Override
    public Map<String, List<Employee>> groupEmployeesByDepartments(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    @Override
    public Map<String, Map<String, List<Employee>>> groupEmployeesByDepartmentAndJob(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getJobTitle)));
    }

    @Override
    public Map<String, Long> groupEmployeesByJobTitle(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getJobTitle, Collectors.counting()));
    }
}
