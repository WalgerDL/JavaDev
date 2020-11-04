package sber.homeWork;

import sber.Main;

public class ShildtBook {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

    class OverLoad {
        public static void main(String[] args) {
            ShildtBook ob = new ShildtBook();
            double result;
            ob.test();
            ob.test(10);
            ob.test(10, 20);
            result = ob.test(123.25);
            System.out.println("Результат вызова ob.test(123.25): " + result);
        }
    }

