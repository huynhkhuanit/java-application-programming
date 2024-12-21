// Use for loop to find prime number - by huynhkhuanit

package Ly_Thuyet.Buoi01.loops;

import java.util.Scanner;

public class checkPrimeNumber {
    // Prime number is a number that is greater that 1 and devied by 1 or itself only
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Number " + number + " is prime!");
        } else {
            System.out.println("Number " + number + " is not prime!");
        }

        scanner.close();
    }
}