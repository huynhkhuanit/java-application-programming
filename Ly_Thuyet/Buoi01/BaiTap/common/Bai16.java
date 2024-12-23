package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str; System.out.print("Nhap chuoi: "); str = scanner.nextLine();

        boolean isPalindrome = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " la chuoi doi xung");
        } else {
            System.out.println(str + " khong phai la chuoi doi xung");
        }

        scanner.close();
    }
}
