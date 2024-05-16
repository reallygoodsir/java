package interfaces.four;

public class App {
    public static void main(String[] args) {
        CurrentAccount aa = new CurrentAccount();
        SavingsAccount aaa = new SavingsAccount();
        Bank a = new Bank();
        a.addCurrentAccount(aa);
        a.addSavingsAccount(aaa);
    }
}
