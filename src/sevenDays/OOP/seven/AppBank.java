package sevenDays.OOP.seven;

public class AppBank {
    public static void main(String[] args) {
        Account acc1 = new Account("Kanye West", 250000);
        Account acc2 = new Account("Travis Scott", 200000);
        Account acc3 = new Account("Kendrick Lamar", 400000);

        Bank bank = new Bank();
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.showBank();
        bank.removeAccount(2);
        System.out.println("\n\n");
        bank.operateMoney(1);
        bank.showBank();
        bank.accountInfo(0);
    }
}
