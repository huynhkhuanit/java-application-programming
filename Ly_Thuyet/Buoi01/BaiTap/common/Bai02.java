package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; System.out.print("Nhap a: "); a = scanner.nextInt();
        int b; System.out.print("Nhap b: "); b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        scanner.close();
    }
}
