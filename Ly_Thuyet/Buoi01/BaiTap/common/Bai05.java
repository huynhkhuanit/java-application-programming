package Ly_Thuyet.Buoi01.BaiTap.common;

public class Bai05 {
    public static void main(String[] args) {
        int n = 10;

        int i = 1, sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Tong tu 1 den " + n + " la: " + sum);
    }
}
