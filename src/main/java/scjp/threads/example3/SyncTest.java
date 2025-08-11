package scjp.threads.example3;

public class SyncTest implements Runnable {
    private final String lock = new String();

    public void doStuff() {
        for (int i = 0; i < 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Not synchronized safe code type first " + i);
        }

        synchronized (lock) {
            // write something in file
            for (int i = 0; i < 10; i++) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " must be synchronized");
            }
        }

        for (int i = 0; i < 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Not synchronized safe code type second " + i);
        }
    }

    @Override
    public void run() {
        doStuff();
    }
}

