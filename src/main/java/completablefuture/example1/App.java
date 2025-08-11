package completablefuture.example1;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            return "First";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "Second");

        CompletableFuture<Object> any = CompletableFuture.anyOf(f1, f2);
        System.out.println(any.join()); // Likely outputs: Second
    }
}
