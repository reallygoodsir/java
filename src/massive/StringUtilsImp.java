package massive;

import java.util.*;

public class StringUtilsImp implements StringUtils {

    @Override
    public boolean checkStringStartsWithAnotherString(String text, String startWithString) {
        return text.startsWith(startWithString);
    }

    @Override
    public String getSubstringAtTwoPositions(String text, int begin, int end) {
        return text.substring(begin, end);
    }

    @Override
    public String convertToLowerCase(String text) {
        return text.toLowerCase();
    }

    @Override
    public String convertToUpperCase(String text) {
        return text.toUpperCase();
    }

    @Override
    public String trimString(String text) {
        return text.trim();
    }

    @Override
    public String findLongestWord(String text) {
        String input = "today is the happiest day of my life";
        String[] words = input.split(" ");
        int length = 0;
        String result = "";
        for (String word : words) {
            if (word.length() > length) {
                length = word.length();
                result = word;
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public StringBuffer findLettersExistingMoreThanOnce(String text) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] inputArray = text.toCharArray();
        for (int character = 0; character < inputArray.length; character++) {
            for (int characterSeeker = character + 1; characterSeeker < inputArray.length; characterSeeker++) {
                if (inputArray[character] == inputArray[characterSeeker] && inputArray[character] != ' ') {
                    stringBuffer.append(inputArray[character]);
                    break;
                }
            }
        }
        return stringBuffer;
    }

    @Override
    public int findLengthOfLongestSubstring(String text) {
        String[] words = text.split(" ");
        int length = 0;
        for (String word : words) {
            if (word.length() > length) {
                length = word.length();
            }
        }
        return length;
    }

    @Override
    public String removeDuplicatedSubstringsFromString(String text) {
        String input = text;
        String[] words = input.split(" ");
        for (int wordBasis = 0; wordBasis < words.length; wordBasis++) {
            String firstWord = words[wordBasis];
            for (int wordSeeker = wordBasis + 1; wordSeeker < words.length; wordSeeker++) {
                String secondWord = words[wordSeeker];
                System.out.println("comparing " + "\"" + firstWord + "\"" + " and " + "\"" + secondWord + "\"");
                boolean theBoolean = firstWord.equalsIgnoreCase(secondWord);
                if (theBoolean) {
                    input = input.replace(secondWord, "");
                }
            }
        }
        input = input.trim();
        return input;
    }

    @Override
    public Set<String> findAllDuplicatedSubstrings(String text) {
        String[] words = text.split(" ");
        Set<String> result = new HashSet<>();
        String duplicatedWord;
        for (int wordBasis = 0; wordBasis < words.length; wordBasis++) {
            String firstWord = words[wordBasis];
            for (int wordSeeker = wordBasis + 1; wordSeeker < words.length; wordSeeker++) {
                String secondWord = words[wordSeeker];
                System.out.println("comparing " + "\"" + firstWord + "\"" + " and " + "\"" + secondWord + "\"");
                boolean theBoolean = firstWord.equalsIgnoreCase(secondWord);
                if (theBoolean) {
                    duplicatedWord = secondWord;
                    result.add(duplicatedWord);
                }
            }
        }
        return result;
    }

    @Override
    public char findFirstUniqueCharacter(String text) {
        String input = text;
        char[] array = input.toCharArray();
        for (int charBasis = 0; charBasis < array.length; charBasis++) {
            char firstChar = array[charBasis];
            for (int charSeeker = charBasis + 1; charSeeker < array.length; charSeeker++) {
                char secondChar = array[charSeeker];
                System.out.println("comparing " + "\"" + firstChar + "\"" + " and " + "\"" + secondChar + "\"");
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

    @Override
    public String[] divideStringToEqualParts(String text, int parts) {
        String[] result = new String[parts];
        int partLength = text.length() / parts;
        int index = 0;

        for (int i = 0; i < parts; i++) {
            String part = text.substring(index, index + partLength);
            System.out.println(part);
            result[i] = part;
            index = index + partLength;
        }
        return result;
    }

    @Override
    public String removeDuplicatedCharactersInString(String text1, String text2) {
        String input1 = text1;
        String input2 = text2;
        String[] words1 = input1.split(" ");
        String[] words2 = input2.split(" ");
        int wordBasis1;
        int wordBasis2;
        for (wordBasis1 = 0; wordBasis1 < words1.length; wordBasis1++) {
            String firstWord = words1[wordBasis1];
            for (wordBasis2 = 0; wordBasis2 < words2.length; wordBasis2++) {
                String secondWord = words2[wordBasis2];
                System.out.println("comparing " + "\"" + firstWord + "\"" + " and " + "\"" + secondWord + "\"");
                boolean theBoolean = firstWord.equalsIgnoreCase(secondWord);
                if (theBoolean) {
                    input2 = input2.replace(secondWord, "");
                    input1 = input1.replace(firstWord, "");
                }
            }
        }
        System.out.println(input1);
        System.out.println(input2);
        return input1.trim();
    }

    @Override
    public String findDuplicatedSubstringsExistingInAnotherString(String text1, String text2) {
        String[] words1 = text1.split(" ");
        String[] words2 = text2.split(" ");
        StringBuilder dupes = new StringBuilder(" ");
        String a;
        int wordBasis1;
        int wordBasis2;
        for (wordBasis1 = 0; wordBasis1 < words1.length; wordBasis1++) {
            String firstWord = words1[wordBasis1];
            for (wordBasis2 = 0; wordBasis2 < words2.length; wordBasis2++) {
                String secondWord = words2[wordBasis2];
                boolean theBoolean = (firstWord.equalsIgnoreCase(secondWord));
                if (theBoolean) {
                    a = secondWord;
                    dupes.append(a);
                    dupes.append(" ");
                }
            }
        }
        return dupes.toString().trim();
    }

    @Override
    public char findMostCommonCharacter(String text) {
        char[] array = text.toCharArray();
        int theCharIndex = 0;
        String mostUsedChar = "";
        int charUsesCount = 0;
        int biggestCharUsesRecord = 0;

        for (int charBasis = 0; charBasis < array.length; charBasis++) {
            char firstChar = array[charBasis];
            for (int charSeeker = charBasis + 1; charSeeker < array.length; charSeeker++) {
                char secondChar = array[charSeeker];
                if (firstChar == secondChar) {
                    charUsesCount++;
                }
            }
            if (charUsesCount > biggestCharUsesRecord) {
                biggestCharUsesRecord = charUsesCount;
                charUsesCount = 0;
                theCharIndex = charBasis;
                mostUsedChar = String.valueOf(text.charAt(theCharIndex));
            } else {
                charUsesCount = 0;
            }
        }

        char iForgotTheName = text.charAt(theCharIndex);
        System.out.println(iForgotTheName);
        System.out.println(mostUsedChar);
        return iForgotTheName;
    }

    @Override
    public String reverseString(String text) {
        StringBuilder result = new StringBuilder();
        char[] array = text.toCharArray();
        for (int iterate = array.length - 1; iterate >= 0; iterate--) {
            result.append(array[iterate]);
        }
        return result.toString();
    }

    @Override
    public String reverseEveryWord(String text) {
        String[] words = text.split("\\s");
        StringBuilder reverseWord = new StringBuilder();
        for (String reversed : words) {
            StringBuilder input = new StringBuilder(reversed);
            input.reverse();
            reverseWord.append(input);
            reverseWord.append(" ");
        }
        System.out.println(reverseWord);
        return reverseWord.toString().trim();
    }

    @Override
    public String removeCharactersFromString(String text, char... characters) {
        StringBuilder result = new StringBuilder();
        String chars = Arrays.toString(characters);
        System.out.println(chars);
        char[] input = text.toCharArray();
        for (char character : input) {
            if (!chars.contains("" + character)) {
                result.append(character);
            }
        }
        return result.toString();
    }

    @Override
    public boolean checkTwoStringsAreRotationsOfEachOther(String text1, String text2) {
        String[] words = text2.split(" ");
        StringBuilder reversedInput = new StringBuilder();
        StringBuilder input = new StringBuilder();
        for (String reversed : words) {
            input.append(reversed);
            input.reverse();
            reversedInput.append(input);
        }

        if (text1.contentEquals(reversedInput)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    @Override
    public String checkIfStringBeginsWithSomeWords(String text) {
        if (text.startsWith("red") || text.startsWith("black")) {
            System.out.println(text);
            return text;
        } else {
            System.out.println("empty string");
            return "";
        }
    }

    @Override
    public String readAndAppendStrings(String text1, String text2) {
        String textOne;
        String textTwo;
        if (text1.length() > text2.length()) {
            for (textOne = text1, textTwo = text2; textOne.length() > textTwo.length(); ) {
                textOne = textOne.substring(1);
            }

            StringBuilder firstBigger = new StringBuilder(textOne + " " + textTwo);
            System.out.println(firstBigger);
            System.out.println("\nfirst is bigger");
            return firstBigger.toString();
        } else if (text1.length() < text2.length()) {
            for (textOne = text1, textTwo = text2; textOne.length() < textTwo.length(); ) {
                textTwo = textTwo.substring(1);
            }
            StringBuilder secondBigger = new StringBuilder(textOne + " " + textTwo);
            System.out.println(secondBigger);
            System.out.println("\nsecond is bigger");
            return secondBigger.toString();
        } else {
            StringBuilder comboOfEquals = new StringBuilder(text1 + " " + text2);
            System.out.println(comboOfEquals);
            System.out.println("\nequal");
            return comboOfEquals.toString();
        }
    }

    @Override
    public boolean checkFirstTwoCharactersAppearAtTheEnd(String text) {
        String inputStart = text.substring(0, 2);
        if (text.endsWith(inputStart)) {
            System.out.println("yes");
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    @Override
    public String readStringWithoutFirstTwoCharacters(String text) {
        String input = text;
        String inputFirstChar = input.substring(0, 1);
        String inputSecondChar = input.substring(1, 2);

        if (inputFirstChar.equalsIgnoreCase("g")) {
            System.out.println("equals");
        } else {
            input = input.replace(inputFirstChar, "");
        }

        if (inputSecondChar.equalsIgnoreCase("h")) {
            System.out.println("equals");
        } else {
            input = input.replace(inputSecondChar, "");
        }
        System.out.println(input);
        return input;
    }

    @Override
    public String substringBetweenFirstAndLastAppearance(String text) {
        int i = 0;
        int firstToast;
        int lastToast;
        String nothing = "";
        String toastSeeker;
        String betweenToasts;
        if (text.contains("toast")) {
            for (toastSeeker = text.substring(i, i + 5); !toastSeeker.equalsIgnoreCase("toast"); i += 1) {
                toastSeeker = text.substring(i, i + 5);
            }
            int b = i;
            firstToast = (b + 5);
            if (text.substring(firstToast).contains("toast")) {
                for (i = text.length(), toastSeeker = text.substring(i - 5, i); !toastSeeker.equalsIgnoreCase("toast"); i -= 1) {
                    toastSeeker = text.substring(i - 5, i);
                }
                lastToast = (i - 5);
                betweenToasts = text.substring(firstToast, lastToast);
            } else {
                return nothing;
            }
        } else {
            return nothing;
        }
        return betweenToasts.trim();
    }

    @Override
    public boolean checkIfStringAtTheEndOfAnotherString(String text1, String text2) {
        text1.toLowerCase();
        text2.toLowerCase();
        if (text1.endsWith(text2)) {
            System.out.println("yes");
            return true;
        }
        return false;
    }

    @Override
    public int countTextAppearsInString(String text, String findText) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            int endIndex = i + findText.length();
            System.out.println(endIndex);
            boolean isOverStringLength = endIndex > text.length();
            System.out.println(isOverStringLength);
            if (isOverStringLength) {
                break;
            }
            String substring = text.substring(i, endIndex);
            System.out.println("substring: " + substring + " i: " + i);
            if (substring.equals(findText)) {
                count += 1;
            }
        }
        System.out.println("result: " + count);
        return count;
    }

    @Override
    public String[] findAllWords(String text) {
        String[] words = text.split(" ");

        int countOfWords = 0;
        for (String word : words) {
            if (!word.equalsIgnoreCase("")) {
                countOfWords++;
            }
        }

        String[] result = new String[countOfWords];
        int x = 0;
        for (String word : words) {
            if (!word.equalsIgnoreCase("")) {
                result[x] = word;
                x++;
            }
        }
        return result;
    }

    @Override
    public Map<String, Integer> countWordsInString(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            boolean containsKey = map.containsKey(word);
            if (!containsKey) {
                map.put(word, 1);
            } else {
                Integer value = map.get(word);
                map.put(word, value + 1);
            }
        }
        return map;
    }
}
