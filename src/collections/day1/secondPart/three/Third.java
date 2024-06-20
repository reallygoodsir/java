package collections.day1.secondPart.three;

import java.util.ArrayList;

public class Third {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String indexGet = list.get(2); // "third"
        System.out.println(indexGet);
    }
}
