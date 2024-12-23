package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: "); int n = scanner.nextInt();

        int forSum = 0, whileSum = 0, doWhileSum = 0;

        // For
        for (int i = 1; i <= n; i++) {
            forSum += i;
        }

        // While
        int i = 1;
        while (i <= n) {
            whileSum += i;
            i++;
        }

        // Do While
        i = 1;
        do {
            doWhileSum += i;
            i++;
        } while (i <= n);

        System.out.println("Tong cac so tu 1 den " + n + " la: " + forSum);
        System.out.println("Tong cac so tu 1 den " + n + " la: " + whileSum);
        System.out.println("Tong cac so tu 1 den " + n + " la: " + doWhileSum);

        scanner.close();
    }
}
