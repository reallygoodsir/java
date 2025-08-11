package scjp.generics.example5.task4;

public class LinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        node.next = head;
        head = node;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

