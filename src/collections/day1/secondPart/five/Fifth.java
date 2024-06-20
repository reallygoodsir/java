package collections.day1.secondPart.five;

import java.util.ArrayList;

public class Fifth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.remove(2);
        System.out.println(list);
    }
}
