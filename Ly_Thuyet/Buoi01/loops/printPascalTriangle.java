package Ly_Thuyet.Buoi01.loops;

/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

    - Công thức tính tổ hợp: C(n, k) = n! / (k! * (n - k)!)
*/

public class printPascalTriangle {
    public static int binomialCoefficient(int n, int k) {
        int res = 1;

        // // Cách 1: Sử dụng vòng lặp
        // if (k > n - k) {
        //     k = n - k;
        // }

        // for (int i = 0; i < k; i++) {
        //     res *= (n - i);
        //     res /= (i + 1);
        // }

        // Cách 2: Sử dụng công thức
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
