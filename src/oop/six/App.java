package oop.six;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Igor", "Employee", 24000);
        employee1.updateSalary();
        employee1.showSalary();
    }
}
