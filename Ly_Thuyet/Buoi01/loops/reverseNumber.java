package Ly_Thuyet.Buoi01.loops;

public class reverseNumber {
    public static void main(String[] args) {
        int number = 1234567;
        int reverseNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println("Reverse number: " + reverseNumber);
    }
}
