package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

public class Bai04 {
    public static void main(String[] args) {
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Nam nhuan");
        } else {
            System.out.print("Khong phai nam nhuan");
        }
    }
}
