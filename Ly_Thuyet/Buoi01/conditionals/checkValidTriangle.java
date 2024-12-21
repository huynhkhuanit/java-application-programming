// Check valid triangle and type of triangle

package Ly_Thuyet.Buoi01.conditionals;

public class checkValidTriangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba canh " + a + ", " + b + ", " + c + " tao thanh tam giac");
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } 
        else {
            System.out.println("Ba canh " + a + ", " + b + ", " + c + " khong tao thanh tam giac");
        }
    }
}
