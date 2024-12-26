package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_13 {
    public static boolean isPalindrome(String s) {
        // Su dung phuong phap so sanh giua hai dau trong chuoi
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "radar";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    } 
}
