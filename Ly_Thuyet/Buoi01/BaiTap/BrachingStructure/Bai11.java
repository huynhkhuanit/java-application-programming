package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height; System.out.print("Nhap chieu cao: "); height = scanner.nextDouble();
        double weight; System.out.print("Nhap can nang: "); weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 16) System.out.println("Gay do III");
        else if (bmi <= 16 && bmi < 17) System.out.println("Gay do II");
        else if (bmi <= 17 && bmi < 18.5) System.out.println("Gay do I");
        else if (bmi <= 18.5 && bmi < 25) System.out.println("Binh thuong");
        else if (bmi <= 25 && bmi < 30) System.out.println("Thua can");
        else if (bmi <= 30 && bmi < 35) System.out.println("Beo phi I");
        else if (bmi <= 35 && bmi < 40) System.out.println("Beo phi II");
        else System.out.println("Beo phi III");

        scanner.close();
    }
}
