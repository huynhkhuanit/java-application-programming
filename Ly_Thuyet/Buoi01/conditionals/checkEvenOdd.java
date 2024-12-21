// Bài code 1: Kiểm tra chẵn lẻ của một số nguyên

package Ly_Thuyet.Buoi01.conditionals;


public class checkEvenOdd {
    public static void main(String[] args) {
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even!");
        }
        else {
            System.out.println("Number " + number + " is odd!");
        }
    }
}