package collections.day1.thirdPart.four;

import java.util.LinkedList;

public class Fourth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        for(int i = list.size() - 1; i > -1; i--){
            System.out.println(list.get(i));
        }
    }
}
