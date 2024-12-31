package Ly_Thuyet.Buoi02.bai_tap.arrays;

public class bai_04 {
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index is out of range");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        arr = deleteElement(arr, 2);

        System.out.println("Array after deleting element at index 2: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
