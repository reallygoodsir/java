package scjp.threads.example2;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=============================================");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        thread1.join(); // main thread is suspended (waiting/blocked) and it is waiting when thread1 will be finished and after that main will execute it's code
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
