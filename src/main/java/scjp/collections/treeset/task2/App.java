package scjp.collections.treeset.task2;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("Thomas", 22));
        set.add(new Person("Peter", 32));
        set.add(new Person("Kemal", 48));
        set.add(new Person("George", 19));
        System.out.println(set);
    }
}
