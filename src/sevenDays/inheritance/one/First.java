package sevenDays.inheritance.one;

class Animal{

    void makeSound(){System.out.println("animal sound");}
}

class Cat extends Animal{

    void makeSound(){System.out.println("bark");}
    public static void main(String args[]){
        Cat test = new Cat();
        test.makeSound();
//        Animal classic = new Animal();
//        classic.makeSound();
    }
}
