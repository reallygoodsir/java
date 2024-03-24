package arrays;

import java.util.*;

public class ArraysUtils {

    // sort a numeric array
    public static StringBuilder sortIntArray(int[] array) {
        StringBuilder sortedArray = new StringBuilder();
        Arrays.sort(array);
        for (int i : array) {
            sortedArray.append(i);
            sortedArray.append(" ");
        }
        return sortedArray;
    }

    // sort a string array
    public static StringBuilder sortArray(String[] array) {
        StringBuilder sortedArray = new StringBuilder();
        Arrays.sort(array);
        for (String i : array) {
            sortedArray.append(i);
            sortedArray.append(" ");
        }
        return sortedArray;
    }

    // sum values of an array
    public static int sumValues(int[] array) {
        int valueSum = 0;
        for (int i : array) {
            valueSum += i;
        }
        return valueSum;
    }

    // print the grid
    public static void printGrid() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    // calculate the average value of array elements
    public static int calculateAverageValue(int[] array) {
        int valueSum = 0;
        int valuesCount = 0;
        for (int i : array) {
            valueSum += i;
            valuesCount++;
        }
        return valueSum / valuesCount;
    }

    // test if an array contains a specific value
    public static boolean checkSpecificValue(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    // remove a specific element from an array
    public static StringBuilder removeSpecificValue(int[] array, int value) {
        StringBuilder valueless = new StringBuilder();
        for (int i : array) {
            if (i != value) {
                valueless.append(i);
            }
        }
        return valueless;
    }

    // find the index of an array element
    public static int findElementIndex(String[] array, String element) {
        for (int index = 0; index < array.length; index++) {
            String s = array[index];
            if (s.equals(element)) {
                System.out.println(index);
                return index;
            }
        }
        return -1;
    }

    // copy an array by iterating the array.
    public static int[] rewriteArray(int[] array) {
        int[] bigArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            bigArray[index] = array[index];
        }
        for (int i : bigArray) {
            System.out.println(i);
        }
        return bigArray;
    }

    // find the maximum and minimum value of an array.
    public static void findExtremums(int[] array) {
        int max = 0;
        int min = 0;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("max: " + max + "\nmin: " + min);
    }

    // reverse an array of integer values
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int index = array.length - 1, i = 0; index > -1; index--, i++) {
            reversedArray[i] = array[index];
        }
        for (int q : reversedArray) {
            System.out.println(q);
        }
        return reversedArray;
    }

    // find duplicate values in an array of integer values
    public static StringBuilder findDuplicatedIntegerValues(int[] array) {
        int value = 0;
        int dupeSeeker = 0;
        StringBuilder dupeSaver = new StringBuilder();
        for (value = 0; value < array.length; value++) {
            for (dupeSeeker = value + 1; dupeSeeker < array.length; dupeSeeker++) {
                if (array[value] == array[dupeSeeker]) {
                    dupeSaver.append(array[value] + " ");
                }
            }
        }
        System.out.println(dupeSaver);
        return dupeSaver;
    }

    // find duplicate values in an array of string values
    public static StringBuilder findDuplicatedStringValues(String[] array) {
        int value = 0;
        int dupeSeeker = 0;
        String firstWord;
        String secondWord;

        StringBuilder dupeSaver = new StringBuilder();
        for (value = 0; value < array.length; value++) {
            firstWord = array[value];
            for (dupeSeeker = value + 1; dupeSeeker < array.length; dupeSeeker++) {
                secondWord = array[dupeSeeker];
                if (firstWord.equals(secondWord)) {
                    dupeSaver.append(secondWord + " ");
                }
            }
        }
        System.out.println(dupeSaver);
        return dupeSaver;
    }

    // find common elements between two arrays (string values)
    public static StringBuilder findCommonStringElements(String[] array1, String[] array2) {
        int value = 0;
        int dupeSeeker = 0;
        String firstWord;
        String secondWord;

        StringBuilder dupeSaver = new StringBuilder();
        for (value = 0; value < array1.length; value++) {
            firstWord = array1[value];
            for (dupeSeeker = value; dupeSeeker < array2.length; dupeSeeker++) {
                secondWord = array2[dupeSeeker];
                if (firstWord.equals(secondWord)) {
                    dupeSaver.append(secondWord + " ");
                }
            }
        }
        System.out.println(dupeSaver);
        return dupeSaver;
    }

    // find common elements between two integer arrays.
    public static StringBuilder findCommonIntegerElements(int[] array1, int[] array2) {
        int value = 0;
        int dupeSeeker = 0;

        StringBuilder dupeSaver = new StringBuilder();
        for (value = 0; value < array1.length; value++) {
            for (dupeSeeker = value; dupeSeeker < array2.length; dupeSeeker++) {
                if (array1[value] == array2[dupeSeeker]) {
                    dupeSaver.append(array1[value] + " ");
                }
            }
        }
        System.out.println(dupeSaver);
        return dupeSaver;
    }

    // remove duplicate elements from an array
    public static Set<String> removeDupes(String[] array1) {
        Set<String> result = new HashSet<>();
        String dupe;
        for (int wordBasis = 0; wordBasis < array1.length; wordBasis++) {
            String firstWord = array1[wordBasis];
            for (int wordSeeker = wordBasis + 1; wordSeeker < array1.length; wordSeeker++) {
                String secondWord = array1[wordSeeker];
                boolean theBoolean = firstWord.equalsIgnoreCase(secondWord);
                if (theBoolean) {
                    dupe = secondWord;
                    result.add(dupe);
                }
            }
        }
        System.out.println(result);
        return result;
    }

    // find the second largest element in an array
    public static String findSecondLargestWord(String[] array) {
        String biggestWord = "";
        String secondBiggestWord = "";
        for (int i = 0; i < array.length; i++) {
            String currentWord = array[i];
            if (currentWord.length() > biggestWord.length()) {
                biggestWord = currentWord;
            }
        }
        for (int q = 0; q < array.length; q++) {
            String currentWord = array[q];
            if (currentWord.length() > secondBiggestWord.length() && !currentWord.equalsIgnoreCase(biggestWord)) {
                secondBiggestWord = currentWord;
            }
        }
        System.out.println(biggestWord + "\nThe second biggest word is \"" + secondBiggestWord + "\"");
        return secondBiggestWord;
    }

    // convert an array to an ArrayList
    public static ArrayList<String> convertArrayToArrayList(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (String s : array) {
            newArray.add(s);
        }
        System.out.println(newArray);
        return newArray;
    }

    // convert an ArrayList to an array
    public static String[] convertArrayListToArray(ArrayList<String> arrayList) {
        StringBuilder arrayPrint = new StringBuilder();
        int i = 0;
        String[] array = new String[arrayList.size()];
        for (int q = 0; q < arrayList.size(); q++) {
            array[i] = arrayList.get(q);
            i++;
        }
        for (String s : array) {
            arrayPrint.append(s);
            arrayPrint.append(" ");
        }
        System.out.println(arrayPrint);
        return array;
    }

    // find all pairs of elements in an array whose sum is equal to a specified number
    public static StringBuilder findNumberPairsEqualToSpecifiedNumber(int[] array, int specifiedNumber) {
        StringBuilder resultPrint = new StringBuilder();
        int resultSize = 0;
        for (int i = 0; i < array.length; i++) {
            for (int b = i + 1; b < array.length; b++) {
                if (array[i] + array[b] == specifiedNumber) {
                    resultSize++;
                }
            }
        }
        String[] result = new String[resultSize];
        int sumn = 0;
        for (int i = 0; i < array.length; i++) {
            for (int b = i + 1; b < array.length; b++) {
                if (array[i] + array[b] == specifiedNumber) {
                    String firstHalf = String.valueOf(array[i]);
                    String secondHalf = String.valueOf(array[b]);
                    result[sumn] = firstHalf + ", " + secondHalf + "\n";
                    sumn++;

                }
            }
        }
        for (String s : result) {
            resultPrint.append(s);
        }
        System.out.println(resultPrint);
        return resultPrint;
    }

    // test two arrays' equality
    public static boolean isTwoArraysEqual(String[] array1, String[] array2) {
        int i;
        if (array1.length >= array2.length) {
            for (i = 0; i < array1.length; i++) {
                if (!array1[i].equalsIgnoreCase(array2[i])) {
                    return false;
                }
            }
        } else {
            for (i = 0; i < array2.length; i++) {
                if (!array1[i].equalsIgnoreCase(array2[i])) {
                    return false;
                }
            }
        }
        return true;
    }


    // find common elements in three sorted (in non-decreasing order) arrays
    public static StringBuilder findCommonElementsInThreeArrays(String[] array1, String[] array2, String[] array3) {
        StringBuilder commons = new StringBuilder();
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);
        System.out.println("First:");
        for (int i = 0; i < array1.length; i++) {
            String firstWord = array1[i];
            for (int b = 0; b < array2.length; b++) {
                String secondWord = array2[b];
                if (firstWord.equals(secondWord)) {
                    commons.append(firstWord + "; ");
                }
            }
        }
        commons.append("\n\nSecond:\n");
        for (int i = 0; i < array1.length; i++) {
            String firstWord = array1[i];
            for (int b = 0; b < array3.length; b++) {
                String secondWord = array3[b];
                if (firstWord.equals(secondWord)) {
                    commons.append(firstWord + "; ");
                }
            }
        }
        commons.append("\n\nThird:\n");
        for (int i = 0; i < array2.length; i++) {
            String firstWord = array2[i];
            for (int b = 0; b < array3.length; b++) {
                String secondWord = array3[b];
                if (firstWord.equals(secondWord)) {
                    commons.append(firstWord + "; ");
                }
            }
        }
        System.out.println(commons);
        return commons;
    }

    // move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements
    public static void moveZerosToEnd(int[] array) {
        Arrays.sort(array);
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        for (int i : array) {
            if (i % 10 == 0) {
                secondHalf.append(i + " ");
            } else {
                firstHalf.append(i + " ");
            }
        }
        System.out.println(firstHalf + "; " + secondHalf);
    }

    // find the number of even and odd integers in a given array of integers
    public static void findEvenOdd(int[] array) {
        Arrays.sort(array);
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i : array) {
            if (i % 2 == 0) {
                even.append(i + " ");
            } else {
                odd.append(i + " ");
            }
        }
        System.out.println("Even numbers: " + even + "\nOdd numbers: " + odd);
    }

    public static void printFourCombinedEqualToValue(int[] array, int value) {
        int s = value;
        StringBuilder fourEquals = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int b = i + 1; b < array.length; b++) {
                for (int j = b + 1; j < array.length; j++) {
                    for (int q = j + 1; q < array.length; q++) {
                        int sumOfFour = array[i] + array[b] + array[j] + array[q];
                        if (sumOfFour == s) {
                            fourEquals.append(array[i] + " ");
                            fourEquals.append(array[b] + " ");
                            fourEquals.append(array[j] + " ");
                            fourEquals.append(array[q] + ";");
                            fourEquals.append("\n");
                        }
                    }
                }
            }
        }
        System.out.println(fourEquals);
    }

    public static void printNegativesBeforePositives(int[] array) {
        StringBuilder negatives = new StringBuilder();
        StringBuilder positives = new StringBuilder();

        for (int i : array) {
            if (i < 0) {
                negatives.append(i + " ");
            } else {
                positives.append(i + " ");
            }
        }
        System.out.println(negatives + "" + positives);
    }

    public static void sortElementsByRules(int[] array) {
        List<Integer> result = new ArrayList<>(array.length);
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element);
        }

        for (int moveForwardIndex = 0, moveBackwardIndex = array.length - 1;
             moveForwardIndex <= moveBackwardIndex;
             moveForwardIndex++, moveBackwardIndex--) {

            System.out.println("moveUpIndex " + moveForwardIndex);
            System.out.println("moveBackwardIndex " + moveBackwardIndex);
            System.out.println("array[moveBackwardIndex] " + array[moveBackwardIndex]);
            System.out.println("array[moveUpIndex] " + array[moveForwardIndex]);

            if (moveForwardIndex == moveBackwardIndex) {
                result.add(array[moveForwardIndex]);
            } else {
                result.add(array[moveBackwardIndex]);
                result.add(array[moveForwardIndex]);
            }
            System.out.println(result);
            System.out.println();
        }
    }

    public static void sortArrays(int[] array1, int[] array2) {
        StringBuilder output = new StringBuilder();
        int firstArraySize = array1.length;
        int secondArraySize = array2.length;
        int[] unitedArray = new int[firstArraySize + secondArraySize];
        int index = 0;

        for (int s : array1) {
            unitedArray[index] = s;
            index++;
        }

        for (int s : array2) {
            unitedArray[index] = s;
            index++;
        }

        Arrays.sort(unitedArray);
        int[] newArray1 = new int[firstArraySize];
        int[] newArray2 = new int[secondArraySize];
        int i;

        for (i = 0; i < newArray1.length; i++) {
            newArray1[i] = unitedArray[i];
        }
        for (int q = 0; q < newArray2.length; q++, i++) {
            newArray2[q] = unitedArray[i];
        }

        for (int s : newArray1) {
            output.append(s + " ");
        }
        for (int s : newArray2) {
            output.append(s + " ");
        }
        System.out.println(output);
    }

    public static void shuffleArray(Integer[] array) {
        StringBuilder input = new StringBuilder();
        for (Integer i : array) {
            input.append(i + " ");
        }
        System.out.println("Input: " + input);
        List<Integer> arrayList = Arrays.asList(array);
        Collections.shuffle(arrayList);
        arrayList.toArray(array);

        StringBuilder output = new StringBuilder();
        for (Integer i : array) {
            output.append(i + " ");
        }
        System.out.println("Output: " + output);
    }

    public static StringBuilder contiguousEqualsSpecValue(int[] array, int specifiedValue) {
        for (int i = 0; i < array.length; i++) {
            int summary = array[i];
            StringBuilder q = new StringBuilder();
            q.append(array[i] + " ");
            for (int j = i + 1; j < array.length; j++) {
                summary += array[j];
                q.append(array[j] + " ");
                if (summary == specifiedValue) {
                    return q;
                } else if (summary > specifiedValue) {
                    for (int add = 0; ; add++) {
                        int newSummary = add + summary;
                        if (newSummary == specifiedValue) {
                            return q;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void tripletsEqualSpecValue(int[] array, int specifiedValue) {
        StringBuilder equaling = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int q = j + 1; q < array.length; q++) {
                    int sumn = array[i] + array[j] + array[q];
                    if (sumn == specifiedValue) {
                        equaling.append(array[i] + " ");
                        equaling.append(array[j] + " ");
                        equaling.append(array[q] + "\n---\n");
                    }
                }
            }
        }
        System.out.println(equaling);
    }

    public static boolean noZeroNoNegOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int word = array[i];
            if (word == 0 || word == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean sumOfTens(int[] array) {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == 10) {
                summary += element;
            }
        }
        if (summary == 30) {
            return true;
        }
        return false;
    }

    public static boolean sixtyFiveAndSeventySevenChecker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int word = array[i];
            if (word == 65 || word == 77) {
                return true;
            }
        }
        return false;
    }
}