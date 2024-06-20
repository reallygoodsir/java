package collections.day1.firstPart.nine;

import collections.day1.firstPart.General;

import java.util.ArrayList;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void getElementFromBottom(int index) {
        ArrayList<Integer> removedElements = new ArrayList<>();
        int current = arr.length;
        do {
            int popped = pop();
            removedElements.add(popped);
            current--;

        }while (index != current);
//        while (index != current) {
//            int popped = pop();
//            removedElements.add(popped);
//            current++;
//        }
        System.out.println(removedElements.get(removedElements.size() - 1));
        for (int i = 0; i < removedElements.size(); i++) {
            push(removedElements.get(i));
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        stack.push(1);
        stack.push(22);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.getElementFromBottom(2);
        stack.display();
    }
}
