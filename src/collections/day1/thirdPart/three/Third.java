package collections.day1.thirdPart.three;

import java.util.LinkedList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int specifiedNumber = scanner.nextInt();
        for(int i = specifiedNumber ; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }
    }
}
