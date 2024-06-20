package collections.day1.firstPart.five;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }
    public void retrieveBottomAndTop(){
        int topElement = peek();
        System.out.println("Top element: " + topElement);
        int bottomElement = -1;
        while (!isEmpty()) {
            bottomElement = pop();
        }
        System.out.println("Bottom element: " + bottomElement);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.retrieveBottomAndTop();
        stack.display();
    }
}
