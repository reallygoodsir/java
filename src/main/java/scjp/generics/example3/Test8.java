package scjp.generics.example3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    // odd, but correct to use "extend"
    public static void print(List<? extends Serializable> list) {
        for (Serializable serializable : list) {
            System.out.println(serializable.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(new Integer(500));
        integers.add(new Integer(800));
        print(integers);

        List<String> strings = new ArrayList<String>();
        strings.add(new String("str1"));
        strings.add(new String("str2"));
        print(strings);
    }
}
