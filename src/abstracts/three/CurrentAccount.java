package abstracts.three;


public class CurrentAccount extends BankAccount {
    void deposit() {
        System.out.println("handling current account deposits");
    }

    void withdraw() {
        System.out.println("handling current account withdrawals");
    }
}