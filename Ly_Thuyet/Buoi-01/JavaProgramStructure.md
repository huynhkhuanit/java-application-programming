<p align="center">
  <img src="./assets/img/Java-Logo.png" alt="Description" width="300"/>
</p>

# CẤU TRÚC CHƯƠNG TRÌNH JAVA
---
## 1. CẤU TRÚC CƠ BẢN CỦA JAVA
> Một chương trình Java cơ bản luôn bắt đầu từ một lớp (class) và có một phương thức main để thực thi mã.

```java
public class Main {
    public static void main(String[] args) {
        // Đoạn mã thực thi ở đây
        System.out.println("Hello, World!");
    }
}
```
Giải thích từng thành phần:
1. `public class Main:`
    - public: Là một **modifier** chỉ ra rằng lớp này có thể được truy cập từ bất kỳ đâu (có phạm vi truy cập công khai). Đây là phạm vi truy cập thông dụng trong lập trình Java.
    - class: Từ khóa này dùng để khai báo một lớp trong Java. Một lớp là khuôn mẫu cho các đối tượng trong Java. Các phương thức và thuộc tính của đối tượng sẽ được định nghĩa trong lớp này.
    - Main: Đây là tên của lớp. Tên lớp trong Java phải trùng với tên file Java (trong trường hợp này là Main.java).
2. `public static void main(String[] args):`
    - `public`: Phạm vi truy cập công khai, có nghĩa là phương thức này có thể được gọi từ bất kỳ đâu.
    - `static`: Từ khóa này có nghĩa là phương thức này không cần tạo đối tượng của lớp để gọi phương thức. Điều này rất quan trọng vì khi chương trình Java bắt đầu chạy, hệ thống sẽ gọi phương thức main mà không cần khởi tạo đối tượng của lớp Main.
    - `void`: Kiểu trả về của phương thức. void có nghĩa là phương thức này không trả về giá trị nào.
    - `main`: Đây là tên phương thức chính mà JVM (Java Virtual Machine) sẽ tìm khi bắt đầu chạy chương trình. Phương thức main là điểm vào của chương trình.
    - `String[] args`: Là một tham số kiểu mảng chuỗi (String array), cho phép bạn truyền các tham số từ dòng lệnh khi chạy chương trình. Ví dụ: bạn có thể gọi chương trình như sau:
        ```cmd
        java Main Hello World
        ```
    - Và chương trình sẽ nhận các đối số "Hello" và "World" trong args.
3. `System.out.println("Hello, World!");:`
    - `System`: Là một lớp có sẵn trong Java, cung cấp nhiều phương thức tiện ích cho các tác vụ nhập xuất.
    - `out`: Là một đối tượng PrintStream của lớp System, dùng để xuất dữ liệu ra màn hình console.
    - `println`: Là phương thức của đối tượng out, dùng để in ra một dòng văn bản (và xuống dòng sau khi in).
---
## PHƯƠNG THỨC NON-STATIC
- Phương thức không phải static, còn gọi là phương thức thể hiện (instance method), là những phương thức mà bạn chỉ có thể gọi sau khi tạo một đối tượng của lớp chứa phương thức đó. Những phương thức này có thể truy cập và thay đổi các thành viên (biến) không phải static trong lớp, vì chúng hoạt động trên đối tượng cụ thể của lớp đó.

**1. Cách khai báo phương thức không phải static:**
Phương thức không phải static có thể có các thành phần giống như phương thức static, chỉ khác là bạn không dùng từ khóa static trước void (hoặc kiểu trả về).

```java
public class MyClass {
    int x;  // Biến thể hiện (instance variable)
    
    // Phương thức không phải static (Instance Method)
    public void printX() {
        System.out.println(x);  // Có thể truy cập và sử dụng các biến thể hiện của lớp
    }
}
```

**2. Sự khác biệt giữa phương thức static và phương thức không phải static:**
- Phương thức static:
    - Có thể được gọi mà không cần tạo đối tượng của lớp.
    - Chỉ có thể truy cập các thành viên static của lớp.
    - Ví dụ: MyClass.someStaticMethod();
- Phương thức không phải static:
    - Phải được gọi thông qua một đối tượng của lớp.
    - Có thể truy cập và thay đổi các thành viên cả static và không static của lớp.
```java
MyClass obj = new MyClass();
obj.printX();
```
**3. Ví dụ thực tế:**
- Giả sử bạn muốn tạo một lớp Student với các thông tin như tên và điểm của sinh viên, và có một phương thức không phải static để in ra thông tin của sinh viên.
```java
public class Student {
    // Các biến thể hiện (instance variables)
    String name;
    int score;
    
    // Phương thức không phải static (instance method)
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student1 = new Student();
        
        // Gán giá trị cho các thuộc tính của đối tượng
        student1.name = "John";
        student1.score = 90;
        
        // Gọi phương thức không phải static để in thông tin
        student1.printInfo();  // Kết quả: Name: John, Score: 90
    }
}
```
- Giải thích ví dụ trên:
    - Lớp Student có hai thuộc tính name và score, đây là các biến thể hiện (instance variables).
    - Phương thức printInfo là phương thức không phải static. Nó sẽ in ra tên và điểm của đối tượng Student mà phương thức này được gọi.
    - Trong phương thức main, bạn tạo đối tượng student1 của lớp Student và gán giá trị cho các thuộc tính name và score. Sau đó, bạn gọi phương thức printInfo thông qua đối tượng student1.
---
> Lưu ý: Bạn không thể truy cập trực tiếp vào các biến thể hiện mà không có phương thức cụ thể.
- Đối với các biến thể hiện nằm trong một lớp thì theo định nghĩa lập trình hướng đối tượng thì các biến ấy được gọi là các thuộc tính của một lớp, và một lớp được cấu thành bởi **thuộc tính (property)** và **phương thức (method)**
- Ví dụ thực tế:
```java
public class Counter {
    // Biến thể hiện
    private int count = 0;

    // Phương thức không phải static
    public void increment() {
        count++;
    }

    // Phương thức static
    public static void printMessage() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        // Gọi phương thức static mà không cần tạo đối tượng
        Counter.printMessage();
        
        // Tạo đối tượng Counter
        Counter counter = new Counter();
        
        // Gọi phương thức không phải static thông qua đối tượng
        counter.increment();
        counter.increment();
        
        // Để in giá trị count, cần gọi phương thức không phải static
        System.out.println("Count: " + counter.count);  // Kết quả: Count: 2
    }
}
```

---
© 2024 huynhkhuanit. All rights reserved.  
For more information, visit [Github | huynhkhuanit](https://github.com/huynhkhuanit).
