package inheritance.four;

public class App {
    public static void main(String[] args) {
        Employee employeeTest = new Employee();
        employeeTest.work();
        employeeTest.getSalary();

        System.out.println("\n");

        HRManager test = new HRManager();
        test.work();
        test.addEmployee();
    }
}
