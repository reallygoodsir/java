package sevenDays.interfaces.four;

import java.util.ArrayList;

public class Bank {
    ArrayList<CurrentAccount> accounts = new ArrayList<CurrentAccount>();
    void addCurrentAccount(CurrentAccount account){
        accounts.add(account);
    }

    ArrayList<SavingsAccount> accounts2 = new ArrayList<SavingsAccount>();
    void addSavingsAccount(SavingsAccount account){
        accounts2.add(account);
    }
}
