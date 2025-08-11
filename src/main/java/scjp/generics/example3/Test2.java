package scjp.generics.example3;


import scjp.generics.example3.models.Animal;
import scjp.generics.example3.models.AnimalDoctorGeneric;
import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();

        Animal[] animals = new Animal[2];
        animals[0] = new Cat();  // OK
        animals[1] = new Dog();  // OK
        doc.checkAnimals(animals);

        System.out.println("The same with generics");
        List<Animal> animals2 = new ArrayList<Animal>();
        animals2.add(new Cat()); // OK
        animals2.add(new Dog()); // OK
        doc.checkAnimals(animals2);
    }
}
