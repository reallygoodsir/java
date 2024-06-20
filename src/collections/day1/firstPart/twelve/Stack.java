package collections.day1.firstPart.twelve;

import collections.day1.firstPart.General;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int getSize() {
        return top + 1;
    }

    public static boolean isSubset(Stack stack1, Stack stack2) {
        Stack temp = new Stack(stack1.getSize());
        boolean isSubset = true;

        while (!stack1.isEmpty()) {
            int first = stack1.pop();
            boolean found = false;

            while (!stack2.isEmpty()) {
                int second = stack2.pop();

                if (first == second) {
                    found = true;
                    break;
                } else {
                    temp.push(second);
                }
            }

            while (!temp.isEmpty()) {
                stack2.push(temp.pop());
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        while (!temp.isEmpty()) {
            stack1.push(temp.pop());
        }

        return isSubset;
    }
}
