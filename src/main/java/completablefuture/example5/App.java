package completablefuture.example5;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Java");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Future");

        CompletableFuture<String> combined = future1.thenCombine(future2, (a, b) -> a + " " + b);
        System.out.println(combined.join()); // Outputs: Java Future
    }
}

