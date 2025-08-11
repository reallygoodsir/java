package scjp.generics.example5.task8;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String searchString = "affirmative";
        List<String> list = new ArrayList<>();
        list.add("negative");
        list.add("positive");
        list.add("affirmative");
        list.add("no");

        System.out.println(SearchUtils.contains(list, searchString));
        System.out.println(SearchUtils.contains(list, "yes"));
    }
}
