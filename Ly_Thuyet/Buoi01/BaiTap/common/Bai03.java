package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; System.out.print("Nhap a: "); a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("So duong!");
        } else {
            System.out.println("So am!");
        }

        scanner.close();
    }
}
