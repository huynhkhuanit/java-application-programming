package Ly_Thuyet.Buoi01.BaiTap.LoopStructure;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; System.out.print("Nhap a: "); a = scanner.nextInt();
        int b; System.out.print("Nhap b: "); b = scanner.nextInt();

        do {
            int tmp = a % b;
            a = b;
            b = tmp;
        } while (b != 0);

        System.out.println("UCLN: " + a);

        scanner.close();
    }
}
