package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; System.out.print("Nhap n: "); n = scanner.nextInt();

        int nCount = 0, nClone = n, nClone2 = n;
        while (n > 0) {
            n /= 10;
            nCount++;
        }

        int total = 0;

        while (nClone > 0) {
            total += Math.pow(nClone % 10, nCount);
            nClone /= 10;
        }

        if (nClone2 == total) {
            System.out.println(nClone2 + " la so Armstrong");
        } else {
            System.out.println(nClone2 + " khong phai la so Armstrong");
        }

        scanner.close();
    }
}
