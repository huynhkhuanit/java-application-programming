// Find min max number in 3 numbers

package Ly_Thuyet.Buoi01.conditionals;

public class findMinMaxNumber {
    public static void TernaryOperator() {
        int a = 3;
        int b = 4;
        int c = 5;

        // Use ternary operator to find max number and min number
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int max = 0, min = 0;

        // Nếu số a là sô lớn nhất thì max = 3
        if (a > b && a > c) max = a;
        else if (b > c) max = b; // Ngược lại nếu số a không lớn hơn 1 trong 2 số là b hoặc c thì chỉ còn lại trường hợp là b > c hoặc b < c -> Chỉ còn 1 trường hợp cần kiểm tra là  b > c hay không mà không cần phải kiểm tra thêm b > a hoặc b > c
        // Bởi vì b > a đã được kiểm tra ở trường hợp trước rồi, nếu a không lớn hơn b thì chắc chắn rằng b sẽ lớn hơn a cho nên ta loại được 1 trường hợp kiểm tra.
        // Này cũng được xem là các phương pháp tối ưu hoá code -> làm code trở lên clean hơn.
        else max = c;

        if (a < b && a < c) min = a;
        else if (b < c) min = b;
        else min = c;

        System.out.println("Max number is: " + max);
        System.out.println("Min number is " + min);

        // Call TernaryOperator method to find min max number
        // Function invoke
        TernaryOperator();
    }
}
