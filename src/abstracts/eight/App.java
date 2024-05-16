package abstracts.eight;

public class App {
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
