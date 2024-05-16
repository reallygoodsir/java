package abstracts.four;

public class App {
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
