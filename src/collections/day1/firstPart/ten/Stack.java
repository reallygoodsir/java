package collections.day1.firstPart.ten;

import collections.day1.firstPart.General;

import java.util.ArrayList;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void getElementFromTop(int index) {
        ArrayList<Integer> removedElements = new ArrayList<>();
        int current = 0;
        do {
            int popped = pop();
            removedElements.add(popped);
            current++;

        }while (index != current);
        System.out.println(removedElements.get(removedElements.size() - 1));
        int store = removedElements.get(removedElements.size() - 1);
        removedElements.remove(removedElements.size() - 1);
        for (int i = 0; i < removedElements.size(); i++) {
            push(removedElements.get(i));
        }
        push(store);
    }

    public static void main(String[] args) {
        collections.day1.firstPart.eight.Stack stack = new collections.day1.firstPart.eight.Stack(20);
        stack.push(1); // bottom
        stack.push(2);
        stack.push(55);
        stack.push(4);
        stack.push(3500);
        stack.push(999); // top
        stack.display();
        stack.getElementFromTop(2);
        stack.display();
    }
}
