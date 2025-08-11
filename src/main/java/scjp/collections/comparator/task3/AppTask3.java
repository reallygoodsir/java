package scjp.collections.comparator.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask3 {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Peter", 24));
        listPerson.add(new Person("Paul", 18));
        listPerson.add(new Person("Thomas", 35));
        System.out.println(listPerson);
        Collections.sort(listPerson,new PersonComparator());
        System.out.println(listPerson);
    }
}
