package collections.day1.secondPart.four;

import java.util.ArrayList;

public class Fourth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println(list);
        list.set(1, "not second");
        System.out.println("\n" + list);
    }
}
