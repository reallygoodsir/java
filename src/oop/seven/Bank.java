package oop.seven;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<Account>();

    void addAccount(Account account) {
        accounts.add(account);

    }

    void removeAccount(int index) {
        accounts.remove(index);
    }

    void operateMoney(int index){
        int rnCash = accounts.get(index).getMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - deposit money\n2 - withdraw money");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("How much money would you like to deposit?");
            int add = scanner.nextInt();
            rnCash = rnCash + add;
            accounts.get(index).setMoney(rnCash);
        }
        else if(choice == 2){
            System.out.println("How much money would you like to withdraw?");
            int minus = scanner.nextInt();
            rnCash = rnCash - minus;
            if(rnCash < 0){
                System.out.println("Not enough money to withdraw");
            }
            else {
                accounts.get(index).setMoney(rnCash);
            }
        }
    }

    void accountInfo(int index){
        System.out.println("The account owner's name is " + accounts.get(index).getName() + "\nThe account owner's bank money is " + accounts.get(index).getMoney());
    }
    void showAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }
}
