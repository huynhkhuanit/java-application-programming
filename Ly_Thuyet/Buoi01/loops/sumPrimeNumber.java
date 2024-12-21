// Sum of prime digits in a number

package Ly_Thuyet.Buoi01.loops;

public class sumPrimeNumber {
    public static void main(String[] args) {
        int n = 123456789, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            n /= 10;
        }
        System.out.println("Sum of prime digits: " + sum);
    }
}
