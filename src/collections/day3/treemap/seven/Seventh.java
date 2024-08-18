package collections.day3.treemap.seven;

import java.util.Comparator;
import java.util.TreeMap;

public class Seventh {
    public static void main(String args[]){
        TreeMap<String,String> map = new TreeMap<>(new sortKey());
        map.put("C2", "Red");
        map.put("C4", "Green");
        map.put("C3", "Black");
        map.put("C1", "White");
        System.out.println(map);
    }
}
class sortKey implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
