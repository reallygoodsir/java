package massive;

import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        StringUtilsImp stringUtilsImpl = new StringUtilsImp();

        String result1 = stringUtilsImpl.removeDuplicatedSubstringsFromString("the biggest the word a bb");
        System.out.println(">>>" + result1 + "<<<");

        String result2 = stringUtilsImpl.removeDuplicatedSubstringsFromString("hello the cc biggest the word a bb cc cc hello");
        System.out.println(">>>" + result2 + "<<<");

        Set<String> result3 = stringUtilsImpl.findAllDuplicatedSubstrings("it actually works, it works, omg it actually works omg");
        System.out.println("allDuplicatedSubstrings:");
        for (String allDuplicatedSubstring : result3) {
            System.out.println(allDuplicatedSubstring);
        }

        Set<String> result4 = stringUtilsImpl.findAllDuplicatedSubstrings("hello hello");
        System.out.println("allDuplicatedSubstrings:");
        for (String allDuplicatedSubstring : result4) {
            System.out.println(allDuplicatedSubstring);
        }

        Set<String> result5 = stringUtilsImpl.findAllDuplicatedSubstrings("hello my dear friend my best hello");
        System.out.println("allDuplicatedSubstrings:");
        for (String allDuplicatedSubstring : result5) {
            System.out.println(allDuplicatedSubstring);
        }

        String result6 = stringUtilsImpl.removeDuplicatedCharactersInString("real text something unique too", "real text a b");
        System.out.println(">>>" + result6 + "<<<");

        String result7 = stringUtilsImpl.removeDuplicatedCharactersInString("real text something hello unique my test too real text", "real text hello my test");
        System.out.println(">>>" + result7 + "<<<");

        String result8 = stringUtilsImpl.removeDuplicatedCharactersInString("real text", "real text");
        System.out.println(">>>" + result8 + "<<<");

        String result9 = stringUtilsImpl.removeDuplicatedCharactersInString("real text", "");
        System.out.println(">>>" + result9 + "<<<");

        char result10 = stringUtilsImpl.findFirstUniqueCharacter("A bASIc StrIng");
        System.out.println(">>>" + result10 + "<<<");

        char result11 = stringUtilsImpl.findFirstUniqueCharacter("hello");
        System.out.println(">>>" + result11 + "<<<");

        char result12 = stringUtilsImpl.findFirstUniqueCharacter("hheello");
        System.out.println(">>>" + result12 + "<<<");

        char result13 = stringUtilsImpl.findFirstUniqueCharacter("hhee my lloo");
        System.out.println(">>>" + result13 + "<<<");

        String result14 = stringUtilsImpl.findDuplicatedSubstringsExistingInAnotherString("big word and i threw in a couple of words", "big word just some words");
        System.out.println(">>>" + result14 + "<<<");

        String result15 = stringUtilsImpl.findDuplicatedSubstringsExistingInAnotherString("big word just some words", "big word just some words");
        System.out.println(">>>" + result15 + "<<<");

        String result16 = stringUtilsImpl.findDuplicatedSubstringsExistingInAnotherString("start words some just word big end", "big word just some words");
        System.out.println(">>>" + result16 + "<<<");

        char result17 = stringUtilsImpl.findMostCommonCharacter("vvqqbvb");
        System.out.println(">>>" + result17 + "<<<");

        char result18 = stringUtilsImpl.findMostCommonCharacter("vvqqbvkkbkk");
        System.out.println(">>>" + result18 + "<<<");

        String result19 = stringUtilsImpl.reverseString("big text");
        System.out.println(">>>" + result19 + "<<<");

        String result20 = stringUtilsImpl.reverseEveryWord("this reversed is ...");
        System.out.println(">>>" + result20 + "<<<");

        String result21 = stringUtilsImpl.reverseEveryWord("my friend is the best");
        System.out.println(">>>" + result21 + "<<<");
        System.out.println("\n");

        boolean result22 = stringUtilsImpl.checkTwoStringsAreRotationsOfEachOther("big", "gib");
        System.out.println(">>>" + result22 + "<<<");
        System.out.println("\n");

        String result23 = stringUtilsImpl.removeCharactersFromString("textlonger", 't', 'a', 'e', 'l'); // "xongr"
        System.out.println(">>>" + result23 + "<<<");

        String result24 = stringUtilsImpl.checkIfStringBeginsWithSomeWords("black something");
        System.out.println(">>>" + result24 + "<<<");

        String result25 = stringUtilsImpl.readAndAppendStrings("black album", "venom snake");
        System.out.println(">>>" + result25 + "<<<");

        String result26 = stringUtilsImpl.readAndAppendStrings("black album hello", "venom snake");
        System.out.println(">>>" + result26 + "<<<");

        String result27 = stringUtilsImpl.readAndAppendStrings("black album", "venom snake hello");
        System.out.println(">>>" + result27 + "<<<");

        boolean result28 = stringUtilsImpl.checkFirstTwoCharactersAppearAtTheEnd("ttbigsomethingt");
        System.out.println(">>>" + result28 + "<<<");

        boolean result29 = stringUtilsImpl.checkFirstTwoCharactersAppearAtTheEnd("thbigsomethingth");
        System.out.println(">>>" + result29 + "<<<");

        String result30 = stringUtilsImpl.readStringWithoutFirstTwoCharacters("gaxi");
        System.out.println(">>>" + result30 + "<<<");

        String result31 = stringUtilsImpl.readStringWithoutFirstTwoCharacters("ghaxi");
        System.out.println(">>>" + result31 + "<<<");

        String result32 = stringUtilsImpl.readStringWithoutFirstTwoCharacters("axi");
        System.out.println(">>>" + result32 + "<<<");

        System.out.println();
        System.out.println("Check toast:");
        String result33 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("qwe toast bbb g bigman toast");
        System.out.println(">>>" + result33 + "<<<");

        String result34 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toast my hello toast");
        System.out.println(">>>" + result34 + "<<<");

        String result35 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toasttoast");
        System.out.println(">>>" + result35 + "<<<");

        String result36 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toasttoasttoast");
        System.out.println(">>>" + result36 + "<<<");

        String result37 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toast toast toast toast toast");
        System.out.println(">>>" + result37 + "<<<");

        String result38 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toast toast my toast hello toast toast");
        System.out.println(">>>" + result38 + "<<<");

        String result39 = stringUtilsImpl.substringBetweenFirstAndLastAppearance(" ddd toast ggg");
        System.out.println(">>>" + result39 + "<<<");

        String result40 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("toas");
        System.out.println(">>>" + result40 + "<<<");

        String result41 = stringUtilsImpl.substringBetweenFirstAndLastAppearance("");
        System.out.println(">>>" + result41 + "<<<");

        int result42 = stringUtilsImpl.countTextAppearsInString("boss the letter the boo the", "the");
        System.out.println(">>>" + result42 + "<<<");

        String[] words = stringUtilsImpl.findAllWords("     comically   dddssd   my     first    large    text     ");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(">>>" + word + "<<<");
        }

        Map<String, Integer> mapWords = stringUtilsImpl.countWordsInString("comically my first large text text first text hello");
        for (String key : mapWords.keySet()) {
            Integer value = mapWords.get(key);
            System.out.println(key + " ---- " + value);
        }

        boolean result43 = stringUtilsImpl.checkStringStartsWithAnotherString("hello my name", "hel");
        System.out.println(">>>" + result43 + "<<<");

        String result44 = stringUtilsImpl.convertToLowerCase("hELlo my name");
        System.out.println(">>>" + result44 + "<<<");

        String result45 = stringUtilsImpl.convertToUpperCase("hello my name");
        System.out.println(">>>" + result45 + "<<<");

        String result46 = stringUtilsImpl.trimString("      hello my name            ");
        System.out.println(">>>" + result46 + "<<<");

        String result47 = stringUtilsImpl.findLongestWord("hello my name");
        System.out.println(">>>" + result47 + "<<<");

        StringBuffer result48 = stringUtilsImpl.findLettersExistingMoreThanOnce("the absolute letter a exists twice");
        System.out.println(">>>" + result48 + "<<<");

        int result49 = stringUtilsImpl.findLengthOfLongestSubstring("hello sophisticated my name");
        System.out.println(">>>" + result49 + "<<<");

        String result50 = stringUtilsImpl.getSubstringAtTwoPositions("hello this is a string", 6, 10);
        System.out.println(">>>" + result50 + "<<<");

        boolean result51 = stringUtilsImpl.checkIfStringAtTheEndOfAnotherString("hELlo my name", "my name");
        System.out.println(">>>" + result51 + "<<<");
        System.out.println("\n");

        String[] parts = stringUtilsImpl.divideStringToEqualParts("hello M the my", 2);
        System.out.println("Parts: " + parts.length);
        for (String part : parts) {
            System.out.println(">>>" + part + "<<<");
        }
    }
}
