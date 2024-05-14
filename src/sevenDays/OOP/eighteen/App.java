package sevenDays.OOP.eighteen;

public class App {
    public static void main(String[] args) {
        Item first = new Item("Pasta", 20);
        Item second = new Item("Steak", 28);
        Item third = new Item("Pizza", 40);
        Restaurant restaurant = new Restaurant();
        restaurant.addItem(first);
        restaurant.addItem(second);
        restaurant.addItem(third);
        restaurant.showMenu();
        System.out.println("\n");
        restaurant.removeItem(1);
        restaurant.showMenu();
        restaurant.addItem(second);

        Review firstR = new Review("Kanye West", 3);
        Review secondR = new Review("Travis Scott", 4);
        Review thirdR = new Review("Metro Boomin", 5);
        restaurant.addRating(firstR);
        restaurant.addRating(secondR);
        restaurant.addRating(thirdR);
        restaurant.calculateAverageRating(); //  (3+4+5)/2  == 12
    }
}
