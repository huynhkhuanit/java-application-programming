package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_15 {
    public static double average(int[] arr) {
        int sum = 0;
        double avg = 0;

        for (int x : arr) sum += x;
        avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        System.out.println("Average: " + average(arr));
    }
}
