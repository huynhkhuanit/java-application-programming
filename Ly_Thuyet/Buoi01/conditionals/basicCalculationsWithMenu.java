// Basic calculations with menu
package Ly_Thuyet.Buoi01.conditionals;

import java.util.Scanner;

public class basicCalculationsWithMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn chức năng:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");

        int choice = scanner.nextInt();

        System.out.println("Nhập số thứ nhất:");
        double num1 = scanner.nextDouble();
        System.out.println("Nhập số thứ hai:");
        double num2 = scanner.nextDouble();

        switch(choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot devide by Zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    } 
}
