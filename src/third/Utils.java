package third;

import java.text.SimpleDateFormat;
import java.util.*;
import java.math.BigInteger;

public class Utils {
    // 1. print 'Hello' on screen and your name on a separate line.
    public static void printHello() {
        System.out.println("Hello");
        System.out.println("Kanye West");
    }

    // 4. print the results of the following operations.
    public static void printAnswers() {
        int first = -5 + 8 * 6;
        int second = (55 + 9) % 9;
        int third = 20 + -3 * 5 / 8;
        int fourth = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("First: " + first);
        System.out.println("Second : " + second);
        System.out.println("Third: " + third);
        System.out.println("Fourth: " + fourth);
    }

    // 5. takes two numbers as input and displays the product of two numbers.
    public static void twoScannedNumsMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        System.out.println(firstNumber * secondNumber);
    }

    // 6. print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    public static void twoNumberOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        int addition = firstNumber + secondNumber;
        int multiplication = firstNumber - secondNumber;
        int subtraction = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        System.out.println(addition + "\n" + multiplication + "\n" + subtraction + "\n" + divide);
    }

    // 7. takes a number as input and prints its multiplication table up to 10.
    public static void multiplyInputToTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number * i);
        }
    }

    // 8. display the following pattern.
    public static void printPattern() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    }

    // 11. print the area and perimeter of a circle.
    public static void circleCalculations(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + perimeter);

        System.out.println("Area: " + area);
    }

    // 12. takes three numbers as input to calculate and print the average of the numbers.
    public static void threeNumbersAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Third number: ");
        int thirdNumber = scanner.nextInt();
        scanner.close();
        int result = firstNumber + secondNumber + thirdNumber / 3;
        System.out.println(result);
    }

    // 13. print the area and perimeter of a rectangle.
    public static void rectangleCalculations(double width, double height) {
        double perimeter = 2 * (height + width);
        double area = width * height;
        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }

    // 14. print an American flag on the screen.
    public static void printUsaFlag() {
        System.out.println("* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================");
    }

    // 15. swap two variables.
    public static void swapTwoVariables(int firstVariable, int secondVariable) {
        int first = firstVariable;
        int second = secondVariable;
        int temp;
        System.out.println("Pre-swap:\n" + "First: " + first + "\nSecond: " + second + "\n");
        temp = first;
        first = second;
        second = temp;
        System.out.println("Post-swap:\n" + "First: " + first + "\nSecond: " + second);
    }

    // 16. print a face.
    public static void printFace() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    // 32. compare two numbers
    public static void compareTwoNumbers(int first, int second) {
        if (first > second) {
            System.out.println(first + " > " + second);
        } else if (first < second) {
            System.out.println(first + " < " + second);
        } else {
            System.out.println(first + " = " + second);
        }
    }

    // 37. reverse a string.
    public static void reverseString(String text) {
        StringBuilder result = new StringBuilder();
        char[] array = text.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        System.out.println(result);
    }

    // 38. count letters, spaces, numbers and other characters in an input string.
    public static void countUniqueCharacters(String text) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        char[] arrayedText = text.toCharArray();
        for (char element : arrayedText) {
            if (Character.isSpaceChar(element)) {
                spaces++;
            } else if (Character.isDigit(element)) {
                numbers++;
            } else if (Character.isLetter(element)) {
                letters++;
            } else {
                others++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + (spaces - 1));
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);
    }

    // 39. create and display a unique three-digit number using 1, 2, 3, 4.
    // Also count how many three-digit numbers are there.
    public static void threeDigitNumberVariations() {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        count++;

                        System.out.println(count + "\n" + i + "" + j + "" + k);
                    }
                }
            }
        }
    }

    // 42. input and display your password.
    public static void password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your new password: ");
        String password = sc.next();
        sc.close();
        System.out.println();
        System.out.println("Your password: " + password);
    }

    // 43. print the following string in a specific format (see output).
    public static void printPatternTwo() {
        System.out.println("Twinkle, twinkle, little star,\n" +
                "\tHow I wonder what you are! \n" +
                "\t\tUp above the world so high,   \t\t\n" +
                "\t\tLike a diamond in the sky. \n" +
                "Twinkle, twinkle, little star, \n" +
                "\tHow I wonder what you are");
    }

    // 44. accepts an integer (n) and computes the value of n+nn+nnn.
    public static void exoticIntegerAddition(int value) {
        String two = value + "" + value;
        String three = value + "" + value + "" + value;
        int intTwo = Integer.parseInt(two);
        int intThree = Integer.parseInt(three);
        int added = value + intTwo + intThree;
        System.out.println(value + " + " + intTwo + " + " + intThree + " = " + added);
    }

    // 46. display system time.
    public static void currentTime() {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }

    // 47. display the current date and time in a specific format.
    public static void currentTimeFormatted() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        String currentDateTime = dateFormat.format(currentDate);
        System.out.println(currentDateTime);
    }

    // 48. print odd numbers from 1 to 99. Prints one number per line.
    public static void oddNumbersTo100() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 49. accept a number and check whether the number is even or not.
    // Prints 1 if the number is even or 0 if odd.
    public static int checkNumberOddness() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        sc.close();
        if (number % 2 == 0) {
            System.out.println("1");
            return 1;
        } else {
            System.out.println("0");
            return 0;
        }
    }

    // 50. print numbers between 1 and 100 divisible by 3, 5 and both.
    public static void divisibleNumbers() {
        StringBuilder divisible3 = new StringBuilder();
        StringBuilder divisible5 = new StringBuilder();
        StringBuilder divisibleboth = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                divisibleboth.append(i + " ");
            } else if (i % 5 != 0 && i % 3 == 0) {
                divisible3.append(i + " ");
            } else if (i % 5 == 0) {
                divisible5.append(i + " ");
            }
        }
        System.out.println("Divisible by 3: " + divisible3);
        System.out.println("Divisible by 5: " + divisible5);
        System.out.println("Divisible by both: " + divisibleboth);
    }

    // 51. convert a string to an integer.
    public static void stringToInteger(String string) {
        int integer = Integer.parseInt(string);
        System.out.println("String: " + string + "\nInteger: " + integer);
    }

    // 52. calculate the sum of two integers and return true if the sum is equal to a third integer.
    public static boolean firstPlusSecondEqualsThird(int first, int second, int equalToThird) {
        int oneAndTwo = first + second;
        if (oneAndTwo == equalToThird) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    // 53. accepts three integers from the user. It returns true if the second number
    // is higher than the first number and the third number is larger than the second number.
    public static boolean numbersIncreasingInOrder(int first, int second, int third) {
        return first < second && second < third;
    }

    // 55. convert seconds to hours, minutes and seconds.
    public static void secondsToActualTime(int seconds) {
        int mins = 0;
        int hours = 0;
        int secs;
        for (secs = seconds; secs > 60; ) {
            mins += 1;
            secs -= 60;
            if (mins == 60) {
                hours += 1;
                mins = 0;
            }
        }
        System.out.println(hours + ":" + mins + ":" + secs);
    }

    // 56. find the number of values in a given range divisible by a given value.
    // For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p
    public static void numberOfRangedValuesDivisibleByUserValue(int rangeBegin, int rangeEnd, int division) {
        StringBuilder divisibles = new StringBuilder();
        int amount = 0;
        for (int i = rangeBegin; i < rangeEnd; i++) {
            if (i % division == 0) {
                divisibles.append(i).append("; ");
                amount++;
            }
        }
        System.out.println("There are " + amount + " numbers divisible by " + division + "\nThey are: " + divisibles);
    }

    // 57. accept an integer and count the factors of the number.
    public static void numbersFactors(int number) {
        StringBuilder divisibles = new StringBuilder();
        int amount = 0;
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                divisibles.append(i).append("; ");
                amount++;
            }
        }
        System.out.println("The number " + number + " has " + amount + "factors.\nThe number's factors are: " + divisibles);
    }

    // 58. capitalize the first letter of each word in a sentence.
    public static void firstCharsToUppercase(String sentence) {
        int trueFalse = 0;
        char[] sentenceChar = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            sentenceChar[i] = sentence.charAt(i);
        }
        for (int b = 0; b < sentence.length() - 1; b++) {
            if (b == 0) {
                sentenceChar[b] = Character.toUpperCase(sentenceChar[b]);
            }
            char current = sentenceChar[b];
            int next = b + 1;
            char nextCurrent = sentenceChar[next];
            if (trueFalse == 1) {
                sentenceChar[b] = Character.toUpperCase(current);
                trueFalse = 0;
            }
            if (current == ' ' && nextCurrent != ' ') {
                trueFalse = 1;
            }
        }
        StringBuilder print = new StringBuilder();
        for (char c : sentenceChar) {
            print.append(c);
        }
        System.out.println(print);
    }

    // 60. find the penultimate (next to the last) word in a sentence.
    public static void penultimateFinder(String oldInput) {
        String penultimate = "";
        oldInput.trim();
        String[] input = oldInput.split(" ");
        for (int i = 0; i < input.length; i++) {
            int preLast = input.length - 2;
            penultimate = input[preLast];
        }
        System.out.println(penultimate);
    }

    // 61. reverse a word.
    public static void reverseWord(String input) {
        StringBuilder result = new StringBuilder();
        char[] array = input.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        System.out.println(result);
    }

    // 63. accepts two integer values from the user and returns the largest value.
    // However, if the two values are the same, return 0.
    // Find the smallest value if the two values have the same remainder when divided by 6.
    public static int twoIntegerStuff(int first, int second) {
        int firstRemainder = first % 6;
        int secondRemainder = second % 6;
        if (first == second) {
            return 0;
        }
        if (firstRemainder == secondRemainder) {
            if (first > second) {
                return second;
            }
            return first;
        }
        if (first > second) {
            return first;
        }
        return second;
    }

    // 64. accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
    public static boolean integersBetween25And75() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number between 25 and 75: ");
        int firstNumber = scanner.nextInt();
        if (firstNumber > 75 || firstNumber < 25) {
            System.out.println("Re-enter the first number BETWEEN 25 AND 75: ");
            int actualFirstNumber = scanner.nextInt();
            if ((actualFirstNumber > 75 || actualFirstNumber < 25)) {
                return false;
            }
            firstNumber = actualFirstNumber;
        }
        System.out.println("Enter the second number between 25 and 75: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber > 75 || secondNumber < 25) {
            System.out.println("Re-enter the second number BETWEEN 25 AND 75: ");
            int actualSecondNumber = scanner.nextInt();
            if ((actualSecondNumber > 75 || actualSecondNumber < 25)) {
                return false;
            }
            secondNumber = actualSecondNumber;
        }
        scanner.close();

        int lastDigit1 = firstNumber % 10;
        int lastDigit2 = secondNumber % 10;
        firstNumber /= 10;
        secondNumber /= 10;
        return (firstNumber == secondNumber || firstNumber == lastDigit2 || lastDigit1 == secondNumber || lastDigit1 == lastDigit2);
    }

    // 67. insert a word in the middle of another string.
    public static StringBuilder wordBetweenString(String string, String word) {
        string.split(" ");
        StringBuilder result = new StringBuilder();
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]).append(" ");
            if (i == (array.length / 2) - 1) {
                result.append(word).append(" ");
            }
        }
        System.out.println(result);
        return result;
    }

    // 68. create another string of 4 copies of the last 3 characters of the original string.
    // The original string length must be 3 and above.
    public static void fourCopiesOfLastThreeChars(String string) {
        StringBuilder copy = new StringBuilder();
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }

        for (int i = string.length() - 3; i < string.length(); i++) {
            copy.append(array[i]);
        }
        System.out.println(copy + "" + copy + "" + copy + "" + copy);
    }

    // 69. extract the first half of a even string.
    public static StringBuilder firstStringsHalf(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < (string.length() / 2); i++) {
            result.append(string.charAt(i));
        }
        System.out.println(result);
        return result;
    }

    // 70. create a string in the form of short_string + long_string + short_string from two strings.
    // The strings must not have the same length.
    public static StringBuilder createCustomString(String first, String second) {
        StringBuilder result = new StringBuilder();
        if (first.length() == second.length()) {
            return null;
        } else if (first.length() > second.length()) {
            result.append(second).append(first).append(second);
        } else {
            result.append(first).append(second).append(first);
        }
        System.out.println(result);
        return result;
    }

    // 71. create the concatenation of the two strings except removing the first character of each string.
    // The length of the strings must be 1 and above.
    public static StringBuilder twoStringsNoFirstChar(String first, String second) {
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        for (int i = 1; i < first.length(); i++) {
            firstHalf.append(first.charAt(i));
        }
        for (int i = 1; i < second.length(); i++) {
            secondHalf.append(second.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        result.append(firstHalf).append(secondHalf);
        System.out.println(result);
        return result;
    }

    // 72. create a string taking the first three characters from a given string.
    // If the string length is less than 3 use "#" as substitute characters.
    public static StringBuilder firstThreeChars(String string) {
        StringBuilder result = new StringBuilder();
        System.out.println("\"#\" = nothing");
        for (int i = 0; i < 3; i++) {
            if (string.length() >= 3) {
                result.append(string.charAt(i));
            } else {
                if (string.length() == 2) {
                    for (int b = 0; b < 2; b++) {
                        result.append(string.charAt(b));
                    }
                    result.append("#");
                    System.out.println(result);
                    return result;
                }
                if (string.length() == 1) {
                    for (int b = 0; b < 1; b++) {
                        result.append(string.charAt(b));
                    }
                    result.append("##");
                    System.out.println(result);
                    return result;
                }
                result.append("###");
                System.out.println(result);
                return result;
            }
        }
        System.out.println(result);
        return result;
    }

    // 73. sort a given array of distinct integers
    public static StringBuilder sortIntArray(int[] intArray) {
        Arrays.sort(intArray);
        StringBuilder a = new StringBuilder();
        for (int i : intArray) {
            a.append(i).append(" ");
        }
        System.out.println(a);
        return a;
    }

    public static int largestGap(int[] intArray) {
        int biggestGap = 0;
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            for (int b = intArray.length - 1; b > i + 1; b--) {
                if (intArray[b] - intArray[i] > biggestGap) {
                    biggestGap = intArray[b] - intArray[i];
                }
            }
        }
        System.out.println(biggestGap);
        return biggestGap;
    }

    // 155. Write a Java program to print an array after changing the rows and columns of a two-dimensional array.
    public static int[][] convertArray(int[][] input) {
        System.out.println("Input array:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("row " + row + " col " + col + " value " + input[row][col]);
            }
        }

        int[][] result = new int[3][2];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                result[row][col] = input[col][row];
            }
        }

        return result;
    }

    // 158. Write a Java program to create a two-dimensional array (m x m) A[][] such
    // that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.
    public static void createTwoDimensionalArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int rows = scanner.nextInt();
        System.out.println("Second number: ");
        int columns = scanner.nextInt();

        String[][] array = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = "false";

                if (i <= 1) {
                    array[i][j] = "true";
                }
                for (int bbb = 2; bbb <= i / 2; bbb++) {
                    if ((i % bbb) == 0)
                        array[i][j] = "true";
                }

                if (j <= 1) {
                    array[i][j] = "true";
                }
                for (int bbb = 2; bbb <= j / 2; bbb++) {
                    if ((j % bbb) == 0)
                        array[i][j] = "true";
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("i=" + i + " j=" + j + " " + array[i][j]);
            }
        }
    }

    // 159. Write a Java program to find the k largest elements in a given array.
    // Elements in the array can be in any order.
    public static void findThreeLargest(int[] array) {
        int biggest = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element > biggest) {
                biggest = element;
            }
        }
        int firstBiggest = biggest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == biggest) {
                array[i] = 0;
            }
        }
        biggest = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element > biggest) {
                biggest = element;
            }
        }
        int secondBiggest = biggest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == biggest) {
                array[i] = 0;
            }
        }
        biggest = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element > biggest) {
                biggest = element;
            }
        }
        int thirdBiggest = biggest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == biggest) {
                array[i] = 0;
            }
        }
        System.out.println(firstBiggest + "; " + secondBiggest + "; " + thirdBiggest);
    }

    // 160. Write a Java program to find the k smallest elements in a given array.
    // Elements in the array can be in any order.
    public static void findThreeSmallest(int[] array) {
        int smallest = 999999;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element < smallest) {
                smallest = element;
            }
        }
        int firstSmallest = smallest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == smallest) {
                array[i] = 111111;
            }
        }
        smallest = 999999;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element < smallest) {
                smallest = element;
            }
        }
        int secondSmallest = smallest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == smallest) {
                array[i] = 1111111;
            }
        }
        smallest = 999999;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element < smallest) {
                smallest = element;
            }
        }
        int thirdSmallest = smallest;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == smallest) {
                array[i] = 111111111;
            }
        }
        System.out.println(firstSmallest + "; " + secondSmallest + "; " + thirdSmallest);
    }

    // 161. Write a Java program to find the kth smallest and largest element in a given array.
    // Elements in the array can be in any order.
    public static void arraySmallestAndBiggest(int[] array) {
        int smallest = 999999;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element < smallest) {
                smallest = element;
            }
        }
        int biggest = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element > biggest) {
                biggest = element;
            }
        }
        System.out.println(smallest + " " + biggest);
    }

    // 162. Write a Java program that finds numbers greater than the average of an array.
    public static void biggerThanAverage(int[] array) {
        int summary = 0;
        int division = array.length;

        for (int i : array) {
            summary += i;
        }
        int average = summary / division;
        StringBuilder overAvg = new StringBuilder();
        for (int i : array) {
            if (i > average) {
                overAvg.append(i).append("; ");
            }
        }
        System.out.println("the average is " + average);
        System.out.println(overAvg);
    }

    // 165. Write a Java program to move every positive number to the right
    // and every negative number to the left of a given array of integers.
    public static void moveNegativesLeftPositivesRight(int[] array) {
        Arrays.sort(array);
        StringBuilder a = new StringBuilder();
        for (int i : array) {
            a.append(i).append("; ");
        }
        System.out.println(a);
    }

    // 166. Write a Java program to transform a given integer into String format.
    public static void intToString(int number) {
        String str = String.valueOf(number);
        System.out.println(str);
    }

    // 168. Write a Java program to multiply two given integers without using the multiply operator (*).
    public static int manualMultiplication(int number, int times) {
        if (times == 0 || number == 0) {
            System.out.println(0);
            return 0;
        }
        int newNum = number;
        if ((times > 0 && number > 0) || ((times < 0 && number < 0))) { // if both are negative OR both are positive
            if ((times < 0 && number < 0)) { // if both negative
                for (int i = -1; i > times; i--) {
                    newNum += number;
                }
                System.out.println(-newNum);
                return -newNum;
            }
            if ((times > 0 && number > 0)) { // if both positive
                for (int i = 1; i < times; i++) {
                    newNum += number;
                }
                System.out.println(newNum);
                return newNum;
            }
        } else { // if one of them is negative // if ((times < 0 && number > 0) || (times > 0 && number < 0))
            if (times < 0) {
                for (int i = -1; i > times; i--) {
                    newNum += number;
                }
                System.out.println(-newNum);
                return -newNum;
            }
            for (int i = 1; i < times; i++) {
                newNum += number;
            }
            System.out.println(newNum);
            return newNum;
        }
        return newNum;
    }

    // 169. Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.
    public static void reverseSentence(String string) {
        String[] words = string.split("\\s");
        StringBuilder reverseWord = new StringBuilder();
        for (String reversed : words) {
            StringBuilder input = new StringBuilder(reversed);
            input.reverse();
            reverseWord.append(input);
            reverseWord.append(" ");
        }
        System.out.println(reverseWord);
    }

    // 170. Write a Java program to find the length of the longest consecutive sequence in a given array of integers.
    public static void longestConsecutiveSequence(int[] array) {
        int longestSequence = 0;
        int currentSequence = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int next = i + 1;
            if (array[i] == array[next] || array[i] == (array[next] - 1)) {
                currentSequence++;
                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                }
            } else {
                currentSequence = 0;
            }
        }
        System.out.println("The longest consecutive sequence is: " + (longestSequence + 1));
    }

    // 176. Write a Java program that partitions an array of integers into even and odd numbers.
    public static void partitionArrayEvenOdd(int[] array) {
//        StringBuilder printBefore = new StringBuilder();
//        for (int i : array) {
//            printBefore.append(i).append(" ");
//        }
//        System.out.println("Before: " + printBefore);
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            // 4, 49, 21, 22, 85, 77, -24, -25, 1, 3, 80
            if ((current % 2) == 0) {
                evens.add(current);
            } else {
                odds.add(current);
            }
        }
        System.out.println(odds + "\n" + evens + "\n");

        for (int i = 0; i < odds.size(); i++) {
            array[i] = odds.get(i);
        }

        for (int arr = odds.size(), evn = 0; (arr < array.length) & (evn < evens.size()); arr++, evn++) {
            array[arr] = evens.get(evn);
        }

        StringBuilder print = new StringBuilder();
        for (int qqq : array) {
            print.append(qqq).append(" ");
        }
        System.out.println("After: " + print);
    }


    // 179. Write a Java program to add one to a positive number represented as an array of digits.
    public static void addOneToDigitArray(int[] array) {
        StringBuilder b = new StringBuilder();
        for (int i : array) {
            b.append(i);
        }
        String temp = b.toString();
        int oldNumber = Integer.parseInt(temp);
        int newNumber = oldNumber + 1;

        int i = 0;
        int len = Integer.toString(newNumber).length();
        int[] newArray = new int[len];
        while (newNumber != 0) {
            newArray[len - i - 1] = newNumber % 10;
            newNumber = newNumber / 10;
            i++;
        }

        StringBuilder result = new StringBuilder();
        for (int i1 : newArray) {
            result.append(i1);
        }
        StringBuilder preResult = new StringBuilder();
        for (int i1 : array) {
            preResult.append(i1);
        }
        System.out.println("Before adding: " + preResult);
        System.out.println("After adding: " + result);
    }

    // 181. Write a Java program to find the length of the last word in a given string.
    // The string contains upper/lower-case alphabets and empty space characters like ' '.
    public static void findLastWordLength(String string) {
        String[] array;
        array = string.split("\\s");
        String word = array[array.length - 1];

        System.out.println(word.length());
    }

    // 183. Write a Java program to accept a positive number
    // and repeatedly add all its digits until the result has only one digit.
    public static void addAllDigits(int number) {
        while (number > 9) {
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        System.out.println(number);
    }


    // 187. Write a Java program to find the index of the first non-repeating character in a given string.
    public static char findFirstUniqueCharacter(String text) {
        String input = text;
        char[] array = input.toCharArray();
        for (int charBasis = 0; charBasis < array.length; charBasis++) {
            char firstChar = array[charBasis];
            for (int charSeeker = charBasis + 1; charSeeker < array.length; charSeeker++) {
                char secondChar = array[charSeeker];
                if (firstChar == secondChar) {
                    input = input.replace(firstChar, ' ');
                    input = input.replace(secondChar, ' ');
                }
            }
        }

        input = input.trim();
        char firstOriginalChar = input.charAt(0);
        System.out.println(firstOriginalChar);
        return firstOriginalChar;
    }

    // 190. Write a Java program to find the missing string from two given strings.
    public static String findMissingString(String string, String string2) {
        String[] array;
        array = string.split(" ");
        String[] array2;
        array2 = string2.split(" ");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (!array[i].equalsIgnoreCase(array2[j])) {
                    count++;
                }
            }
            if (count == array2.length) {
                System.out.println(array[i]);
                return array[i];
            } else {
                count = 0;
            }
        }
        System.out.println("No word is missing");
        return "No word is missing";
    }

    // 191. Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.
    public static boolean checkTwoIntegersToPositiveNumber(int num) {
        for (int i = 1; i < num; i++) {
            int first = i ^ 2;
            for (int j = 1; j < num; j++) {
                int second = j ^ 2;
                System.out.println("Comparing: " + first + " " + second);
                if (first + second == num) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }

    // 199. Write a Java program to check if a string follows a given pattern.
    public static boolean checkWhetherStringFollowsPattern(String string) {
        String[] array;
        array = string.split(" ");
        if (array.length != 4) {
            System.out.println("false");
            return false;
        } else if (array[0].equalsIgnoreCase(array[3]) && array[1].equalsIgnoreCase(array[2])) {
            System.out.println("true");
            return true;
        } else if (array[0].equalsIgnoreCase(array[1]) && array[1].equalsIgnoreCase(array[2]) && array[2].equalsIgnoreCase(array[3])) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    // 200. Write a Java program to remove duplicate letters and arrange them in lexicographical order from a given string containing only lowercase letters.
    public static void removeDupesAndArrangeLexicographically(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = ' ';
                }
            }
        }
        Arrays.sort(array);

        StringBuilder a = new StringBuilder();
        for (char c : array) {
            if (c != ' ') {
                a.append(c);
            }
        }

        System.out.println(a);
    }

    // 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
    public static void convertFahrenheitToCelsius(int f) {
        double celsius = ((5 * (f - 32.0)) / 9.0);
        System.out.println(celsius);
    }

    // 2. Write a Java program that reads a number in inches and converts it to meters.
    public static void convertInchesToMeters(int inches) {
        // 39.3700787
        double meters = inches / 39.37;
        System.out.println(meters);
    }

    // 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    public static void addNumbersDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        number = sum;
        System.out.println(number);
    }

    // 4. Write a Java program to convert minutes into years and days.
    public static void convertMinutesToYearsDays(int mins) {
        // minute -> hours -> days -> years
        int hours = 0;
        int days = 0;
        int years = 0;
        int printMins = mins;
        while (mins >= 59) {
            if (mins >= 60) {
                mins -= 60;
                hours += 1;
            }
            if (hours >= 24) {
                hours -= 24;
                days += 1;
            }
            if (days >= 365) {
                days -= 365;
                years += 1;
            }
        }
        System.out.println(printMins + " minutes is approximately " + years + " years and " + days + " days");
//        System.out.println(hours);
    }

    // 5. Write a Java program that prints the current time in GMT.
    public static void timeRightNow() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String currentDateTime = dateFormat.format(currentDate);
        System.out.println(currentDateTime);
    }

    // 6. Write a Java program to compute the body mass index (BMI).
    public static void calculateBMI(int weight, double height) {
        double BMI = weight / (height * height);
        System.out.println("The BMI: " + BMI);
    }


    // 7. Write a Java program to take the user for a distance (in meters) and
    // the time taken (as three numbers: hours, minutes, seconds), and display the speed,
    // in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
    public static void distanceAndTimeIntoKphMphMps(double secs, double meters, double hours) {
        double kilometers = meters / 1000;
        double mps = meters / secs;
        double kph = kilometers / hours;
        double miles = kilometers / 1.609;
        double mph = miles / hours;

        System.out.println("METERS/SECOND: " + mps);
        System.out.println("KILOMETERS/HOUR: " + kph);
        System.out.println("MILES/HOUR: " + mph);
    }

    // 8. Write a Java program that reads a number and displays the square, cube, and fourth power.
    public static void displaySquareCubeFourthPower(int number) {
        int square = number ^ 2;
        int cube = number ^ 3;
        int fourthPower = number ^ 4;
        System.out.println(square + "\n" + cube + "\n" + fourthPower);
    }

    // 9. Write a Java program that accepts two integers from the user and prints the sum, the difference,
    // the product, the average, the distance (the difference between the integers),
    // the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
    public static void twoIntegersOperations(int first, int second) {
        int sum = first + second;
        int difference;
        int biggest;
        int smallest;
        if (first > second) {
            difference = first - second;
            biggest = first;
            smallest = second;
        } else if (first < second) {
            difference = second - first;
            biggest = second;
            smallest = first;
        } else {
            difference = 0;
            biggest = first;
            smallest = first;
        }
        int product = first * second;
        int average = (first + second) / 2;

        int distance = first - second;
        if (distance < 0) {
            distance = -distance;
        }
        System.out.println("Summary: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);
    }

    // 10. Write a Java program to break an integer into a sequence of digits.
    public static void integerIntoSequence(int number) {
        String string = String.valueOf(number);
        char[] array = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : array) {
            result.append(c).append(" ");
        }
        string = result.toString();
        string.trim();
        System.out.println(string);

    }

    // 11. Write a Java program to test whether a given double/float value is a finite floating-point value or not.
    public static boolean finiteFloatingPointTest(double number) {
        return number < Double.POSITIVE_INFINITY && Double.NEGATIVE_INFINITY < number;
    }

    // 12. Write a Java program to compare two signed and unsigned numbers.
    public static void compareSignedAndUnsigned() {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        int signedCompared = Integer.compare(first, second);
        System.out.println("Signed numbers: " + signedCompared);
        int unsignedCompared = Integer.compareUnsigned(first, second);
        System.out.println("Unsigned numbers: " + unsignedCompared);
    }


    // 14. Write a Java program to extract the primitive type value from a given BigInteger value.
    // A primitive type is predefined by the language and is named by a reserved keyword. Primitive values do not share state with other primitive values.
    // The eight primitive data types supported by the Java programming language are byte, short, int, long, float, double, Boolean and char.
    //BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger.
    // The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive.
    // The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element.
    // A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1.
    public static void BigIntegerConversions() {
        BigInteger value = new BigInteger(String.valueOf(Long.MAX_VALUE));
        long longg = value.longValue();
        int intt = value.intValue();
        short shortt = value.shortValue();
        byte bytee = value.byteValue();
        long exactLongg = value.longValueExact();
        System.out.println(longg);
        System.out.println(intt);
        System.out.println(shortt);
        System.out.println(bytee);
        System.out.println(exactLongg);
    }

    // 1. Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void checkNumberSign(int num) {
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    // 3. Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void greatestOfThree(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first + " is the greatest number");
        }
        if (second > first && second > third) {
            System.out.println(second + " is the greatest number");
        }
        if (third > first && third > second) {
            System.out.println(third + " is the greatest number");
        }
    }

    // 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
    public static void nameLater(float num) {
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            if (num < 1) {
                System.out.println("positive small");
            } else if (num > 1000000) {
                System.out.println("positive large");
            } else {
                System.out.println("positive");
            }
        } else if (num < 0) {
            if ((-num) < 1) {
                System.out.println("negative small");
            } else if ((-num) > 1000000) {
                System.out.println("negative large");
            } else {
                System.out.println("negative");
            }
        } else {
            System.out.println("???");
        }
    }

    // 5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
    public static void numberToWeekday(int num) {
        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("???");
        }
    }

    // 6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
    public static boolean smartName(float first, float second) {
        String strFirst = String.valueOf(first);
        String strSecond = String.valueOf(second);

        int one = Math.round(first);
        int two = Math.round(second);
        String lenFirst = String.valueOf(one);
        String lenSecond = String.valueOf(two);

        strFirst = strFirst.substring(0, (lenFirst.length() + 3));
        strSecond = strSecond.substring(0, (lenSecond.length() + 3));

        if (strFirst.equalsIgnoreCase(strSecond)) {
            System.out.println("They are identical");
            return true;
        } else {
            System.out.println("They are different");
            return false;
        }
    }

    // 7. Write a Java program to find the number of days in a month.
    public static void numberOfMonthDays(int month, int year) {
        if (month < 1 || month > 7) {
            System.out.println("???");
        }
        if (month == 2) {
            if (year % 4 == 0) {
                System.out.println("February " + year + " has 29 days");
            } else {
                System.out.println("February " + year + " has 28 days");
            }
        } else if (month == 1) {
            System.out.println("January " + year + " has 31 days");
        } else if (month == 3) {
            System.out.println("March " + year + " has 31 days");
        } else if (month == 4) {
            System.out.println("April " + year + " has 30 days");
        } else if (month == 5) {
            System.out.println("May " + year + " has 31 days");
        } else if (month == 6) {
            System.out.println("June " + year + " has 30 days");
        } else if (month == 7) {
            System.out.println("July " + year + " has 31 days");
        } else if (month == 8) {
            System.out.println("August " + year + " has 31 days");
        } else if (month == 9) {
            System.out.println("September " + year + " has 30 days");
        } else if (month == 10) {
            System.out.println("October " + year + " has 31 days");
        } else if (month == 11) {
            System.out.println("November " + year + " has 30 days");
        } else if (month == 12) {
            System.out.println("December " + year + " has 31 days");
        }
    }

    // 8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input.
    // If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
    public static String checkVowelOrConsonant(char letter) {
        if (!Character.isLetter(letter)) {
            System.out.println("ERROR");
            return "ERROR";
        }
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Vowel");
            return "Vowel";
        } else {
            System.out.println("Consonant");
            return "Vowel";
        }
    }

    // 9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0)) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    // 10. Write a Java program to display the first 10 natural numbers.
    public static void printFirstTenNaturals() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
    public static void fiveNumsAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int current = in.nextInt();

            sum += current;
        }
        System.out.println(sum + "\n" + sum / 5);
    }

    // 13. Write a Java program to display the cube of the given number up to an integer.
    public static void cubeUpToGivenInt(int num) {
        for (int b = 1; b < num + 1; b++) {
            int result = b * b;
            System.out.println(b + " x " + b + " = " + result);
        }
    }

    // 14. Write a Java program to display the multiplication table of a given integer.
    public static void integersMultiplicationTable(int num) {
        for (int b = 1; b < num + 1; b++) {
            int result = num * b;
            System.out.println(num + " x " + b + " = " + result);
        }
    }

    // 15. Write a Java program that displays the sum of n odd natural numbers.
    public static void countSummary(int num) {
        int summary = 0;
        for (int i = 1, count = 0; count < num; i++) {
            if (i % 2 != 0) {
                summary += i;
                count++;
            }
        }
        System.out.println(summary);
    }

    // 16. Write a Java program to display the pattern like a right angle triangle with a number.
    public static void displayStaircasePattern(int num) {
        String print = "";
        for (int j = 1; j < num + 2; j++) {
            System.out.println(print);
            print = print + j;
        }
    }

    // 17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
    public static void displayStaircasePattern2(int num) {
        StringBuilder print = new StringBuilder();
        for (int j = 1; j < num + 2; j++) {
            for (int count = 0; count < j; count++) {
                print.append(j);
            }
            System.out.println(print);
            print.setLength(0);
        }
    }

    // 18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
    public static void displayStaircasePattern3(int num) {
        StringBuilder print = new StringBuilder();
        for (int j = 1, b = 1; j < num + 4; b++) {
            for (int count = 0; count < b; count++) {
                print.append(j).append(" ");
                j++;
            }
            System.out.println(print);
            print.setLength(0);
        }
    }

    // 19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
    public static void displayPyramidPattern(int num) {
        int space = 7;
        StringBuilder print = new StringBuilder();
        for (int j = 1; j < num + 2; j++) {
            for (int spacePrint = 0; spacePrint < space; spacePrint++) {
                print.append(" ");
            }
            space--;
            for (int count = 0; count < j; count++) {
                print.append(j + " ");
            }
            System.out.println(print);
            print.setLength(0);
        }
    }

    // 21. Write a Java program to display the pattern like a diamond.
    public static void displayDiamondPattern(int num) {
        int space = num;
        int count = 1;
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < num; i++) {
            for (int spacePrint = 0; spacePrint < space; spacePrint++) {
                print.append(" ");
            }
            space--;
            for (int j = 0; j < count; j++) {
                print.append("*");
            }
            count += 2;
            System.out.println(print);
            print.setLength(0);
        }
        int secondCount = count - 4;
        int secondSpace = 2;
        for (int i = num; i > 0; i--) {
            for (int spacePrint = 0; spacePrint < secondSpace; spacePrint++) {
                print.append(" ");
            }
            secondSpace++;
            for (int j = 0; j < secondCount; j++) {
                print.append("*");
            }
            secondCount -= 2;

            System.out.println(print);
            print.setLength(0);
        }
    }

    // 23. Write a Java program to generate the following * triangles.
    public static void displayStaircasePattern4(int num) {
        int space = 1;
        int reps = num;
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < num + 1; i++) {
            for (int spacePrint = 0; spacePrint < space; spacePrint++) {
                print.append(" ");
            }
            space += 1;
            for (int j = 0; j < reps; j++) {
                print.append("*");
            }
            reps -= 1;
            System.out.println(print);
            print.setLength(0);
        }
    }

    // 24. Write a Java program to generate the following @'s triangle.
    public static void displayStaircasePattern5(int num) {
        int space = num;
        int inc = 1;
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < space; j++) {
                print.append(" ");
            }
            space -= 1;
            for (int j = 0; j < inc; j++) {
                print.append("@");
            }
            inc += 1;
            System.out.println(print);
            print.setLength(0);
        }
    }

    public static void displayRhombus(int num) {
        int count = 1;
        int blank = 1;
        int start = 0;

        for (int i = 1; i < (num * 2); i++) {

            for (int space = num - blank; space > 0; space--) {
                System.out.print(" ");
            }
            if (i < num) {
                start = i;
                blank++;
            } else {
                start = num * 2 - i;
                blank--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < num) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }

    public static void displayRhombus2(int num) {
        int count = 1;
        int secondCount = 1;
        char character = 'A';

        for (int i = 1; i < (num * 2); i++) {
            for (int space = num - secondCount; space > 0; space--) {
                System.out.print(" ");
            }
            if (i < num) {
                secondCount++;
            } else {
                secondCount--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(character);
                if (j < count / 2) {
                    character++;
                } else {
                    character--;
                }
            }
            if (i < num) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            character = 'A';

            System.out.println();
        }
    }

    // 27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
    public static void checkIntSign(int a) {
        checkNumberSign(a);
    }

    // 28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise,
    // print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it
    // exceeds 1,000,000.
    public static void insane(float num) {
        nameLater(num);
    }

    // 29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void digitsAmount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count += 1;
        }
        System.out.println("Number of digits in the number: " + count);
    }

    // 30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
    // "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
    public static void threeNumbersEquality(int first, int second, int third) {
        if(first == second && second == third){
            System.out.println("All numbers are equal");
        }
        else if(first != second && second != third && first != third){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }

    // 31
    // three numbers from the user and, print "increasing" if the numbers are in increasing order,
    // "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
    public static void threeNumbersOrder(int first, int second, int third) {
        if(first > second && second > third){
            System.out.println("Increasing order");
        }
        else if(first < second && second < third){
            System.out.println("Decreasing order");
        }
        else {
            System.out.println("Neither increasing nor decreasing");
        }
    }

    // 32. Write a Java program that accepts two floating point numbers and checks
    // whether they are the same up to two decimal places.
    public static boolean weirdName(float first, float second) {
        String strFirst = String.valueOf(first);
        String strSecond = String.valueOf(second);

        int one = Math.round(first);
        int two = Math.round(second);
        String lenFirst = String.valueOf(one);
        String lenSecond = String.valueOf(two);

        strFirst = strFirst.substring(0, (lenFirst.length() + 2));
        strSecond = strSecond.substring(0, (lenSecond.length() + 2));

        if (strFirst.equalsIgnoreCase(strSecond)) {
            System.out.println("They are identical");
            return true;
        } else {
            System.out.println("They are different");
            return false;
        }
    }
}

