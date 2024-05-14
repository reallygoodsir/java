package sevenDays.Polymorphism.eleven;

public class Vehicle {
    void startEngine(){
        System.out.println("engine start");
    }
    void stopEngine(){
        System.out.println("engine stop");
    }
}

class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("car engine start");
    }

    @Override
    void stopEngine() {
        System.out.println("car engine stop");
    }
}

class Motorcycle extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine start");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stop");
    }
}