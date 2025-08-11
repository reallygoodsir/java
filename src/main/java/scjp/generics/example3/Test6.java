package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void addAnimal(List<Animal> animals) {
        animals.add(new Dog()); // still OK as always
    }

    public static void main(String[] args) {
        List<Dog> animals = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Dog());
        // addAnimal(animals); // THIS is where it breaks!
    }
}
