package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("So chan");
        }
        else {
            System.out.println("So le");
        }   

        scanner.close();
    }
}
