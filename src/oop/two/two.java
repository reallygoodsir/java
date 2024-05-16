package oop.two;

class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog first = new Dog("Dogg", "Dog");
        Dog second = new Dog("Snoop", "Big Dog");
        System.out.println("Before:\n" + first.name + " " + first.breed);
        System.out.println(second.name + " " + second.breed + "\n\nAfter:");
        first.setName("Cat");
        second.setBreed("Small Dog");
        System.out.println(first.name + " " + first.breed);
        System.out.println(second.name + " " + second.breed);
    }
}
