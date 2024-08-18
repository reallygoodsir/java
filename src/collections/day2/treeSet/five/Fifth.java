package collections.day2.treeSet.five;

import java.util.Iterator;
import java.util.TreeSet;

public class Fifth {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        Iterator it = set.iterator();
        int first = 0;
        System.out.println("First element: ");
        while (it.hasNext()) {
            if(first == 1){
                break;
            }
            else {
                System.out.println(it.next());
                first++;
            }
        }
        Iterator itReverse = set.descendingIterator();
        int last = 0;
        System.out.println("Last element: ");
        while (itReverse.hasNext()) {
            if(last == 1){
                break;
            }
            else {
                System.out.println(itReverse.next());
                last++;
            }
        }

        System.out.println("Set: " + set);
    }
}
