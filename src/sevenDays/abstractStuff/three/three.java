package sevenDays.abstractStuff.three;

abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends BankAccount{
    void deposit(){
        System.out.println("handling savings account deposits");
    }
    void withdraw(){
        System.out.println("handling savings account withdrawals");
    }
}


class CurrentAccount extends BankAccount{
    void deposit(){
        System.out.println("handling current account deposits");
    }
    void withdraw(){
        System.out.println("handling current account withdrawals");
    }

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