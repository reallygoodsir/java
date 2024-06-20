package collections.day1.firstPart.fourteen;

import collections.day1.firstPart.General;

import java.util.ArrayList;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int getSize() {
        return top + 1;
    }

    public void findCommonElements(Stack otherStack) {
        Stack tempStack = new Stack(arr.length);
        for (int i = 0; i <= top; i++) {
            int currentElement = arr[i];
            for (int j = 0; j <= otherStack.top; j++) {
                if (currentElement == otherStack.arr[j]) {
                    tempStack.push(currentElement);
                    break;
                }
            }
        }
        System.out.print("Common elements: ");
        tempStack.display();
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(11);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(127);
        stack1.push(-22);
        stack1.display();

        Stack stack2 = new Stack(11);
        stack2.push(6);
        stack2.push(5);
        stack2.push(4);
        stack2.push(777);
        System.out.println("\n");
        stack2.display();
    }
}
