// Bài code 3: Kiểm tra năm nhuận

package Ly_Thuyet.Buoi01.conditionals;

public class checkLeapYear {
    public static void main(String[] args) {
        int year = 2024;
        // Lưu ý: Năm nhuận là năm chia hết 4 nhưng không chia hết cho 100 hoặc chia hết cho 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year!");
        }
        else {
            System.out.println("Year " + year + " is not a leap year!");
        }
    }
}