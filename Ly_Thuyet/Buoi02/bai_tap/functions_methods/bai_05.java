package Ly_Thuyet.Buoi02.bai_tap.functions_methods;

public class bai_05 {
    public static void printFibonacci(int n) {
        int f0 = 0, f1 = 1, fn = 0;

        System.out.print("Fibonacci: " + f0 + " " + f1 + " ");
        
        for (int i = 3; i <= n; i++) {
            fn = f0 + f1;
            System.out.print(fn + " ");
            f0 = f1;
            f1 = fn;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        printFibonacci(n);
    }
}
