// Chương trình nhập vào một ký tự từ bàn phím, kiểm tra xem ký tự đó có phải là nguyên âm hay không.

package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

import java.util.*;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        char c = scanner.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Ky tu nhap vao la nguyen am");
        } else {
            System.out.println("Ky tu nhap vao la phu am");
        }

        scanner.close();
    }
}
