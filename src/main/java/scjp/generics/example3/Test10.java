package scjp.generics.example3;

import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

    // List<?>, which is the wildcard <?> without the
    // keywords extends or super, simply means "any type." So that means any type of
    // List can be assigned to the argument. That could be a List of <Dog>, <Integer>,
    // <JButton>, <Socket>, whatever. And using the wildcard alone, without the
    // keyword super (followed by a type), means that you cannot ADD anything to the
    // list referred to as List<?>.

    // List<? extends Object> and List<?> are absolutely identical! But not the same as List<Object>
    public static void print(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }

        // list.add(new Object()); // compilation failure
        // list.add(new String()); // compilation failure
        // list.add(new Dog());    // compilation failure
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        print(dogs);

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());
        print(cats);

        List<Object> objects = new ArrayList<Object>();
        objects.add(new Object());
        print(objects);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("str1");
        print(strings);
    }
}
