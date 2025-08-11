package scjp.generics.example5.task1;

public class App {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(5, "No");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Pair<Double, Boolean> pair2 = new Pair<>(6.6, true);
        System.out.println(pair2.getKey());
        System.out.println(pair2.getValue());
    }
}
