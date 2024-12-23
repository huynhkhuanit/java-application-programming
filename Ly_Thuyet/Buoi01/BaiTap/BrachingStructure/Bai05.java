package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

public class Bai05 {
    public static void main(String[] args) {
        int a = 6, b = 73, c = 5, max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("So lon nhat la: " + max);
    }
}
