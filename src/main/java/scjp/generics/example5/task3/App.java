package scjp.generics.example5.task3;

public class App {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 2;
        Integer c = 44;
        Integer max = BoundedType.max(a,b,c);
        System.out.println(max);

    }
}
