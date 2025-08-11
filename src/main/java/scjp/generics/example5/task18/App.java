package scjp.generics.example5.task18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(listOfLists);
        System.out.println(FlattenUtils.flatten(listOfLists));
    }
}
