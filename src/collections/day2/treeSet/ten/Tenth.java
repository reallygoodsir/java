package collections.day2.treeSet.ten;

import java.util.Scanner;
import java.util.TreeSet;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer specified = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(22);
        set.add(3500);
        set.add(2);
        set.add(6);
        set.add(7);
        for (Integer i : set) {
            if(i >= specified){
                System.out.println(i);
            }
        }
    }
}
