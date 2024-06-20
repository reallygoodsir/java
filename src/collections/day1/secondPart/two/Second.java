package collections.day1.secondPart.two;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        for (String line : list) {
            System.out.println(line);
        }
    }
}
