package sevenDays.abstractStuff.seven;

abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{
    void startEngine(){
        System.out.println("starting car engine");
    }
    void stopEngine(){
        System.out.println("stopping car engine");
    }
}

class Motorcycle extends Vehicle{
    void startEngine(){
        System.out.println("starting motorcycle engine");
    }
    void stopEngine(){
        System.out.println("stopping motorcycle engine");
    }

    public static void main(String[] args) {
        Vehicle a = new Car();
        a.startEngine();
        a.stopEngine();
        System.out.println();
        Vehicle b = new Motorcycle();
        b.startEngine();
        b.stopEngine();
    }
}