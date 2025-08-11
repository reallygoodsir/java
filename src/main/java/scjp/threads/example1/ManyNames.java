package scjp.threads.example1;

public class ManyNames {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("1");
        Thread.sleep(10000);
        System.out.println("2");
        // Make one Runnable

//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getName());
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);
        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");
        one.start();
        two.start();
        three.start();
    }
}
