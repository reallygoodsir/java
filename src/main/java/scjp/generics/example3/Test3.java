package scjp.generics.example3;


import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.Dog;

public class Test3 {
    public static void main(String[] args) {
        // all is good because we use Dog everywhere
        foo();
    }

    public static void foo() {
        Dog[] dogs = {new Dog(), new Dog()};
        addAnimal(dogs); // no problem, send the Dog[] to the method
    }

    public static void addAnimal(Animal[] animals) {
        animals[0] = new Dog(); // ok, any Animal subtype works
    }
}
