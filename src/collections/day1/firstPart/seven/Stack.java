package collections.day1.firstPart.seven;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }
    public void swapTopTwo(){
        int firstPopped = pop();
        int secondPopped = pop();
        push(firstPopped);
        push(secondPopped);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(20);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.swapTopTwo();
        stack.display();
    }
}
