package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    // "Hey compiler, please accept any List with a generic type that is of type
    // Dog, or a supertype of Dog. Nothing lower in the inheritance tree can come in, but
    // anything higher than Dog is OK."
    public static void addAndPrint(List<? super Dog> animals) {
        animals.add(new Dog()); // adding is sometimes OK with super

        for (Object animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        addAndPrint(animals); // passing an Animal List

        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        addAndPrint(dogs); // passing the Dog List

        List<Animal> animals2 = new ArrayList<Animal>();
        animals2.add(new Cat());
        animals2.add(new Dog());
        addAndPrint(animals2); // strange but executed successfully

        List<Cat> animals3 = new ArrayList<Cat>();
        animals3.add(new Cat());
        animals3.add(new Cat());
        // addAndPrint(animals3); // compile error
    }
}
