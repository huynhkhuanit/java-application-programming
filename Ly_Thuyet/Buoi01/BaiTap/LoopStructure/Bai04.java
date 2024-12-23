package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        int reverseNumber = 0;
        while (n > 0) {
            int digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n /= 10;
        }

        System.out.println("So dao nguoc cua " + n + " la: " + reverseNumber);

        scanner.close();
    }
}
