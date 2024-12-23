package Ly_Thuyet.Buoi01.BaiTap.common;

public class Bai10 {
    public static int binomialCoefficient(int n, int k) {
        int res = 1;

        int facN = 1, facK = 1, facNK = 1;
        for (int i = 1; i <= n; i++) facN *= i;
        for (int i = 1; i <= k; i++) facK *= i;
        for (int i = 1; i <= n - k; i++) facNK *= i;

        res = facN / (facK * facNK);
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }

            System.out.println();
        }
    }
}
