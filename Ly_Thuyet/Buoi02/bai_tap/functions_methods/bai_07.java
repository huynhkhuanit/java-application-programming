package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_07 {
    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Programming";
        char c = 'g';

        System.out.println("Number of '" + c + "': " + countChar(s, c));
    }
}
