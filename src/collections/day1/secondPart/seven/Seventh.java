package collections.day1.secondPart.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Seventh {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("b second");
        list.add("a first");
        list.add("c third");
        Collections.sort(list);
        System.out.println(list);
    }
}
