package collections.day1.firstPart.three;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean elementPresence(int element) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == element) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(4);
        stack.push(7);
        stack.display();
        stack.elementPresence(4); // true
        stack.pop();
        stack.pop();
        stack.push(22);
        stack.display();
        stack.elementPresence(4); // false
    }
}
