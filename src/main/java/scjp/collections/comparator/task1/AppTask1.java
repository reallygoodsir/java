package scjp.collections.comparator.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(2);
        integers.add(1);
        integers.add(12);
        integers.add(22);
        Collections.sort(integers, new AscendingComparator());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println("--------------------------");
        Collections.sort(integers, new DescendingComparator());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
