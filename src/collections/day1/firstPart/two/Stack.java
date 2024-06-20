package collections.day1.firstPart.two;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int countElements(){
        int answer = top + 1;
        System.out.println(answer + " elements");
        return top + 1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.countElements();
        stack.display();
    }
}
