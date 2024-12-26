package Ly_Thuyet.Buoi02.bai_tap.arrays;

import javafx.util.Pair;

public class bai_02 {
    public static Pair<Integer, Integer> findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        Pair<Integer, Integer> result = new Pair<>(min, max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i]; 
        }
        return result;
    }
}
