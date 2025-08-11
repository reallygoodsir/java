package completablefuture.example2;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) {
        CompletableFuture<Void> all = CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> System.out.println("Task 1")),
                CompletableFuture.runAsync(() -> System.out.println("Task 2"))
        );

        all.join(); // Waits for both tasks to finish
    }
}

