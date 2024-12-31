// Tìm Phần Tử Lớn Nhất và Nhỏ Nhất
package Ly_Thuyet.Buoi02.bai_tap.arrays;

public class bai_02 {
    public static Pair<Integer, Integer> findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) { // Bắt đầu từ 1 thay vì 0
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i]; 
        }
        // Cập nhật Pair trước khi trả về
        return new Pair<>(min, max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Pair<Integer, Integer> result = findMinMax(arr);
        System.out.println("Min: " + result.getKey());
        System.out.println("Max: " + result.getValue());
    }
}