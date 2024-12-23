package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.*;

public class Bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Xuat sac");
        } else if (score >= 70) {
            System.out.println("Gioi");
        } else if (score >= 50) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Kem");
        }

        scanner.close();
    }
}
