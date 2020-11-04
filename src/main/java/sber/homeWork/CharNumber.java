package sber.homeWork;

public class CharNumber {
    public static void main(String[] args) {
        char ch='1';
        boolean bool=true;
        System.out.println(isCharNumber(ch, true));
    }
    public static boolean isCharNumber (char ch, boolean bool) {
        return Character.isDigit(ch);
    }
}
