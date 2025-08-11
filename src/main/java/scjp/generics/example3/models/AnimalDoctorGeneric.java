package scjp.generics.example3.models;

import java.util.List;

public class AnimalDoctorGeneric {
    public void checkAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.checkup();
        }
    }

    public void checkAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.checkup();
        }
    }
}
