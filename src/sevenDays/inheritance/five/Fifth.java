package sevenDays.inheritance.five;

import java.util.Scanner;

class BankAccount {
    int balance = 5000;
    Scanner scanner = new Scanner(System.in);

    void deposit(){

        System.out.println("How much would you like to deposit?");
        int depositAmount = scanner.nextInt();
        //scanner.close();
        balance = balance + depositAmount;
        System.out.println("Your new balance is " + balance);
    }
    void withdraw() {
        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = scanner.nextInt();
        balance = balance - withdrawAmount;
        System.out.println("Your new balance is " + balance);
    }
}
class SavingsAccount extends BankAccount{
    void withdraw(){
        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = scanner.nextInt();
        int newBalance = balance - withdrawAmount;
        if(newBalance < 1000){
            System.out.println("Failed due to safety measures");
        }
        else{
            balance = newBalance;
            System.out.println("Your new balance is " + balance);
        }
    }

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
