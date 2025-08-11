package scjp.collections.comparator.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppTask7 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Paul", 22));
        list.add(new Person(2, "Pete", 25));
        list.add(new Person(3, "George", 32));
        list.add(new Person(4, "Bartholomew", 42));
        list.add(new Person(5, "Lion", 12));
        Comparator nameComparator = getComparator("name");
        Comparator ageComparator = getComparator("age");
        Comparator idComparator = getComparator("id");

        Collections.sort(list,nameComparator);
        System.out.println(list);
        Collections.sort(list,ageComparator);
        System.out.println(list);
        Collections.sort(list,idComparator);
        System.out.println(list);
    }

    public static Comparator getComparator(String field) {
        if ("name".equals(field)) {
            return new NameComparator();
        } else if ("age".equals(field)) {
            return new AgeComparator();
        } else {
            return new IdComparator();
        }
    }
}
