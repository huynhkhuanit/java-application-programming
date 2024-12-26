// Tinh tong hai so nguyen

package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

import java.util.Scanner;

public class bai_01 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0; System.out.print("Nhap a: "); a = scanner.nextInt();
        int b = 0; System.out.print("Nhap b: "); b = scanner.nextInt();

        System.out.println("Tong cua a va b la: " + sum(a, b));

        scanner.close();
    }
}