<p align="center">
  <img src="./assets/img/Java-Logo.png" alt="Description" width="300"/>
</p>

---

# MỤC LỤC:
- [MỤC LỤC:](#mục-lục)
- [1. CẤU TRÚC CHƯƠNG TRÌNH JAVA](#1-cấu-trúc-chương-trình-java)
  - [1.1. CẤU TRÚC CƠ BẢN CỦA JAVA](#11-cấu-trúc-cơ-bản-của-java)
  - [1.2 PHƯƠNG THỨC NON-STATIC](#12-phương-thức-non-static)
- [2. KIỂU DỮ LIỆU TRONG JAVA](#2-kiểu-dữ-liệu-trong-java)
  - [2.1. Sự khác biệt giữa Static và Non-Static trong Java](#21-sự-khác-biệt-giữa-static-và-non-static-trong-java)
  - [2.2. Sự khác biệt giữa việc khai báo biến trong main và ngoài main (ở cấp lớp)](#22-sự-khác-biệt-giữa-việc-khai-báo-biến-trong-main-và-ngoài-main-ở-cấp-lớp)
  - [2.3. Khi nào sử dụng biến trong main hoặc ngoài main?](#23-khi-nào-sử-dụng-biến-trong-main-hoặc-ngoài-main)
- [3. JAVA TYPE CASTING (ÉP KIỂU TRONG JAVA)](#3-java-type-casting-ép-kiểu-trong-java)
- [4. HẰNG SỐ TRONG JAVA](#4-hằng-số-trong-java)
- [5. TOÁN TỬ (OPERATOR) TRONG JAVA](#5-toán-tử-operator-trong-java)
  - [5.1. Định nghĩa](#51-định-nghĩa)
  - [5.2. Các loại toán tử trong Java](#52-các-loại-toán-tử-trong-java)
    - [5.2.1. Toán tử số học (Arithmetic Operator):](#521-toán-tử-số-học-arithmetic-operator)
    - [5.2.2. Toán tử gán (Assignment Operator):](#522-toán-tử-gán-assignment-operator)
    - [5.2.3. Toán tử so sánh (Comparison operators):](#523-toán-tử-so-sánh-comparison-operators)
    - [5.2.4. Toán Tử Logic Trong Java (Logical Operators):](#524-toán-tử-logic-trong-java-logical-operators)
    - [5.2.5. Toán tử bit trong Java (Bitwise Operators):](#525-toán-tử-bit-trong-java-bitwise-operators)
- [6. CÂU LỆNH ĐIỀU KIỆN (CONDITIONALS)](#6-câu-lệnh-điều-kiện-conditionals)
  - [6.1. ĐANG THỰC HIỆN](#61-đang-thực-hiện)

---

# 1. CẤU TRÚC CHƯƠNG TRÌNH JAVA

## 1.1. CẤU TRÚC CƠ BẢN CỦA JAVA

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


## 1.2 PHƯƠNG THỨC NON-STATIC
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

# 2. KIỂU DỮ LIỆU TRONG JAVA

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

3. **Java Identifiers  🚀**

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

## 2.1. Sự khác biệt giữa Static và Non-Static trong Java

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


## 2.2. Sự khác biệt giữa việc khai báo biến trong main và ngoài main (ở cấp lớp)

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


## 2.3. Khi nào sử dụng biến trong main hoặc ngoài main?
- **Biến trong main (local variables):**
    - Khi giá trị biến chỉ cần được sử dụng bên trong phương thức main.
    - Không cần lưu trữ giá trị biến lâu dài.
    - Sử dụng để thực hiện các tính toán hoặc xử lý tạm thời.
- **Biến ngoài main (instance hoặc static variables):**
    - Khi cần lưu trữ trạng thái hoặc thông tin của đối tượng.
    - Khi cần chia sẻ giá trị giữa nhiều phương thức hoặc nhiều đối tượng trong chương trình.
    - Static variables phù hợp khi giá trị biến là chung cho tất cả đối tượng.

---

# 3. JAVA TYPE CASTING (ÉP KIỂU TRONG JAVA)

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

# 4. HẰNG SỐ TRONG JAVA

- **ĐỊNH NGHĨA:**
    Hằng số trong Java là một giá trị cố định mà không thể thay đổi trong suốt vòng đời của chương trình. Nó được khai báo bằng từ khóa `final`. Hằng số giúp đảm bảo tính bất biến của dữ liệu và làm cho mã nguồn dễ đọc hơn.

- **ĐẶC ĐIỂM CỦA HẰNG SỐ:**
    - Cố định giá trị: Một khi đã gán giá trị, hằng số không thể thay đổi.
    - Khai báo bằng final: Sử dụng từ khóa final để khai báo.
    - Thường là biến tĩnh (static): Hằng số thường được khai báo là static final để dùng chung cho toàn bộ lớp.
    - Tăng tính rõ ràng: Hằng số giúp mã nguồn dễ hiểu hơn vì nó thể hiện các giá trị có ý nghĩa cụ thể.

- **CÁCH KHAI BÁO HẰNG SỐ**
    - Cú pháp:

        ```java
        final <kiểu dữ liệu> TÊN_HẰNG = giá trị;
        ```

    - final: Để chỉ định rằng giá trị không thể thay đổi.

    - static final: Để biến hằng số thuộc về lớp thay vì thuộc về một đối tượng cụ thể.

    - Tên hằng: Thường được viết bằng chữ in hoa và các từ được ngăn cách bằng dấu gạch dưới (`_`).

- Ví dụ minh hoạ:
    - Ví dụ 1:
        ```java
        public class HangSo {
            public static void main(String[] args) {
                final double PI = 3.14159;
                System.out.println("Giá trị của PI: " + PI);

                // PI = 3.14; // Lỗi: Không thể thay đổi giá trị của hằng số
            }
        }
        ```
    
    - Ví dụ 2:
        ```java
        public class EnumExample {
            enum Mua { XUAN, HA, THU, DONG }

            public static void main(String[] args) {
                Mua muaHienTai = Mua.XUAN;

                switch (muaHienTai) {
                    case XUAN:
                        System.out.println("Mùa xuân!");
                        break;
                    case HA:
                        System.out.println("Mùa hè!");
                        break;
                    case THU:
                        System.out.println("Mùa thu!");
                        break;
                    case DONG:
                        System.out.println("Mùa đông!");
                        break;
                }
            }
        }
        ```


- Sơ đồ minh hoạ:

```sql
+---------------+       +-----------------+
|    final PI   | ----> | Giá trị cố định |
+---------------+       +-----------------+

+-------------------+
| static final PI   | -------> Dùng chung cho toàn bộ lớp
+-------------------+
```

---

# 5. TOÁN TỬ (OPERATOR) TRONG JAVA

## 5.1. Định nghĩa

- **Toán tử (Operator)** trong Java là các ký hiệu được sử dụng để thực hiện các phép toán trên các **toán hạng (operands)**. Các toán tử được dùng để xử lý dữ liệu và điều khiển luồng thực thi trong chương trình.

## 5.2. Các loại toán tử trong Java

- Java hỗ trợ nhiều loại toán tử, có thể phân loại như sau:

| Loại Toán Tử                 | Mô Tả                                                                  |
|------------------------------|------------------------------------------------------------------------|
| Toán tử số học (Arithmetic)  | Thực hiện các phép toán cơ bản: cộng, trừ, nhân, chia, lấy phần dư.    |
| Toán tử gán (Assignment)     | Dùng để gán giá trị cho biến.                                          |
| Toán tử so sánh (Relational) | So sánh hai toán hạng, trả về kết quả kiểu boolean.                    |
| Toán tử logic (Logical)      | Thực hiện các phép toán logic như AND, OR, NOT.                        |
| Toán tử tăng/giảm (Unary)    | Tăng hoặc giảm giá trị của biến.                                       |
| Toán tử điều kiện (Ternary)  | Toán tử ba ngôi (`?:`), sử dụng như một câu lệnh điều kiện.              |
| Toán tử bit (Bitwise)        | Thực hiện các phép toán trên bit.                                      |
| Toán tử dịch chuyển (Shift)  | Dịch chuyển các bit sang trái hoặc phải.                               |
| Toán tử instanceof           | Kiểm tra một đối tượng có phải là thể hiện của một lớp hoặc interface. |

### 5.2.1. Toán tử số học (Arithmetic Operator):

- **1. Định nghĩa:**
    - Toán tử số học trong Java là các toán tử được sử dụng để thực hiện các phép toán cơ bản như cộng, trừ, nhân, chia, và lấy phần dư trên các giá trị số. Các toán tử này hoạt động trên các kiểu dữ liệu số nguyên (int, long, short, byte) và số thực (float, double).

- **2. Đặc Điểm Của Toán Tử Số Học:**
    - Hỗ trợ trên các kiểu số nguyên và số thực:
        - Có thể áp dụng trên cả số nguyên (int, long) và số thực (float, double).
        - Kết quả trả về phụ thuộc vào kiểu dữ liệu lớn hơn trong các toán hạng.
    - Hoạt động từ trái sang phải:
        - Các toán tử số học được thực thi theo thứ tự từ trái sang phải, ngoại trừ trong trường hợp có ngoặc đơn.
    - Cần đảm bảo kiểu dữ liệu đồng nhất:
        - Khi các toán hạng có kiểu khác nhau, Java tự động chuyển đổi lên kiểu dữ liệu lớn hơn để tránh mất dữ liệu.
    - Hỗ trợ kết hợp với toán tử gán:
        - Có thể kết hợp với toán tử gán để rút gọn mã, ví dụ: a += b tương đương với a = a + b.

- **3. Danh Sách Toán Tử Số Học:**

| Toán Tử | Ý Nghĩa     | Ví Dụ | Kết Quả       |
|---------|-------------|-------|---------------|
| +       | Cộng        | 5 + 3 | 8             |
| -       | Trừ         | 5 - 3 | 2             |
| *       | Nhân        | 5 * 3 | 15            |
| /       | Chia        | 5 / 3 | 1 (số nguyên) |
| %       | Lấy phần dư | 5 % 3 | 2             |

- **4. Lưu Ý Khi Sử Dụng Toán Tử Số Học:**
    - 4.1. Cú pháp chính xác:
        - Các biểu thức toán học phải được viết rõ ràng, đúng cú pháp. Sử dụng ngoặc đơn để ưu tiên phép tính khi cần.
    
    - 4.2. Thứ tự thực hiện phép toán
        - Theo quy tắc BODMAS (Brackets, Orders, Division/Multiplication, Addition/Subtraction):
            - Ngoặc đơn.
            - Lũy thừa hoặc phép toán cấp cao hơn.
            - Nhân, chia, và phần dư.
            - Cộng và trừ.

    - 4.3. Độ ưu tiên của toán tử:
        - Các toán tử số học có độ ưu tiên cao hơn các toán tử gán (=) và logic (&&, ||).
        - Ưu tiên từ trên xuống:
            - Nhân (*), chia (/), phần dư (%).
            - Cộng (+), trừ (-).

    - 4.4. Kiểu dữ liệu trả về:
        - Khi sử dụng hai toán hạng khác kiểu, kiểu trả về sẽ là kiểu lớn hơn.

    - 4.5. Chia cho 0:
        - Với số nguyên (int), việc chia cho 0 sẽ gây lỗi ArithmeticException.
        - Với số thực (float, double), phép chia cho 0 không lỗi nhưng trả về Infinity hoặc NaN (Not a Number).

### 5.2.2. Toán tử gán (Assignment Operator):

- **1. Định nghĩa:**
    - Toán tử gán trong Java được sử dụng để gán giá trị cho biến. Toán tử này có thể đơn thuần gán một giá trị cụ thể hoặc thực hiện một phép toán kèm gán giá trị.

- **2. Đặc Điểm Của Toán Tử Gán:**
    - Dễ sử dụng và phổ biến:
        - Toán tử gán là một trong những toán tử cơ bản và thường xuyên được sử dụng trong lập trình.
    - Gán giá trị từ phải sang trái:
        - Phép gán bắt đầu từ giá trị bên phải toán tử, sau đó gán vào biến ở bên trái.
    - Hỗ trợ gán kết hợp:
        - Java cho phép kết hợp toán tử gán với các toán tử số học để viết mã gọn hơn.
    - Hỗ trợ gán nhiều biến trong cùng một biểu thức:
        - Java cho phép gán nhiều biến cùng lúc.

- **3. Danh Sách Toán Tử Gán:**

| Toán Tử | Ý Nghĩa          | Ví Dụ           | Kết Quả                  |
|---------|------------------|-----------------|--------------------------|
| =       | Gán giá trị      | a = b           | Gán giá trị của b cho a. |
| +=      | Gán cộng         | a += b          | a = a + b.               |
| -=      | Gán trừ          | a -= b          | a = a - b.               |
| *=      | Gán nhân         | a *= b          | a = a * b.               |
| /=      | Gán chia         | a /= b          | a = a / b.               |
| %=      | Gán phần dư      | a %= b          | a = a % b.               |
| &=      | Gán AND trên bit | a &= b          | a = a & b.               |
| `       | =`               | Gán OR trên bit | `a                       |
| ^=      | Gán XOR trên bit | a ^= b          | a = a ^ b.               |
| <<=     | Gán dịch trái    | a <<= b         | a = a << b.              |
| >>=     | Gán dịch phải    | a >>= b         | a = a >> b.              |

### 5.2.3. Toán tử so sánh (Comparison operators):

- **1. Định nghĩa:**
    - Toán tử so sánh trong Java được sử dụng để so sánh hai giá trị hoặc biểu thức và trả về kết quả kiểu **boolean** (`true` hoặc `false`). Chúng thường được dùng trong các câu lệnh điều kiện (`if`, `while`) để kiểm tra mối quan hệ giữa các giá trị.

- **2. Đặc Điểm Của Toán Tử So Sánh:**
    - Trả về kết quả kiểu boolean:
        - Kết quả của các phép so sánh luôn là true hoặc false
    - Hỗ trợ so sánh kiểu số và chuỗi:
        - Các toán tử này chủ yếu được sử dụng để so sánh các kiểu dữ liệu nguyên thủy như `int`, `float`, `double`, `char`, nhưng cũng có thể so sánh đối tượng với toán tử `==` hoặc `!=.`
        - So sánh chuỗi cần dùng phương thức `.equals()`, không dùng toán tử `==`
    - Thứ tự thực hiện:
        - Toán tử so sánh có độ ưu tiên cao hơn các toán tử logic (`&&`, `||`) và thấp hơn các toán tử số học (`+`, `-`).
    - Không thể so sánh kiểu không tương thích:
        - Java không cho phép so sánh giữa các kiểu không liên quan (ví dụ: `int` và `String`).

- **3. Các Toán Tử So Sánh Cụ Thể:**

| Toán Tử | Ý Nghĩa           | Ví Dụ    | Kết Quả |
|---------|-------------------|----------|---------|
| ==      | Bằng nhau         | 5 == 5   | true    |
| !=      | Khác nhau         | 5 != 3   | true    |
| >       | Lớn hơn           | 10 > 5   | true    |
| <       | Nhỏ hơn           | 5 < 10   | true    |
| >=      | Lớn hơn hoặc bằng | 10 >= 10 | true    |
| <=      | Nhỏ hơn hoặc bằng | 5 <= 10  | true    |

### 5.2.4. Toán Tử Logic Trong Java (Logical Operators):
- **1. Định Nghĩa:**
    - Toán tử `logic` trong `Java` được sử dụng để thực hiện các phép toán `logic` trên các biểu thức `boolean`, thường được dùng để kết hợp nhiều điều kiện trong các câu lệnh điều kiện (`if`, `while`, `for`). Các toán tử logic luôn trả về kết quả kiểu boolean (`true` hoặc `false`).

- **2. Đặc Điểm Của Toán Tử Logic:**
    - **Hoạt động trên biểu thức boolean:**
        - Các toán tử logic chỉ hoạt động trên các giá trị hoặc biểu thức kiểu boolean.
    - **Kết hợp điều kiện:**
        - Toán tử logic thường được sử dụng để kết hợp hoặc đảo ngược các điều kiện, giúp kiểm tra nhiều điều kiện trong một câu lệnh.
    - **Thứ tự thực hiện và độ ưu tiên:**
        - Toán tử logic có độ ưu tiên thấp hơn các toán tử số học và so sánh nhưng cao hơn toán tử gán.
        - Độ ưu tiên từ cao đến thấp:
            - `!` (NOT)
            - `&&` (AND)
            - `||` (OR)
    - **Thực hiện ngắn mạch (Short-circuit evaluation):**
        - Các toán tử `&&` và `||` dừng kiểm tra điều kiện ngay khi kết quả đã xác định:
            - Với `&&,` nếu biểu thức đầu tiên là `false`, kết quả chắc chắn là `false`.
            - Với `||,` nếu biểu thức đầu tiên là `true`, kết quả chắc chắn là `true`.

- **3. Các toán tử Logic cụ thể:**

| **Toán Tử** | **Ý Nghĩa**    | **Mô Tả**                                                              |
|-------------|----------------|------------------------------------------------------------------------|
| `&&`          | AND (Và)       | Trả về `true` nếu cả hai biểu thức đều đúng.                             |
| `OR`          | OR (hoặc)       | Trả về `true` nếu một trong 2 biểu thức đúng.                             |
| `!`          | NOT (Phủ định)       | Đảo ngược giá trị `logic` của biểu thức (`true` thành `false` và ngược lại).                             |


- **4. Ví dụ thực tế:**

```java
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        // Toán tử AND (&&)
        System.out.println((a > b) && (c > a)); // true (cả hai điều kiện đúng)
        System.out.println((a < b) && (c > a)); // false (một điều kiện sai)

        // Toán tử OR (||)
        System.out.println((a > b) || (c < a)); // true (một điều kiện đúng)
        System.out.println((a < b) || (c < a)); // false (cả hai điều kiện sai)

        // Toán tử NOT (!)
        boolean isValid = false;
        System.out.println(!isValid); // true (đảo ngược giá trị)

        // Thực hiện ngắn mạch
        System.out.println((a > b) || (++b > 5)); // true (b không bị tăng)
        System.out.println("Giá trị của b: " + b); // Kết quả: b = 5

        System.out.println((a < b) && (++b > 5)); // false (b không bị tăng)
        System.out.println("Giá trị của b: " + b); // Kết quả: b = 5
    }
}
```

### 5.2.5. Toán tử bit trong Java (Bitwise Operators):

- **1. Định Nghĩa:**
Toán tử bit trong Java là các toán tử được sử dụng để thao tác trực tiếp trên các bit của số nguyên. Chúng thực hiện các phép toán nhị phân trên biểu diễn bit của số nguyên (int, long, short, byte, char).

- **2. Đặc Điểm Của Toán Tử Bit:**
    - **Hoạt động trên kiểu số nguyên:**
        - Toán tử bit chỉ áp dụng cho các kiểu dữ liệu nguyên (int, long, short, byte, char).
        - Không thể sử dụng toán tử bit với kiểu số thực (float, double) hoặc kiểu tham chiếu (String, Object).
    - **Thao tác ở cấp độ bit:**
        - Toán tử bit thực hiện các phép toán logic trực tiếp trên biểu diễn nhị phân của số.
    - **Nhanh và hiệu quả:**
        - Thao tác bit nhanh hơn so với các phép toán thông thường và được sử dụng nhiều trong lập trình hệ thống hoặc xử lý bit.
    - **Không thay đổi giá trị ban đầu:**
        - Toán tử bit không làm thay đổi giá trị của toán hạng trừ khi được gán lại.

- **3. Danh Sách Toán Tử Bit Cụ Thể:**

| **Toán Tử** | **Tên**          | **Ý Nghĩa**                                  | **Ví Dụ**                       | **Kết Quả**                |
|-------------|------------------|----------------------------------------------|---------------------------------|----------------------------|
| **&**       | AND trên bit     | Thực hiện phép AND giữa các bit.             | 5 & 3                           | 1 (00000101 & 00000011)    |
| **`**       | `                | OR trên bit                                  | Thực hiện phép OR giữa các bit. | `5                         |
| **^**       | XOR trên bit     | Thực hiện phép XOR giữa các bit.             | 5 ^ 3                           | 6 (00000101 ^ 00000011)    |
| **~**       | NOT trên bit     | Đảo ngược các bit (lấy bù 1).                | ~5                              | -6 (bù 1 của 00000101)     |
| **<<**      | Dịch trái        | Dịch các bit sang trái, chèn 0 vào bên phải. | 5 << 1                          | 10 (00000101 << 1)         |
| **>>**      | Dịch phải số học | Dịch các bit sang phải, giữ nguyên bit dấu.  | -5 >> 1                         | -3 (11111011 >> 1)         |
| **>>>**     | Dịch phải logic  | Dịch các bit sang phải, chèn 0 vào bên trái. | -5 >>> 1                        | Một số dương (xóa bit dấu) |

- **4. Ví tụ thực tế:**

```java
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 00000101
        int b = 3;  // 00000011

        // AND trên bit
        System.out.println("a & b = " + (a & b)); // Kết quả: 1 (00000001)

        // OR trên bit
        System.out.println("a | b = " + (a | b)); // Kết quả: 7 (00000111)

        // XOR trên bit
        System.out.println("a ^ b = " + (a ^ b)); // Kết quả: 6 (00000110)

        // NOT trên bit
        System.out.println("~a = " + (~a)); // Kết quả: -6 (bù 1: 11111010)

        // Dịch trái
        System.out.println("a << 1 = " + (a << 1)); // Kết quả: 10 (00001010)

        // Dịch phải số học
        System.out.println("a >> 1 = " + (a >> 1)); // Kết quả: 2 (00000010)

        // Dịch phải logic
        int c = -5; // 11111111111111111111111111111011
        System.out.println("c >>> 1 = " + (c >>> 1)); // Một số dương lớn
    }
}
```

---

# 6. CÂU LỆNH ĐIỀU KIỆN (CONDITIONALS)

## 6.1. ĐANG THỰC HIỆN

- **In Process... *Loading*... 🔃**

<!-- Button to TOP CSS -->
<style>
.scroll-to-top {
  display: flex;
  align-items: center;
  justify-content: center;
  position: fixed;
  bottom: 20px;
  right: 20px;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 50%;
  width: 50px;
  height: 50px;
  font-size: 18px;
  box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
  z-index: 1000;
  transition: .25s;
}

.scroll-to-top:hover {
  color: #007bff;
  background-color: #fff;
}
</style>

<!-- Nút Scroll to Top -->
<a href="#mục-lục" class="scroll-to-top">⬆</a>

---
© 2024 huynhkhuanit. All rights reserved.  
For more information, visit [Github | huynhkhuanit](https://github.com/huynhkhuanit).
