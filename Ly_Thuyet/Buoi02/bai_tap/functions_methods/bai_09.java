package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_09 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Sum of digits: " + sumOfDigits(n));
    }
}
