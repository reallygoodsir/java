package collections.day1.secondPart.six;

import java.util.ArrayList;

public class Sixth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println("The array list:\n");
        if(list.contains("second")){
            System.out.println("contains second");
        }
        if(list.contains("seven")){
            System.out.println("contains seven");
        }
        else {
            System.out.println("doesnt contain seven");
        }
    }
}
