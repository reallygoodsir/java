package third;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
                divisible3.append(i);
            } else if (i % 5 == 0) {
                divisible5.append(i);
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
}

