package polymorphism.four;

public class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager salary");
    }
}
