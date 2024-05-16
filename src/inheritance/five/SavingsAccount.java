package inheritance.five;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    void withdraw() {
        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = scanner.nextInt();
        int newBalance = balance - withdrawAmount;
        if (newBalance < 1000) {
            System.out.println("Failed due to safety measures");
        } else {
            balance = newBalance;
            System.out.println("Your new balance is " + balance);
        }
    }
}
