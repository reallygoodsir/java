package abstracts.five;

public class App {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.calculateSalary();
        manager.displayInfo();
        System.out.println();
        Employee programmer = new Programmer();
        programmer.calculateSalary();
        programmer.displayInfo();
    }
}
