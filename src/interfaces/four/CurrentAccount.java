package interfaces.four;

public class CurrentAccount implements Account{
    public void deposit(){
        System.out.println("current account deposit");
    }
    public void withdraw(){
        System.out.println("current account withdraw");
    }
    public void calcInterest() {
        System.out.println("current account interest");
    }
    public void viewBalances() {
        System.out.println("current account balance");
    }
}
