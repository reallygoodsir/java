package scjp.generics.example3.models;

public class AnimalDoctor {
    // method takes an array of any animal subtype
    public void checkAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.checkup();
        }
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Bird[] birds = {new Bird()};
        AnimalDoctor doctor = new AnimalDoctor();
        doctor.checkAnimals(dogs); // pass the Dog[]
        doctor.checkAnimals(cats); // pass the Cat[]
        doctor.checkAnimals(birds); // pass the Bird[]
    }
}
