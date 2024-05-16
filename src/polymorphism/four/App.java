package polymorphism.four;

public class App {
    public static void main(String[] args) {
        Employee something = new Programmer();
        something.calculateSalary();
    }
}
