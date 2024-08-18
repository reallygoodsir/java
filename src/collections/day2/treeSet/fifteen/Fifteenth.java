package collections.day2.treeSet.fifteen;

import java.util.TreeSet;

public class Fifteenth {
    public static void main(String[] args) {
        String specified = "Red";
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        if(set.contains(specified)) {
            set.remove(specified);
        }
        else {
            System.out.println("specified isnt in the tree set");
        }
    }
}
