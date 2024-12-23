package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.print("Tong cac chu so cua n la: " + sum);

        scanner.close();
    }
}
