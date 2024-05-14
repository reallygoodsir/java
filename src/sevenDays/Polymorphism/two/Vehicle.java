package sevenDays.Polymorphism.two;

public class Vehicle {
    void speedUp(){
        System.out.println("speeding up");
    }
}

class Car extends Vehicle{
    @Override
    void speedUp() {
        System.out.println("Car speed up");
    }
}

class Bicycle extends Vehicle{
    @Override
    void speedUp() {
        System.out.println("Bicycle speed up");
    }
}