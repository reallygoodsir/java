package scjp.threads.example2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}
