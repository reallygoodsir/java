package collections.day1.secondPart.eighteen;

import java.util.ArrayList;

public class Eighteenth {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        boolean isEmpty = true;
        if(list.size() != 0){
            isEmpty = false;
        }
        System.out.println(isEmpty);
    }
}
