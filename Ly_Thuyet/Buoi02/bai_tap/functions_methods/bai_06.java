package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_06 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Prime numbers:");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
