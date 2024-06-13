package generics.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fourth {
    public static <T> List<T> reverseList(List<T> userList) {
        List<T> reversedList = new ArrayList<>();

        for (int i = userList.size() - 1; i >= 0; i--) {
            reversedList.add(userList.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List < Integer > reversedNumbers = reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers); // Output: [6, 5, 4, 3, 2, 1]
    }
}
