package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Bird;
import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    // Tell the compiler, "Hey, I'm using the collection passed in just to invoke
    // methods on the elements and I promise not to ADD anything into the collection."

    // By saying <? extends Animal>, we're saying, "I can be assigned a collection
    // that is a subtype of List and typed for <Animal> or anything that extends Animal.
    // And oh yes, I SWEAR that I will not ADD anything into the collection."
    public static void printAnimals(List<? extends Animal> animals) {
        // animals.add(new Dog()); // NO! Can't add if we use <? extends Animal>

        // ALLOWED to read
        for (Animal animal : animals) {
            animal.checkup();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        printAnimals(dogs);

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        printAnimals(cats);

        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());
        birds.add(new Bird());
        printAnimals(birds);
    }
}
