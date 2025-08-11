package scjp.threads.example5;

public class App {
    public static void main(String[] args) {
        final NameListBadExample nl = new NameListBadExample();
        nl.add("Ozymandias");
        class NameDropper extends Thread {
            public void run() {
                String name = nl.removeFirst();
                System.out.println(name);
            }
        }
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        t1.start();
        t2.start();
    }
}
