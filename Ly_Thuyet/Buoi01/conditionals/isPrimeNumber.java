// Find and print all prime number from start to end

// Prime number is a number that is greater than 1 and divided by 1 or itself only.

package Ly_Thuyet.Buoi01.conditionals;

public class isPrimeNumber {
    public static void main(String[] args) {
        System.out.print("Prime numbers from 10 to 100: ");
        int start = 10; int end = 100;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
