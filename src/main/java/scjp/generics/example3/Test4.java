package scjp.generics.example3;

import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

public class Test4 {
    public static void main(String[] args) {
        // We put a Dog in a Cat array what is not good
        // THIS is the scenario we're trying to prevent, regardless of whether it's an array or
        // an ArrayList. The difference is, the compiler lets you get away with it for arrays,
        // but not for generic collections.
        foo();
    }

    public static void foo() {
        Cat[] cats = {new Cat(), new Cat()};
        addAnimal(cats); // no problem, send the Cat[] to the method
    }

    public static void addAnimal(Animal[] animals) {
        animals[0] = new Dog(); // Eeek! We just put a Dog in a Cat array!
    }
}
