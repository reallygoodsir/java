package scjp.threads.example3;

public class App {
    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();

        Thread thread1 = new Thread(syncTest);
        Thread thread2 = new Thread(syncTest);
        Thread thread3 = new Thread(syncTest);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
