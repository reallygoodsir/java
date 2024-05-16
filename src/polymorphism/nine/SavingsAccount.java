package polymorphism.nine;

public class SavingsAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Savings withdraw");
    }
}
