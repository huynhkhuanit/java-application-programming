package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        
        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        if (n < 2) {
            isPrime = !isPrime;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = !isPrime;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " la so nguyen to!");
        } else {
            System.out.println(n + " khong la so nguyen to!");
        }

        scanner.close();
    }
}
