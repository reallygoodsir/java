package oop.eighteen;

import java.util.ArrayList;

public class Restaurant {
//    private String menuItems;
    ArrayList<Item> menu = new ArrayList<Item>();

    void addItem(Item item){
        menu.add(item);
    }
    void removeItem(int index){
        menu.remove(index);
    }

    void showMenu(){
//        System.out.println(menu);
        for(int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i).getName() + "  |  Cost: " + menu.get(i).getCost() + "$");
        }
    }
    ArrayList<Review> reviews = new ArrayList<Review>();

    void addRating(Review review){
        reviews.add(review);
    }

    void calculateAverageRating(){
        int sum = 0;
        for(int i = 0; i < reviews.size(); i++){
            sum += reviews.get(i).getRating();
        }
        if(reviews.size() != 0) {
            int average = sum / reviews.size();
            System.out.println("The average rating is " + average);
        }
    }
}
