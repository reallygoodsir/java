package sevenDays.abstractStuff.eleven;

abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly(){
        System.out.println("eagle fly");
    }
    void makeSound(){
        System.out.println("eagle sound");
    }
}

class Hawk extends Bird {
    void fly(){
        System.out.println("hawk fly");
    }
    void makeSound(){
        System.out.println("hawk sound");
    }

    public static void main(String[] args) {
        Bird a = new Eagle();
        a.fly();
        a.makeSound();
        a.fly();
        System.out.println();
        Bird b = new Hawk();
        b.fly();
        b.makeSound();
    }
}
