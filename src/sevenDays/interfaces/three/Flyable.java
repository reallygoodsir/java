package sevenDays.interfaces.three;

public interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj(){
        System.out.println("Spacecraft flying");
    }
}

class Airplane implements Flyable {
    public void fly_obj(){
        System.out.println("Airplane flying");
    }
}

class Helicopter  implements Flyable {
    public void fly_obj(){
        System.out.println("Helicopter  flying");
    }
}
