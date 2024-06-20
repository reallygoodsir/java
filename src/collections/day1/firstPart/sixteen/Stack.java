package collections.day1.firstPart.sixteen;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    private boolean contains(int element) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static Stack findUniqueElements(Stack stack1, Stack stack2) {
        Stack resultStack = new Stack(stack1.arr.length + stack2.arr.length);

        // Add all elements from stack1 to resultStack
        for (int i = 0; i <= stack1.top; i++) {
            int element = stack1.arr[i];
            if (!resultStack.contains(element)) {
                resultStack.push(element);
            }
        }

        // Add all elements from stack2 to resultStack
        for (int i = 0; i <= stack2.top; i++) {
            int element = stack2.arr[i];
            if (!resultStack.contains(element)) {
                resultStack.push(element);
            }
        }

        return resultStack;
    }

    public static void main(String[] args) {
        Stack result = new Stack(5);
        Stack stack1 = new Stack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("\nStack-1");
        stack1.display();
        Stack stack2 = new Stack(5);
        stack2.push(3);
        stack2.push(5);
        stack2.push(6);
        System.out.println("\nStack-2");
        stack2.display();
        Stack stack3 = new Stack(5);
        stack3.push(1);
        stack3.push(2);
        stack3.push(4);
        System.out.println("\nStack-3");
        stack3.display();
        System.out.println("\nNew stack that contains all elements from two stacks (stack1, stack2) without duplicates:");
        result = findUniqueElements(stack1, stack2);
        result.display();
        System.out.println("\nNew stack that contains all elements from two stacks (stack1, stack3) without duplicates:");
        result = findUniqueElements(stack1, stack3);
        result.display();
        System.out.println("\nNew stack that contains all elements from two stacks (stack3, stack2) without duplicates:");
        result = findUniqueElements(stack3, stack2);
        result.display();
    }
}
