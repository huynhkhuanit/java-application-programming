// Bài code 4: Kiểm tra học lực của học sinh dựa trên điểm số

package Ly_Thuyet.Buoi01.conditionals;

public class checkGPA {
    public static void main(String[] args) {
        double score = 7.5;
        if (score >= 9) {
            System.out.println("Học lực: Xuất sắc");
        } else if (score >= 8) {
            System.out.println("Học lực: Giỏi");
        } else if (score >= 6.5) {
            System.out.println("Học lực: Khá");
        } else if (score >= 5) {
            System.out.println("Học lực: Trung bình");
        } else {
            System.out.println("Học lực: Yếu");
        }
    }
}
