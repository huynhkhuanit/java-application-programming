package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        // while
        int i = 3, a = 1, b = 1;
        System.out.print("Day fibonacci la: " + a + " " + b + " ");
        while (i <= n) {
            int tmp = a + b;
            a = b;
            b = tmp;
            System.out.print(tmp + " ");
            i++;
        }

        scanner.close();
    }
}
