package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.*;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("n chia het cho 5 va 11");
        } else {
            System.out.println("n khong chia het cho 5 va 11");
        }

        scanner.close();
    }
}
