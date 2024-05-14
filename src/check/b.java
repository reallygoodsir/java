package check;

public class b {
    public static void main(String[] args) {
        String input = "Today is the happiest day of my life";
        String[] word = input.split(" ");
        String longword = " ";
        for (int wordBasis = 0; wordBasis < word.length; wordBasis++)
            for (int wordScroller = 1 + wordBasis; wordScroller < word.length; wordScroller++)
                if (word[wordBasis].length() >= word[wordScroller].length())
                    longword = word[wordBasis];

        System.out.println(longword);
    }
}
