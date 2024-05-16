package polymorphism.eleven;

public class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine start");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stop");
    }
}
