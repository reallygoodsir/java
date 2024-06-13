package generics.one;

public class First {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array2.length != array1.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {
                1,
                2,
                7,
                4
        };
        Integer[] arr2 = {
                1,
                2,
                3,
                4
        };
        Integer[] arr3 = {
                1,
                2,
                3,
                4
        };
        boolean comparison = compareArrays(arr1, arr2);
        boolean comparison2 = compareArrays(arr2,arr3);
        System.out.println("(false) array1 and array2 compared: " + comparison);
        System.out.println("\n(true) array2 and array3 compared: " + comparison2);
    }
}
