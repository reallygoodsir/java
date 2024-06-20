package collections.day1.firstPart.seventeen;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public Stack slice(int start, int end) {
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid indices");
            return null;
        }

        int newSize = end - start + 1;
        Stack subStack = new Stack(newSize);

        for (int i = start; i <= end; i++) {
            subStack.push(arr[i]);
        }

        return subStack;
    }
    public static void main(String[] args) {

        Stack stack1 = new Stack(8);
        Stack result = new Stack(8);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        System.out.println("Original Stack:");
        stack1.display();
        System.out.println("\nExtract a portion from the said stack:");
        int index_pos1 = 1;
        int index_pos2 = 3;
        System.out.println("\nIndex Position1 = " + index_pos1 + " Index Position2 = " + index_pos2);
        result = stack1.slice(index_pos1, index_pos2);
        result.display();
        index_pos1 = 3;
        index_pos2 = 7;
        System.out.println("\nIndex Position1 = " + index_pos1 + " Index Position2 = " + index_pos2);
        result = stack1.slice(index_pos1, index_pos2);
        result.display();
    }
}
