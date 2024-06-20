package collections.day1.secondPart.sixteen;

import java.util.ArrayList;

public class Sixteenth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        list.removeAll(list);
        list.add("everything is gone");
        System.out.println(list);
    }
}
