package streams.example4;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findEmployeesByDepartment(final List<Employee> employees, final String department);

    List<Employee> findEmployeesByName(final List<Employee> employees, final String name);

    List<Employee> findEmployeesBySalary(final List<Employee> employees, final double salary);

    Employee findEmployeeWithLowestSalary(final List<Employee> employees);

    List<Department> findAllDepartments(List<Employee> employees);

    Map<String, Double> findHighestPaidEmployees(List<Employee> employees, int topEmployeesCount);

    Map<String, Double> calculateEmployeesTotalSalaryByDepartment(final List<Employee> employees);

    Map<String, List<Employee>> groupEmployeesByDepartments(final List<Employee> employees);

    Map<String, Map<String, List<Employee>>> groupEmployeesByDepartmentAndJob(List<Employee> employees);

    Map<String, Long> groupEmployeesByJobTitle(List<Employee> employees);

}
