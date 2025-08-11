package scjp.collections.set.task2;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(3);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(8);

        System.out.println(hasCommonElements(set1, set2));
    }

    public static boolean hasCommonElements(Set<Integer> set1, Set<Integer> set2){
        for (Integer i : set1) {
            for (Integer i2 : set2) {
                if(i.equals(i2)){
                    return true;
                }
            }
        }
        return false;
    }
}
