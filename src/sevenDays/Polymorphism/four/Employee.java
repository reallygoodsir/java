package sevenDays.Polymorphism.four;

public class Employee {
    void calculateSalary(){
        System.out.println("employee salary");
    }
}

class Manager extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("Manager salary");
    }
}

class Programmer extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("Programmer salary");
    }
}

class that{
    public static void main(String[] args) {
        Employee something = new Programmer();
        something.calculateSalary();
    }
}