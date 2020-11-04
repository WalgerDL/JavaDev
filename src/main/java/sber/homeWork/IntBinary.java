package sber.homeWork;

public class IntBinary {
    public static void main(String[] args) {
        for ( int count = 0; count <= 30; count++) {
            String str = Integer.toBinaryString(count);
            System.out.println(str);
        }
    }
}
