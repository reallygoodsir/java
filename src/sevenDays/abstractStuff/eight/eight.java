package sevenDays.abstractStuff.eight;

abstract class Person{
    abstract void eat();
    abstract void exercise();
}


class Athlete extends Person{
    void eat(){
        System.out.println("the athlete is eating");
    }
    void exercise(){
        System.out.println("the athlete is exercising");
    }
}

class LazyPerson extends Person{
    void eat(){
        System.out.println("the lazy person is eating");
    }
    void exercise(){
        System.out.println("the lazy person is EXERCISING");
    }

    public static void main(String[] args) {
        Person athlete = new Athlete();
        System.out.println("Athlete: ");
        athlete.eat();
        athlete.exercise();
        Person lazyPerson = new LazyPerson();
        System.out.println("\nLazy person:");
        lazyPerson.eat();
        lazyPerson.eat();
        lazyPerson.eat();
        lazyPerson.exercise();
        lazyPerson.eat();
        lazyPerson.eat();
        lazyPerson.eat();
    }
}