package Ly_Thuyet.Buoi01;

// Viết chương trình in ra thông tin sinyh viên

public class Example01 {
    // Name
    String studentName = "Huynh Khuan IT";
    // Student ID
    String studentID = "2205CT0035";
    // Age
    int studentAge = 20;
    // Student Class
    String studentClass = "CT06PM";
    // Student Fee
    float studentFee = 12000000.5000f;
    // Student Grade
    char studentGrade = 'A';

    public static void main(String[] args) {
        Example01 Student = new Example01();
        System.out.println("Student Name: " + Student.studentName);
        System.out.println("Student Age: " + Student.studentAge);
        System.out.println("Student ID: " + Student.studentID);
        System.out.println("Student Class: " + Student.studentClass);
        System.out.println("Student Fee: " + Student.studentFee);
        System.out.println("Student Grade: " + Student.studentGrade);
    }
}