package collections.day1.firstPart.thirteen;

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

    public static boolean identicalStacks(Stack stack1, Stack stack2){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        if(stack1.getSize() != stack2.getSize()){
            System.out.println("false");
            return false;
        }
        while(!stack1.isEmpty() & !stack2.isEmpty()){
            int oneElement = stack1.pop();
            int twoElement = stack2.pop();
            if(oneElement != twoElement){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }



    public static void main(String[] args) {
        Stack stack1 = new Stack(11);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.display();

        Stack stack2 = new Stack(11);
        stack2.push(6);
        stack2.push(5);
        stack2.push(4);
        System.out.println("\n");
        stack2.display();
        boolean testing = identicalStacks(stack1, stack2);

    }
}
