package collections.day1.firstPart.four;

import collections.day1.firstPart.General;

import java.util.HashSet;

public class Stack extends General {

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<Integer>();
        Stack temp = new Stack(arr.length);

        while (!isEmpty()) {
            int current = pop();
            if (!set.contains(current)) {
                set.add(current);
                temp.push(current);
            }
        }

        while (!temp.isEmpty()) {
            push(temp.pop());
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(3);
        stack.display();
        stack.removeDuplicates();
        stack.display();
    }
}
