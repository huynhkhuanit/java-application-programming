package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

import java.util.Scanner;

public class bai_02 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0; System.out.print("Nhap n: "); n = scanner.nextInt();

        if (isEven(n)) {
            System.out.println("So " + n + " la so chan.");
        } else {
            System.out.println("So " + n + " la so le.");
        }

        scanner.close();
    }
}
