package scjp.generics.example5.task6;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("George", 82);
        grades.put("Peter", 59);
        grades.put("David", 91);

        Map<String, Integer> passed = MapUtils.filterByValue(grades, value -> value >= 60);

        System.out.println(passed);
    }
}
