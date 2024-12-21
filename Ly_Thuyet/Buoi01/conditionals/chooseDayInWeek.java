package Ly_Thuyet.Buoi01.conditionals;

public class chooseDayInWeek {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Statuday");
                break;
            case 7:
                System.out.println("Statuday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}