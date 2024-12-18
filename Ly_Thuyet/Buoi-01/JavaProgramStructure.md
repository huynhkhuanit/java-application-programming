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

# KIỂU DỮ LIỆU TRONG JAVA

- Trong Java có 2 kiểu dữ liệu:
    - Kiểu dữ liệu nguyên thuỷ (Primitive Data Types)
    - Kiểu dữ liệu tham chiếu (Reference Data Types)

1. Kiểu dữ liệu nguyên thuỷ:
    - Kiểu dữ liệu nguyên thuỷ bao gồm:
        - byte.
        - short.
        - int.
        - long.
        - float.
        - double.
        - char.
        - boolean.

| Kiểu dữ liệu | Kích thước | Phạm vi giá trị | Mô tả |
| ----------- | -----------  | ----------- | ----------- |
| byte | 1 byte (8 bit) | -128 đến 127 | Số nguyên nhỏ, tiết kiệm bộ nhớ |
| short | 2 bytes (16 bit) | -32,768 đến 32,767 | Số nguyên nhỏ hơn kiểu `int` |
| int | 4 bytes (32 bit) | 	-2^31 đến 2^31 - 1 | Số nguyên thông thường |
| long | 8 bytes (64 bit) | -2^63 đến 2^63 - 1 | Số nguyên lớn hơn `int` |
| float | 4 bytes (32 bit) | ~ ±1.4E-45 đến ±3.4E+38 | Số thực dấu chấm động chính xác đơn |
| double | 8 bytes (64 bit) | ~ ±4.9E-324 đến ±1.8E+308 | Số thực dấu chấm động chính xác kép |
| char | 2 bytes (16 bit) | 0 đến 65,535 (ký tự Unicode) | Lưu trữ một ký tự Unicode |
| boolean | 1 bit | `true` hoặc `false` | Biểu diễn giá trị logic |

Ví dụ về các kiểu dữ liệu nguyên thủy:

```java
public class PrimitiveExample {
    public static void main(String[] args) {
        byte a = 100;       // Kiểu byte
        short b = 30000;    // Kiểu short
        int c = 1000000;    // Kiểu int
        long d = 10000000000L;  // Kiểu long (L ở cuối để chỉ định là long)
        
        float e = 3.14f;    // Kiểu float (f ở cuối)
        double f = 3.141592653589; // Kiểu double
        
        char g = 'A';       // Kiểu char (ký tự Unicode)
        boolean h = true;   // Kiểu boolean
        
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}
```


2. **Kiểu dữ liệu tham chiếu (Reference Data Types):**
    - Là các kiểu dữ liệu dùng để tham chiếu đến các đối tượng (objects) trong bộ nhớ.
    - Thay vì lưu trực tiếp giá trị, kiểu tham chiếu lưu địa chỉ của đối tượng trong bộ nhớ heap.

- **Các kiểu dữ liệu tham chiếu bao gồm:**
    - `Lớp (Class)`: Đối tượng của lớp (ví dụ: String, Scanner, ArrayList).
    - `Interface`: Các kiểu dữ liệu giao diện trong Java.
    - `Mảng (Arrays)`: Mảng là đối tượng trong Java và được coi là kiểu tham chiếu.
    - `Kiểu dữ liệu đặc biệt`: null là một giá trị đặc biệt đại diện cho kiểu tham chiếu không trỏ tới đối tượng nào.

Ví dụ về kiểu tham chiếu:

```java
import java.util.ArrayList;

public class ReferenceExample {
    public static void main(String[] args) {
        // String là kiểu dữ liệu tham chiếu
        String name = "John Doe";
        
        // Mảng cũng là kiểu dữ liệu tham chiếu
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Sử dụng lớp và đối tượng
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        
        // Hiển thị
        System.out.println("String: " + name);
        System.out.println("Array: " + numbers[0]);
        System.out.println("List: " + list);
    }
}
```

So sánh kiểu nguyên thủy và kiểu tham chiếu:

| Tiêu chí | Kiểu nguyên thủy | Kiểu tham chiếu |
| ----------- | -----------  | ----------- |
| Lưu trữ giá trị | Lưu trực tiếp giá trị | Lưu địa chỉ bộ nhớ của đối tượng |
| Bộ nhớ | Nằm trong Stack | Đối tượng nằm trong Heap |
| Giá trị mặc định | 0, false, ký tự rỗng (\u0000) | null |
| Ví dụ | int, char, boolean | String, ArrayList, Object, null |

3. Java Identifiers  🚀

- Trong Java, **Identifiers** (định danh) là tên được sử dụng để định danh các thành phần như biến, phương thức, lớp, đối tượng, interface, gói (package) và hằng số.
- Nói cách khác, bất kỳ tên nào bạn tự đặt trong chương trình Java đều được gọi là **Identifier**.

Ví dụ:

```java
public class MyClass {     // MyClass là Identifier (tên lớp)
    int number = 10;       // number là Identifier (tên biến)
    
    public void display() {   // display là Identifier (tên phương thức)
        System.out.println("Number: " + number);
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();  // obj là Identifier (tên đối tượng)
        obj.display();
    }
}
```

- **Quy tắc đặt tên Identifier trong Java**

Khi đặt tên biến, phương thức hoặc các thành phần khác, bạn cần tuân thủ các quy tắc sau:

- Bắt buộc:
    - **Identifier** chỉ chứa các ký tự hợp lệ: Bao gồm chữ cái (a-z, A-Z), chữ số (0-9), dấu gạch dưới (_), và dấu $ (dấu đô la).
    - **Identifier** không được bắt đầu bằng chữ số.
    - Không được trùng với từ khóa trong Java (ví dụ: int, class, if, static, v.v.).
    - Phân biệt chữ hoa và chữ thường (**MyClass** khác **myclass**).

- Khuyến khích (Quy ước đặt tên theo chuẩn):
    - **Tên biến và phương thức**: Sử dụng **camelCase** (chữ cái đầu tiên viết thường, các từ tiếp theo viết hoa chữ cái đầu).
        - Ví dụ: *studentName*, *calculateSum()*.
    - **Tên lớp và interface**: Sử dụng **PascalCase** (mỗi từ viết hoa chữ cái đầu tiên).
        - Ví dụ: *MyClass*, *StudentInfo*.
    - **Tên hằng số (constant)**: Sử dụng chữ in hoa và phân tách các từ bằng dấu gạch dưới (_).
        - Ví dụ: *MAX_VALUE*, *PI*.

--- 

### Sự khác biệt giữa Static và Non-Static trong Java

- **Cách viết Non-Static (Instance methods):**
    - Các biến được khai báo như một biến thể hiện (instance variables) được xem như là thuộc tính của một lớp đối tượng.
    - Phụ thuộc vào các đối tượng.
    - Sử dụng khi mỗi đối tượng có dữ liệu hoặc trạng thái riêng biệt.
    - Được khởi tạo khi đối tượng được khởi tạo.
    - Lưu trữ trong bộ nhớ Heap.
- **Cách viết Static:**
    - Các biến được khai báo ngoài class như thêm một từ khoá `static` thể hiện đây là các biến tĩnh của một lớp.
    - Không phụ thuộc vào đối tượng.
    - Truy cập trực tiếp thông qua tên class.
    - Sử dung khi dữ liệu hoặc phương thức không thay đổi giữa các đối tượng (chung cho tất cả).
    - Được tạo khi lớp được nạp vào bộ nhớ.
    - Lưu trữ trong Method Area.

---

## Sự khác biệt giữa việc khai báo biến trong main và ngoài main (ở cấp lớp)

1. **Biến khai báo trong main (Local variables)**
    - Khi bạn khai báo biến bên trong main, biến đó sẽ được gọi là biến cục bộ (local variable). Chúng chỉ tồn tại trong phạm vi phương thức main và không thể truy cập từ các phương thức hoặc lớp khác.
    - Đặc điểm:
        - **Phạm vi (scope)**: Biến chỉ tồn tại trong main.
        - **Thời gian sống (lifetime)**: Biến được tạo khi phương thức main bắt đầu và bị hủy khi phương thức main kết thúc.
        - **Không có giá trị mặc định**: Bạn phải khởi tạo giá trị trước khi sử dụng, vì biến cục bộ không có giá trị mặc định.

Ví dụ:

```java
public class Example {
    public static void main(String[] args) {
        String studentName = "Huynh Khuan"; // Biến cục bộ
        int studentAge = 20;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}
```

- Nhận xét:
    - `studentName` và `studentAge` chỉ tồn tại trong main.
    - Bạn không thể truy cập chúng từ bất kỳ phương thức hoặc đối tượng nào khác.


2. **Biến khai báo ở ngoài main (instance variables hoặc static variables)**
    - Khi bạn khai báo biến ngoài main nhưng bên trong lớp, các biến này trở thành biến thành viên (member variables). Chúng có thể là static hoặc non-static (instance variables) tùy thuộc vào cách khai báo.

- Đặc điểm:
    - Phạm vi (scope):
        - Static variables: Dùng chung cho tất cả các đối tượng, có thể truy cập mà không cần khởi tạo đối tượng.
        - Instance variables: Thuộc về từng đối tượng cụ thể, phải truy cập qua đối tượng.
    - Thời gian sống (lifetime):
        - Static variables: Tồn tại từ khi lớp được nạp vào bộ nhớ đến khi chương trình kết thúc.
        - Instance variables: Tồn tại từ khi đối tượng được tạo đến khi đối tượng bị hủy.
    - Có giá trị mặc định: Không cần khởi tạo giá trị, Java sẽ tự gán giá trị mặc định.

Ví dụ:

```java
public class Example {
    // Biến instance (không static)
    String studentName = "Huynh Khuan";
    int studentAge = 20;

    public static void main(String[] args) {
        Example obj = new Example(); // Tạo đối tượng để truy cập biến instance
        System.out.println("Student Name: " + obj.studentName);
        System.out.println("Student Age: " + obj.studentAge);
    }
}
```
---

## Khi nào sử dụng biến trong main hoặc ngoài main?
- **Biến trong main (local variables):**
    - Khi giá trị biến chỉ cần được sử dụng bên trong phương thức main.
    - Không cần lưu trữ giá trị biến lâu dài.
    - Sử dụng để thực hiện các tính toán hoặc xử lý tạm thời.
- **Biến ngoài main (instance hoặc static variables):**
    - Khi cần lưu trữ trạng thái hoặc thông tin của đối tượng.
    - Khi cần chia sẻ giá trị giữa nhiều phương thức hoặc nhiều đối tượng trong chương trình.
    - Static variables phù hợp khi giá trị biến là chung cho tất cả đối tượng.

---

# JAVA TYPE CASTING (ÉP KIỂU TRONG JAVA)

- Ép kiểu là khi bạn gán một giá trị nguyên thuỷ này cho một kiểu khác.
- Trong Java có 2 loại **Casting**:
    1. **Widening Casting (tự động)** - chuyển đổi một loại nhỏ hơn đến kích thước kiểu chữ lớn hơn
        - `byte -> short -> char -> int -> long -> float -> double`
    2. **Thu hẹp đúc (thủ công)** - chuyển đổi loại lớn hơn sang loại kích thước nhỏ hơn
        - `double -> float -> long -> int -> char -> short -> byte`

**Ví dụ kiểu ép kiểu tự động:**

```java
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

**Ví dụ kiểu ép kiểu thủ công:**

```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```

---

## 3. TOÁN TỬ TRONG JAVA

- 

---
© 2024 huynhkhuanit. All rights reserved.  
For more information, visit [Github | huynhkhuanit](https://github.com/huynhkhuanit).
