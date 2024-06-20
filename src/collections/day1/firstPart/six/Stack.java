package collections.day1.firstPart.six;

import collections.day1.firstPart.General;

import java.util.ArrayList;

public class Stack extends General {
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }
    public void removeElement(int element){
        ArrayList<Integer> removedElements = new ArrayList<>();
        boolean removalCompleted = false;
        while(!removalCompleted) {
            int popped = pop();
            if (popped != element) {
                removedElements.add(popped);
            } else {
                removalCompleted = true;
                break;
            }
        }
        for(int i = 0; i < removedElements.size(); i++){
            push(removedElements.get(i));
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("Removing: \n");
        stack.removeElement(4);
        stack.display();
    }
}
