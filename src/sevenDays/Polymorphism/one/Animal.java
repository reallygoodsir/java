package sevenDays.Polymorphism.one;

public class Animal {
    void sound(){
        System.out.println("animal sound");
    }
}

class Bird extends Animal{
    @Override
    void sound() {
        System.out.println("bird sound");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("cat sound");
    }
}