package completablefuture.example3;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) {
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Something went wrong");
        }).exceptionally(ex -> "Fallback value");

        System.out.println(future.join()); // Outputs: Fallback value
    }
}
