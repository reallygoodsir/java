package collections.day1.secondPart.eleven;

import java.util.ArrayList;
import java.util.List;

public class Eleventh {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        List<String> strings = list.subList(0, 3);
        System.out.println(strings);
    }
}
