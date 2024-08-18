package regex.one;

public class First {
    public static void main(String[] args) {

        System.out.println(validate("ABCDEFabcdef123450"));
        System.out.println(validate("SQL2"));
        System.out.println(validate("Java"));
        System.out.println(validate("*&%@#!}{29289"));
        System.out.println(validate("w3resource.c3om"));
    }

    public static boolean validate(String text) {
        return text.matches("^[\\w]+$");
    }
}
