package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (n == sum) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong phai la so hoan hao");
        }

        scanner.close();
    }
}
