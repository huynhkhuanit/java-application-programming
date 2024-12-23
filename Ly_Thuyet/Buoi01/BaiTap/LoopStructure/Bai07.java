package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
