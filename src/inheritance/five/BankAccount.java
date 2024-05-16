package inheritance.five;

import java.util.Scanner;

public class BankAccount {
    int balance = 5000;
    Scanner scanner = new Scanner(System.in);

    void deposit() {
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
