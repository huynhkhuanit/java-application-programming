package java_nang_cao.dynamic_programming;

import java.util.Scanner;

public class fibonacci {
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] fib = new int[n];

        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        printFibonacci(n);

        scanner.close();
    }
}
