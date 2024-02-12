public class StringUtils {
    public static void convertToString(int x, long y, double z) {
        String result = "Coordinates x=" + x + " y=" + y + " z=" + z;
        printString(result);
    }

    public static void printString(String input) {
        System.out.println(input);
    }
}