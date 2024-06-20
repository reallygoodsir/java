package collections.day1.thirdPart.ten;

import java.util.LinkedList;

public class Tenth {
    public static void main(String[] args) {
        int firstSpecified = -1;
        int lastSpecified = -1;
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Pink");
        list.add("Dark Pink");
        list.add("Pink");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("pINk");
        System.out.println("min index 0; max index 6");
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            if(line.equalsIgnoreCase("pink")){
                if(firstSpecified != -1){
                    lastSpecified = i;
                }
                else {
                    firstSpecified = i;
                }
            }
        }
        System.out.println(list + "\n");
        System.out.println(firstSpecified + ", " + lastSpecified);
    }
}
