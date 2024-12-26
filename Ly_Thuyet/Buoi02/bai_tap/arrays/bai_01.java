package Ly_Thuyet.Buoi02.bai_tap.arrays;

// Tinh tong cac phan tu trong mang

public class bai_01 {
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };

        System.out.println("Sum: " + sumArr(arr));
    }
}
