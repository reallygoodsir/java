package collections.day1.secondPart.twenty;

import java.util.ArrayList;

public class Twentieth {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String>(3);
        list.add("1");
        list.add("2");
        list.add("3");

        list.ensureCapacity(6);

        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list);
    }
}
