package sber.homeWork;

public class MaxNumber {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Максимальное число: " +getMaxNumber(a,b));
    }

    public static int getMaxNumber ( int a, int b) {

        if (a > b)
            return a;
        else if (b > a)
            return b;
        else
            System.out.println("Числа равны");
        return 0;
    }
}
