package Ly_Thuyet.Buoi01.loops;

import java.util.Scanner;

public class printFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series: " + a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        scanner.close();
    }
}
