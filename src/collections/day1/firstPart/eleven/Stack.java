package collections.day1.firstPart.eleven;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public static Stack mergeStacks(Stack stack1, Stack stack2) {
        int firstSize = stack1.top + 1;
        int secondSize = stack2.top + 1;
        Stack merged = new Stack(firstSize + secondSize);

        for (int i = 0; i < firstSize; i++) {
            merged.push(stack1.pop());
        }

        for (int i = 0; i < secondSize; i++) {
            merged.push(stack2.pop());
        }

        return merged;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.display();

        Stack stack2 = new Stack(5);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("\n");
        stack2.display();

        Stack mergedStack = mergeStacks(stack1, stack2);
        System.out.println("The new merged stack: \n");
        mergedStack.display();

    }
}
