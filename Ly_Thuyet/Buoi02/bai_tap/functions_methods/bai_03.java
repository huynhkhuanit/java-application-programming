package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_03 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        
    }
}
