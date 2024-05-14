package sevenDays.inheritance.two;

class Vehicle {

    void drive(){System.out.println("driving");}
}

class Car extends Vehicle {

    void drive(){System.out.println("Repairing a car");}
    public static void main(String args[]){
        Car test = new Car();
        test.drive();
    }
}

