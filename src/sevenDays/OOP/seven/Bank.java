package sevenDays.OOP.seven;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<Account> bank = new ArrayList<Account>();

    void addAccount(Account account) {
        bank.add(account);

    }

    void removeAccount(int index) {
        bank.remove(index);
    }

    void operateMoney(int index){
        int rnCash = bank.get(index).getMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - deposit money\n2 - withdraw money");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("How much money would you like to deposit?");
            int add = scanner.nextInt();
            rnCash = rnCash + add;
            bank.get(index).setMoney(rnCash);
        }
        else if(choice == 2){
            System.out.println("How much money would you like to withdraw?");
            int minus = scanner.nextInt();
            rnCash = rnCash - minus;
            if(rnCash < 0){
                System.out.println("Not enough money to withdraw");
            }
            else {
                bank.get(index).setMoney(rnCash);
            }
        }
    }

    void accountInfo(int index){
        System.out.println("The account owner's name is " + bank.get(index).getName() + "\nThe account owner's bank money is " + bank.get(index).getMoney());
    }
    void showBank() {
        for (int i = 0; i < bank.size(); i++) {
            System.out.println(bank.get(i));
        }
    }
}
