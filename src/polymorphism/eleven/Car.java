package polymorphism.eleven;

public class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("car engine start");
    }

    @Override
    void stopEngine() {
        System.out.println("car engine stop");
    }
}
