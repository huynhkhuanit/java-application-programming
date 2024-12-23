package Ly_Thuyet.Buoi01.BaiTap.BrachingStructure;

public class Bai03 {
    public static void main(String[] args) {
        int age = 25;
        if (age <= 12) {
            System.out.println("Tre em");
        } else if (age >= 13  && age <= 19) {
            System.out.println("Thieu nien");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Nguoi lon");
        } else {
            System.out.println("Nguoi cao tuoi");
        }
    }
}
