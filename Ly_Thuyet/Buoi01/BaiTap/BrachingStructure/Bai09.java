package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.*;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("So duong!");
        } else if (n == 0) {
            System.out.println("Bang 0!");
        } else {
            System.out.println("So am!");
        }

        scanner.close();
    }
}
