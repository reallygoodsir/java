package scjp.generics.example3;

import scjp.generics.example3.models.AnimalDoctorGeneric;
import scjp.generics.example3.models.Bird;
import scjp.generics.example3.models.Cat;
import scjp.generics.example3.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());

        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        // doc.checkAnimals(dogs); // send a List<Dog>   NO! compilation failure
        // doc.checkAnimals(cats); // send a List<Cat>   NO! compilation failure
        // doc.checkAnimals(birds); // send a List<Bird> NO! compilation failure
    }
}
