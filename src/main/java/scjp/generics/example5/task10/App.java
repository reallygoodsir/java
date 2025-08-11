package scjp.generics.example5.task10;

public class App {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 6, 12};
        System.out.println(ArrayUtils.toList(array));
    }
}
