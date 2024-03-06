package massive;

import java.util.Map;
import java.util.Set;

interface StringUtils {

    // check whether a given string starts with another string
    boolean checkStringStartsWithAnotherString(String text, String startWithString);

    // get a substring of a given string at two specified positions
    String getSubstringAtTwoPositions(String text, int begin, int end);

    // convert all characters in a string to lowercase
    String convertToLowerCase(String text);

    // convert all characters in a string to uppercase
    String convertToUpperCase(String text);

    // trim leading or trailing whitespace from a given string
    String trimString(String text);

    // find the longest word within a string
    String findLongestWord(String text);

    // find letters which exist more than once in string
    StringBuffer findLettersExistingMoreThanOnce(String text);

    // find the length of the longest substring of a given string
    int findLengthOfLongestSubstring(String text);

    // divide a string into equal parts
    String[] divideStringToEqualParts(String text, int parts);

    // check two given strings whether any of them appears at the end of the other string (ignore case sensitivity).
    boolean checkIfStringAtTheEndOfAnotherString(String text1, String text2);

    // remove duplicated substring from a given string
    String removeDuplicatedSubstringsFromString(String text);

    // find and return all duplicated substrings inside a given string
    Set<String> findAllDuplicatedSubstrings(String text);

    // find the first non-repeating character in a string
    char findFirstUniqueCharacter(String text);

    // remove duplicated characters from a given string that appear in another given string
    String removeDuplicatedCharactersInString(String text1, String text2);

    // find and return duplicated strings from a given string that appear in another given string
    String findDuplicatedSubstringsExistingInAnotherString(String text1, String text2);

    // find the character in a string that occurs the most frequently
    char findMostCommonCharacter(String text);

    // reverse a string
    String reverseString(String text); // "abcd ghjk" -> "kjhg dcbd"

    // reverse every word in a string
    String reverseEveryWord(String text); // "abcd ghjk" -> "dcbd kjhg"

    // remove characters from a given string
    String removeCharactersFromString(String text, char... characters);

    // check if two given strings are rotations of each other
    boolean checkTwoStringsAreRotationsOfEachOther(String text1, String text2);

    // check if the string begins with "red" or "black" return that string, otherwise return the empty string
    String checkIfStringBeginsWithSomeWords(String text);

    // read two strings, append them together, and return the result.
    // If the strings are different lengths, remove characters from the beginning
    // of the longer string and make them equal lengths.
    String readAndAppendStrings(String text1, String text2);

    // check whether the first two characters appear at the end of a given string
    boolean checkFirstTwoCharactersAppearAtTheEnd(String text);

    // read a string and return it without the first two characters unless the first character  is 'g' and  the second character if it is 'h'
    String readStringWithoutFirstTwoCharacters(String text);

    //     return the substring that is between the first and last appearance of the substring 'toast' in the given string,
//     or return an empty string if the substring 'toast' does not exist.
    String substringBetweenFirstAndLastAppearance(String text);

    // count how many times the text appears in a given string
    int countTextAppearsInString(String string, String findText);

    // return all words inside of string
    String[] findAllWords(String text);

    // return map of words and count of times it is repeated in string
    Map<String, Integer> countWordsInString(String text);
}