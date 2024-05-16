package interfaces.two;

public interface Animal {
    void bark();
     default void speak(){
        System.out.println("animal speaking");
    }
}

