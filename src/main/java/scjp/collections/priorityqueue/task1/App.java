package scjp.collections.priorityqueue.task1;

import java.util.Collections;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(17);
        queue.add(2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
