package scjp.generics.example5.task7;

public class App {
    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>();
        cache.put(1, "yes");
        cache.put(2, "no");
        cache.put(3, "maybe");
        System.out.println(cache.get(2));
    }
}
