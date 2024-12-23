package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; System.out.print("Nhap a: "); a = scanner.nextInt();
        int b; System.out.print("Nhap b: "); b = scanner.nextInt();

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        System.out.println("UCLN la: " + a);

        scanner.close();
    }
}
