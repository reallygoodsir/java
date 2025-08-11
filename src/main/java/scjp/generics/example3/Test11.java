package scjp.generics.example3;

import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        // doInsert(myList); // compilation failure

        List<Object> objects = new ArrayList<Object>();
        objects.add(new Object());
        objects.add(new Dog());
        doInsert(objects);
    }

    public static void doInsert(List<Object> list) {
        list.add(new Dog()); // we can add any type of object
    }
}
