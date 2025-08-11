package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void addAnimal(List<Animal> animals) {
        // this is always legal, since Dog can be assigned to an Animal reference
        animals.add(new Dog());
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        addAnimal(animals); // OK, since animals matches the method arg
    }
}
