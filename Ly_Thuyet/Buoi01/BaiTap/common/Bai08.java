package Ly_Thuyet.Buoi01.BaiTap.common;

public class Bai08 {
    public static void main(String[] args) {
        int n = 5;
        int fractorial = 1;
        for (int i = 1; i <= n; i++) {
            fractorial *= i;
        }

        System.out.println(n + "! = " + fractorial);
    }
}
