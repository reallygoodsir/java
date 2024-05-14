package sevenDays.OOP.twelve;

public class App {
    public static void main(String[] args) {
        Inventory bag = new Inventory();
        bag.inventoryCheck();
        bag.addProduct("Apple");
        bag.addProduct("Pen");
        bag.addProduct("Notebook");
        bag.addProduct("Phone");
        bag.addProduct("Cat");
        bag.inventoryCheck();
    }
}
