package generics.three;

import java.util.Arrays;
import java.util.List;

public class Third {
    public static <T> int findTarget(List<T> userList, T target) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 2);
        int index = findTarget(numbers, 4);
        System.out.println(index + "\n");

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 2);
        int indexNotFound = findTarget(numbers2, 77);
        System.out.println(indexNotFound);
    }
}

