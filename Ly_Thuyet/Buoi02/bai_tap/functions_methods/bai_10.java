package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_10 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 36, b = 60;

        System.out.println("GCD: " + findGCD(a, b));
    }
}
