package collections.day1.firstPart.fifteen;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int getSize() {
        return top + 1;
    }
    public Stack findElementsNotInStack(Stack otherStack) {
        Stack resultStack = new Stack(this.arr.length);
        for (int i = 0; i <= this.top; i++) {
            boolean found = false;
            for (int j = 0; j <= otherStack.top; j++) {
                if (this.arr[i] == otherStack.arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                resultStack.push(this.arr[i]);
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
        System.out.println("\nFind elements that are in the first stack (stack1) but not in the second stack (stack2):");
        result = stack1.findElementsNotInStack(stack2);
        result.display();
        System.out.println("\nFind elements that are in the first stack (stack1) but not in the second stack (stack3):");
        result = stack1.findElementsNotInStack(stack3);
        result.display();
        System.out.println("\nFind elements that are in the first stack (stack3) but not in the second stack (stack2):");
        result = stack3.findElementsNotInStack(stack2);
        result.display();
    }
}
