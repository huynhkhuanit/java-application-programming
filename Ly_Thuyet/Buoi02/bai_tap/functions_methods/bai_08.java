package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_08 {
    public static String reverseString(String s) {
        String reversed = "";

        // Duyet nguoc lai tu cuoi chuoi len dau chuoi -> gan lai tung gia tri cho chuoi moi -> chuoi dao nguoc
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Reversed string: " + reverseString(s));
    }
}
