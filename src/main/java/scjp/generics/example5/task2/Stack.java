package scjp.generics.example5.task2;

public class Stack<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(T element) {
        if (size == elements.length) {
            throw new RuntimeException("Stack overflow");
        }
        elements[size++] = element;
    }

    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Stack underflow");
        }
        @SuppressWarnings("unchecked")
        T element = (T) elements[--size];
        elements[size] = null;
        return element;
    }
}

