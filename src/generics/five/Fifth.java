package generics.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifth {
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> comboList = new ArrayList<>();
        int iOld = 0;
        int iNew = 0;
        if(list1.size() >= list2.size()){
            while(list2.size() > iOld){
                comboList.add(iNew, list1.get(iOld));
                iNew++;
                comboList.add(iNew, list2.get(iOld));
                iOld++;
                iNew++;
            }
            while(list1.size() > iOld){
                comboList.add(iNew, list1.get(iOld));
                iNew++;
                iOld++;
            }
        }
        else{
            while(list1.size() > iOld){
                comboList.set(iNew, list1.get(iOld));
                iNew++;
                comboList.set(iNew, list2.get(iOld));
                iOld++;
            }
            while(list2.size() > iOld){
                comboList.set(iNew, list2.get(iOld));
                iNew++;
                iOld++;
            }
        }
        return comboList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(mergeLists(numbers, numbers2));
    }
}
