package scjp.generics.example5.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Set<Integer> set = ConversionUtils.toSet(list);
        System.out.println(set);
    }
}
