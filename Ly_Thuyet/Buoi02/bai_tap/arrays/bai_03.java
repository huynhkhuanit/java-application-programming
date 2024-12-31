package Ly_Thuyet.Buoi02.bai_tap.arrays;

public class bai_03 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 6};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " +  3 + " la: " + count);
    }
}
