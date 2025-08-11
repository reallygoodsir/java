package scjp.generics.example5.task5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(22);
        list1.add(33);
        list1.add(44);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list2);
        ListUtils.copy(list2, list1);
        System.out.println(list2);
        
        List<String> listStrings = new ArrayList<>();
        listStrings.add("str-1");
        List<String> listStrings2 = new ArrayList<>();
        System.out.println(listStrings2);
        ListUtils.copy(listStrings2, listStrings);
        System.out.println(listStrings2);
    }
}
