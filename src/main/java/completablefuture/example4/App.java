package completablefuture.example4;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Java")
                .thenCompose(str -> CompletableFuture.supplyAsync(() -> str + " CompletableFuture"));

        System.out.println(future.join()); // Outputs: Java CompletableFuture
    }
}

