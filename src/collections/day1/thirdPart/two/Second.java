package collections.day1.thirdPart.two;

import java.util.LinkedList;

public class Second {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        for (String line : list) {
            System.out.println(line);
        }
    }
}
