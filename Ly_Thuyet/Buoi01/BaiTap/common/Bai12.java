package Ly_Thuyet.Buoi01.BaiTap.common;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str; System.out.print("Nhap chuoi: "); str = scanner .nextLine();

        int countWord = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                countWord++;
            }
        }

        System.out.println(str + " co " + countWord + " tu");
        scanner.close();
    }
}
