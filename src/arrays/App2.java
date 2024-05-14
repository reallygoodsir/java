package arrays;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        Integer[] integerTester = {15, 1, 5, 10, 3, 8};
        int[] intTester = {15, 1, 5, 10, 3, 8, 0};
        int[] secondIntTester = {3, 5, 10, 77, 2, -15, -22, 8, 3, 40, 10, 40, 2, 0};
        int[] thirdIntTester = {1,2,9,11};
        ArrayList<String> arrayListTester = new ArrayList<String>();
        arrayListTester.add("word");
        arrayListTester.add("implemented");
        String[] stringTester = {"T", "Q", "A", "Z", "B", "C", "O"};
        String[] equalStringTester = {"T", "Q", "A", "Z", "B", "C", "O"};
        String[] secondStringTester = {"T", "C", "A", "T", "B", "C"};
        String[] wordLengthTester = {"very", "enormous", "i", "sophisticated", "wax", "no"};


        ArraysUtils.sortIntArray(intTester);
//        ArraysUtils.sortArray(stringTester);
//
//        ArraysUtils.sumValues(intTester);
//
//        ArraysUtils.calculateAverageValue(intTester);
//
//        ArraysUtils.calculateAverageValue(intTester);
//
//        ArraysUtils.printSomething();
//
//        ArraysUtils.specificValueChecker(intTester, 10);
//        System.out.println("\n");
//
//        ArraysUtils.elementIndex(secondStringTester, "B");
//        System.out.println("\n");
//        ArraysUtils.rewriteArray(secondIntTester);
//
//        ArraysUtils.arraysExtremums(secondIntTester);
//
//        ArraysUtils.reverseArray(secondIntTester);
//
//        ArraysUtils.dupeIntegerValues(secondIntTester);
//
//        ArraysUtils.dupeStringValues(secondStringTester);
//
//        ArraysUtils.twoStringArraysComparison(secondStringTester, stringTester);
//
//        ArraysUtils.twoIntegerArraysComparison(secondIntTester, intTester);
//
//        ArraysUtils.removeDupes(secondStringTester);
//
//        ArraysUtils.secondLargestWord(wordLengthTester);
//
//        ArraysUtils.secondSmallestWord(wordLengthTester);
//
//        ArraysUtils.arrayToArrayList(stringTester);
//
//        ArraysUtils.arrayListToArray(arrayListTester);
//        ArraysUtils.numberPairsEqualToSpecifiedNumber(intTester, 15);
//
//        boolean b = ArraysUtils.twoArraysEquality(stringTester, equalStringTester);
//        System.out.println(b);
//        boolean q = ArraysUtils.twoArraysEquality(stringTester, secondStringTester);
//        System.out.println(q);
//
//        ArraysUtils.commonElementsInThreeArrays(stringTester, equalStringTester, secondStringTester);
//
//        ArraysUtils.zerosLast(secondIntTester);
//
//        ArraysUtils.evenOdd(secondIntTester);
//
//        ArraysUtils.fourCombinedEqualToValue(intTester, 20);
//
//        ArraysUtils.negativesBeforePositives(secondIntTester);
//
//        ArraysUtils.sort(intTester);
//
//        ArraysUtils.sortArrays(intTester, thirdIntTester);
//
//        ArraysUtils.evenOddSecond(intTester);
//
//        ArraysUtils.shuffleArray(integerTester);
//
//        StringBuilder b = ArraysUtils.contiguousEqualsSpecValue(intTester, 4);
//        System.out.println(b);
//
//        int [] aarr =  { 1, 6, 3, 0, 8, 4, 1, 7 };
//        ArraysUtils.tripletsEqualSpecValue(aarr, 11);

//  --------------------------------------------------------------------------------------------------------------------
        System.out.println("First:");
        boolean b = ArraysUtils.noZeroNoNegOne(secondIntTester); // EXERCISE 30
        System.out.println(b + "\n\n");
        System.out.println("Second:");
        int[] tensChecker =  {10, 6, 10, 0, 8, 10, 1, 7, 10 };
        boolean qqq = ArraysUtils.sumOfTens(tensChecker); // EXERCISE 31
        System.out.println(qqq + "\n\n");

        System.out.println("Third:");
        boolean zzz = ArraysUtils.sixtyFiveAndSeventySevenChecker(secondIntTester); // EXERCISE 32
        System.out.println(zzz);
        boolean bbb = ArraysUtils.sixtyFiveAndSeventySevenChecker(intTester); // EXERCISE 32
        System.out.println(bbb);
    }
}
