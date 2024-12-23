package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Nhap lua chon: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a * b = " + (a * b));
                break;
            case 4:
                System.out.println("a / b = " + (a / b));
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }
        scanner.close();
    }
}
