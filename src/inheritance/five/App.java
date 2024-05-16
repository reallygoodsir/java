package inheritance.five;

public class App {
    public static void main(String[] args) {
        System.out.println("Your balance is 5000\n");

        BankAccount bankTest = new BankAccount();
        bankTest.deposit();
        bankTest.withdraw();
        bankTest.deposit();
        SavingsAccount savingsTest = new SavingsAccount();
        savingsTest.withdraw();
    }
}
