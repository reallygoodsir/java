package sevenDays.interfaces.two;

public interface Animal {
    void bark();
    default void speak(){
        System.out.println("animal speaking");
    }
}

class Dog implements Animal{
    public void bark(){
        System.out.println("dog bark");
    }
    public void speak(){
        System.out.println("dog speaking");
    }
}
