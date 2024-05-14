package sevenDays.abstractStuff.four;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat(){
        System.out.println("lion eat");
    }
    void sleep(){
        System.out.println("lion sleep");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("deer eat");
    }
    void sleep(){
        System.out.println("deer sleep");
    }
}

class Tiger extends Animal {
    void eat(){
        System.out.println("tiger eat");
    }
    void sleep(){
        System.out.println("tiger sleep");
    }

    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();
        System.out.println();
        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        System.out.println();
        Animal deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
