import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Java 9: Collection Factory Method
        List<String> names = List.of("Alice", "Bob");
        System.out.println(names); // [Alice, Bob]

        // Java 10
        var message = "Hello, Java 10!";
        System.out.println(message);

        // Java 11: String API enhancement
        String text = "   Java 11   ";
        System.out.println(text.strip()); // "Java 11"
        System.out.println("abc\nxyz".lines().count()); // 2


        // Java 12: Switch Expression
        int day = 1;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Other";
        };
        System.out.println(result);

        // Java 13: Text Block
        String sql = """
                SELECT * 
                FROM users
                WHERE active = true;
                """;
        System.out.println(sql);

        // Java 14
        Object obj = new Person("Anna", 30);
        if (obj instanceof Person p) {
            System.out.println(p.name()); // Anna
        }

        // Java 15: Sealed Class
        Animal a = new Dog();
        System.out.println(a.getClass().getSimpleName()); // Dog

        // Java 16
        Point p = new Point(1, 2);
        System.out.println(p); // Point[x=1, y=2]

        // Java 17: Pattern Matching switch
        Shape s = new Circle(2.0);
        String desc = switch (s) {
            case Circle c -> "Circle with radius " + c.radius();
            case Square sq -> "Square with side " + sq.side();
        };
        System.out.println(desc);

        // Java 18: UTF-8 by default (visible if using non-ASCII)
        String smile = "😊";
        System.out.println(smile);

        // Java 19
        Thread vt = Thread.startVirtualThread(() -> {
            System.out.println("Java 19: Hello from virtual thread!");
        });
        vt.join(); // Wait for virtual thread to complete

        // Java 21
        Thread vt2 = Thread.ofVirtual().start(() -> {
            Object o = new Person("Leo", 25);
            String desc2 = switch (o) {
                case Person(String name, int age) -> "Java 21: Name = " + name + ", Age = " + age;
                default -> "Java 21: Unknown";
            };
            System.out.println(desc);
        });
        vt.join(); // Make sure the virtual thread finishes
    }
}
