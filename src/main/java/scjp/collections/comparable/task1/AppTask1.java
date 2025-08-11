package scjp.collections.comparable.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(16);
        list.add(-2);
        list.add(6);
        list.add(17);
        list.add(0);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
