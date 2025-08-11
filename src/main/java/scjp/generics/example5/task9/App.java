package scjp.generics.example5.task9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(14);
        list.add(1);
        list.add(-3);
        list.add(0);
        list.add(33);
        
        System.out.println(list);
        Sorter.sort(list);
        System.out.println(list);
    }
}
