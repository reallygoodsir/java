package collections.day1.secondPart.twelve;

import java.util.ArrayList;

public class Twelfth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        boolean same = true;
        for(int i = 0; i < list.size(); i++){
            int sameMini = list.get(i).compareTo(list2.get(i));
            if(sameMini != 0){
                same = false;
                break;
            }
        }
        System.out.println(same);
    }
}
