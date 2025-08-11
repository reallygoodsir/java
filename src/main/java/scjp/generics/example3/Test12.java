package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Dog>();                     // OK!
        List<? extends Animal> aList = new ArrayList<Dog>();     // OK!
        List<? super Dog> bList = new ArrayList<Animal>();       //OK!
        // List<?> foo = new ArrayList<? extends Animal>();      // compilation failure
        // List<? extends Dog> cList = new ArrayList<Integer>(); // compilation failure
        // List<? super Animal> dList = new ArrayList<Dog>();    // compilation failure
    }
}
