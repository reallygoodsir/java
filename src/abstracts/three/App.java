package abstracts.three;

public class App {
    public static void main(String[] args) {
        BankAccount one = new SavingsAccount();
        one.deposit();
        one.withdraw();
        System.out.println();
        BankAccount two = new CurrentAccount();
        two.deposit();
        two.withdraw();
    }
}
