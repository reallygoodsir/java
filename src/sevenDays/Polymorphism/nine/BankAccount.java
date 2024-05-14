package sevenDays.Polymorphism.nine;

import sevenDays.OOP.seven.Bank;

public class BankAccount {
    void deposit(){
        System.out.println("bank deposit");
    }
    void withdraw(){
        System.out.println("bank withdraw");
    }
}

class SavingsAccount extends BankAccount{
    @Override
    void withdraw() {
        System.out.println("Savings withdraw");
    }
}

class CheckingAccount extends BankAccount{
    @Override
    void withdraw() {
        System.out.println("Checking withdraw");
    }
}