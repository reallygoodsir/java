package scjp.collections.priorityqueue.task2;

import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient(5, 10));
        queue.add(new Patient(5, 6));
        queue.add(new Patient(8, 12));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
