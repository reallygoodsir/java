package sevenDays.OOP.twelve;

import java.util.ArrayList;

public class Inventory {
    ArrayList<String> stuff = new ArrayList<String>();
    void addProduct(String product){
        stuff.add(product);
    }

    void removeProduct(int index){
        stuff.remove(index);
    }

    void inventoryCheck(){
        if(stuff.size() < 5){
            System.out.println("Your inventory is low");
        }
        else{
            System.out.println("Your inventory is fine");
        }
    }
}
