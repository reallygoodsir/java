package sevenDays.inheritance.nine;

class Vehicle{
    static String make = "";
    static String model;
    static int year;
    static String fuelType;

    void fuelEfficiency(){
        System.out.println("calculating fuel efficiency");
    }
    void distanceTravelled(){
        System.out.println("calculating distance travelled");
    }
    void maxSpeed(){
        System.out.println("calculating max speed");
    }
}

class Truck extends Vehicle{
    public static void main(String[] args) {
        make = "Ford";
        model = "Trucky";
        year = 1977;
        fuelType = "Diesel";
    }
}

class Car extends Vehicle{
    public static void main(String[] args) {
        make = "Tesla";
        model = "Something";
        year = 2011;
        fuelType = "Electric";
    }
}

class Motorcycle extends Vehicle{
    public static void main(String[] args) {
        make = "Trucky";
        model = "Truckily";
        year = 1977;
        fuelType = "Gas";
    }
}
