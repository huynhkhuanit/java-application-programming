package Ly_Thuyet.Buoi02.bai_tap.arrays;

public class bai_05 {
    public static int[] insertElement(int[] arr, int position, int value) {
        if (position < 0 || position > arr.length) {
            System.out.println("Out of range!");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        arr = insertElement(arr, 2, 10);

        System.out.println("Array after inserting element at index 2: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
