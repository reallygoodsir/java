package collections.day1.thirdPart.twelve;

import java.util.LinkedList;
import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        System.out.println("The linked list: " + list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which element do you want to remove?");
        String remove = scanner.next();

        if(list.contains(remove)){
            list.remove(remove);
            System.out.println("\nThe updated linked list: " + list);
        }
        else{
            System.out.println("The element isn't in the list");
        }
    }
}
