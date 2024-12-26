package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_04 {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        } else {
            if (c > max) {
                max = c;
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        int a = 5, b = 9, c = 3;

        System.out.println("Max: " + findMax(a, b, c));
    }
}
