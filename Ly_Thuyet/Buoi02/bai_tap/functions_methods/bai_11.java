package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_11 {
    public static int power(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 2, b = 3;

        System.out.println("Power: " + power(a, b));
    }
}
