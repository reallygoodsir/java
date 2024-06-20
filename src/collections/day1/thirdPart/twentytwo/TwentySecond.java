package collections.day1.thirdPart.twentytwo;

import java.util.LinkedList;
import java.util.Scanner;

public class TwentySecond {
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
        System.out.println("Which element do you want to search for?");
        String search = scanner.next();

        if(list.contains(search)){
            System.out.println("the element is in the list");
        }
        else{
            System.out.println("The element isn't in the list");
        }
    }
}
