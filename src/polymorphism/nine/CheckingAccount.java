package polymorphism.nine;

public class CheckingAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Checking withdraw");
    }
}
