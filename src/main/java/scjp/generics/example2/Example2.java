package scjp.generics.example2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        // List<Parent> myList = new ArrayList<Child>(); // NO!
        // List<Object> myList = new ArrayList<JButton>(); // NO!
        // List<Number> numbers = new ArrayList<Integer>(); // NO! remember that Integer is a subtype of Number

        List<JButton> myList1 = new ArrayList<JButton>(); // yes
        List<Object> myList2 = new ArrayList<Object>(); // yes
        List<Integer> myList3 = new ArrayList<Integer>(); // yes

        Parent[] myArray = new Child[3]; // yes
        myArray[0] = new Parent();
        myArray[1] = new Parent();
        myArray[2] = new Child();
        Object[] myArray2 = new JButton[3]; // yes
        myArray2[0] = new Object();
        myArray2[1] = new JButton();
        myArray2[2] = new JButton();
        Number[] numbers = new Double[2]; // yes
        numbers[0] = new Double(2.3);
        numbers[12] = new Double(4.3);
    }
}
