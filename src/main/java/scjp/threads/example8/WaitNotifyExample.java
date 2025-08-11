package scjp.threads.example8;

public class WaitNotifyExample {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    try {
                        System.out.println("Thread is waiting...");
                        lock.wait();
                        System.out.println("Thread resumed!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread notifyingThread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000); // Give waitingThread time to start and wait
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock) {
                    System.out.println("Thread is notifying...");
                    lock.notify();
                }
            }
        });

        waitingThread.start();
        notifyingThread.start();
    }
}

