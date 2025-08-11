package scjp.generics.example5.task13;

public class App {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4};
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        SwapUtils.swap(array, 1, 2);
        for (Integer i : array) {
            System.out.print(i + " ");
        }
    }
}
