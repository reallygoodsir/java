package scjp.collections.set.task1;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
