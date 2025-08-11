package scjp.threads.example1;

public class NameRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("3");
            Thread.sleep(10000);
            System.out.println("4");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int x = 1; x <= 3; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
        }
    }
}
