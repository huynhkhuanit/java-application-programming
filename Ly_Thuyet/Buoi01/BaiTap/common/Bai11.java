package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        int reverseNumber = 0;
        while (n != 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }

        System.out.println("So dao nguoc la: " + reverseNumber);

        scanner.close();
    }
}
