package collections.day1.secondPart.twentytwo;

import java.util.ArrayList;

public class TwentySecond {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        int number = list.size();

        for (int i = 0; i < number; i++)
            System.out.println(list.get(i));
    }
}

