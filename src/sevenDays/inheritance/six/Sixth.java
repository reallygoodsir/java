package sevenDays.inheritance.six;

class Animal{
    void move(){
        System.out.println("moving");
    }
}

class Cheetah extends Animal{
    void move(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Cheetah b = new Cheetah();
        b.move();
    }
}
