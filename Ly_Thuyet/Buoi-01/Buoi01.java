/*
    CẤU TRÚC CHƯƠNG TRÌNH JAVA
        - Một chương trình Java cơ bản luôn bắt đầu từ một lớp (class) và có một phương thức main để thực thi mã.
        
            public class Main {
                public static void main(String[] args) {
                    // Đoạn mã thực thi ở đây
                    System.out.println("Hello, World!");
                }
            }
        
        public class Main:
        - public: Là một modifier chỉ ra rằng lớp này có thể được truy cập từ bất kỳ đâu (có phạm vi truy cập công khai). Đây là phạm vi truy cập thông dụng trong lập trình Java.
        - class: Từ khóa này dùng để khai báo một lớp trong Java. Một lớp là khuôn mẫu cho các đối tượng trong Java. Các phương thức và thuộc tính của đối tượng sẽ được định nghĩa trong lớp này.
        - Main: Đây là tên của lớp. Tên lớp trong Java phải trùng với tên file Java (trong trường hợp này là Main.java).

        public static void main(String[] args):
        - public: Phạm vi truy cập công khai, có nghĩa là phương thức này có thể được gọi từ bất kỳ đâu.
        - static: Từ khóa này có nghĩa là phương thức này không cần tạo đối tượng của lớp để gọi phương thức. Điều này rất quan trọng vì khi chương trình Java bắt đầu chạy, hệ thống sẽ gọi phương thức main mà không cần khởi tạo đối tượng của lớp Main.
        - void: Kiểu trả về của phương thức. void có nghĩa là phương thức này không trả về giá trị nào.
        - main: Đây là tên phương thức chính mà JVM (Java Virtual Machine) sẽ tìm khi bắt đầu chạy chương trình. Phương thức main là điểm vào của chương trình.
        - String[] args: Là một tham số kiểu mảng chuỗi (String array), cho phép bạn truyền các tham số từ dòng lệnh khi chạy chương trình. Ví dụ: bạn có thể gọi chương trình như sau:
        
            java Main Hello World
        
        System.out.println("Hello, World!");:

        - System: Là một lớp có sẵn trong Java, cung cấp nhiều phương thức tiện ích cho các tác vụ nhập xuất.
        - out: Là một đối tượng PrintStream của lớp System, dùng để xuất dữ liệu ra màn hình console.
        - println: Là phương thức của đối tượng out, dùng để in ra một dòng văn bản (và xuống dòng sau khi in).


    KIỂU DỮ LIỆU TRONG JAVA
        1. Kiểu dữ liệu nguyên thuỷ
            1.1. byte
                - Kích thước: 1 byte (8 bit)
                - Phạm vi: Từ -128 đến 127 = 256 giá trị
                - Mô tả: Lưu trữ số nguyên nhỏ, phù hợp với các ứng dụng yêu cầu bộ nhớ ít, như xử lý dữ liệu tệp tin hoặc giao tiếp với phần cứng.
            1.2. short
                - Kích thước: 2 bytes (16 bit)
                - Phạm vi giá trị: Từ -32,768 đến 32,767
                - Mô tả: Dùng để lưu trữ các số nguyên nhỏ hơn int nhưng lớn hơn byte.
            1.3. int
                - Kích thước: 4 bytes (32 bit)
                - Phạm vi giá trị: Từ -2^31 đến 2^31 - 1 (khoảng từ -2 tỷ đến 2 tỷ)
                - Mô tả: Là kiểu dữ liệu số nguyên phổ biến nhất trong Java, được dùng để lưu trữ các số nguyên có phạm vi vừa phải.
            1.4. long
                - Kích thước: 8 bytes (64 bit)
                - Phạm vi giá trị: Từ -2^63 đến 2^63 - 1
                - Mô tả: Dùng để lưu trữ các số nguyên lớn mà kiểu int không thể chứa.
            1.5. float
                - Kích thước: 4 bytes (32 bit)
                - Phạm vi giá trị: Khoảng từ ±1.4E-45 đến ±3.4E+38
                - Mô tả: Dùng để lưu trữ các số thực với độ chính xác đơn (single precision). Thường được dùng khi cần tiết kiệm bộ nhớ nhưng không yêu cầu độ chính xác cao.
            1.6. double
                - Kích thước: 8 bytes (64 bit)
                - Phạm vi giá trị: Khoảng từ ±4.9E-324 đến ±1.8E+308
                - Mô tả: Dùng để lưu trữ các số thực với độ chính xác kép (double precision). Đây là kiểu dữ liệu số thực phổ biến nhất trong Java khi cần độ chính xác cao.
            1.7. char
                - Kích thước: 2 bytes (16 bit)
                - Phạm vi giá trị: Từ '\u0000' (0) đến '\uffff' (65,535)
                - Mô tả: Dùng để lưu trữ một ký tự Unicode. Mỗi ký tự trong Java được lưu trữ dưới dạng số nguyên 16 bit.
            1.8. Boolean
                - Kích thước: Không xác định, nhưng thường được lưu trữ dưới dạng một bit.
                - Phạm vi giá trị: true hoặc false
                - Mô tả: Dùng để lưu trữ giá trị logic (đúng hoặc sai). Là kiểu dữ liệu duy nhất không phải là số trong Java.
 */

import java.util.Scanner;

public class Buoi01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Height
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        scanner.close();
    }
}