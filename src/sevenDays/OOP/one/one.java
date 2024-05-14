package sevenDays.OOP.one;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person metro = new Person("Metro Boomin", 30);
        Person franklin = new Person("Franklin", 33);
        System.out.println(metro.name + " " + metro.age);
        System.out.println(franklin.name + " " + franklin.age);
    }
}
