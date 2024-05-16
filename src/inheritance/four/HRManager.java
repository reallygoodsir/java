package inheritance.four;


public class HRManager extends Employee {
    void work() {
        System.out.println("manager working");
    }

    void addEmployee() {
        System.out.println("adding a new employee");
    }
}