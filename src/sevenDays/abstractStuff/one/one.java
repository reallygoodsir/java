package sevenDays.abstractStuff.one;

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("lion's sound");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("tiger's sound");
    }

    public static void main(String args[]) {
        Animal something = new Tiger();
        something.sound();
        Animal test = new Lion();
        test.sound();
    }
}