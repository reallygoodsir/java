package sevenDays.Polymorphism.ten;


public class Animal {
    void eat(){
        System.out.println("Animal eat");
    }
    void sound(){
        System.out.println("Animal sound");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird eat");
    }

    @Override
    void sound() {
        System.out.println("Bird sound");
    }
}

class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("Panther eat");
    }

    @Override
    void sound() {
        System.out.println("Panther sound");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    void sound() {
        System.out.println("Tiger sound");
    }
}