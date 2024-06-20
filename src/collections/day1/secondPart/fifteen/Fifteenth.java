package collections.day1.secondPart.fifteen;

import java.util.ArrayList;

public class Fifteenth {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        ArrayList<String> clone = (ArrayList<String>) list.clone();
        System.out.println( clone);
    }
}
