<p class="header" align="center">
  <img src="./assets/img/java.png" alt="Description" width="150"/>
</p>

<style>
.notice {
  padding: 15px;
  border-left: 6px solid;
  margin-bottom: 20px;
  border-radius: 4px;
}

.notice.note {
  background-color: transparent;
  border-color: #2196f3;
  color: #0b75c9;
}

.notice.tip {
  background-color: transparent;
  border-color: #4caf50;
  color: #2e7d32;
}

.notice.important {
  background-color: transparent;
  border-color: #9c27b0;
  color: #6a1b9a;
}

.notice.warning {
  background-color: transparent;
  border-color: #ffc107;
  color: #ff8f00;
}

.notice.caution {
  background-color: transparent;
  border-color: #f44336;
  color: #c62828;
}

.bold {
  font-weight: bold;
}

.large {
  font-size: 2.4rem;
}
  
html {
  font-size: 62.5%;
  scroll-behavior: smooth;
}

body {
  font-family: system-ui, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
}
</style>

---
# MỤC LỤC
- [CHƯƠNG 2 - MẢNG (ARRAYS) TRONG JAVVA VÀ PHƯƠNG THỨC (METHODS) TRONG JAVA](#chương-2---mảng-arrays-trong-javva-và-phương-thức-methods-trong-java)
  - [1. PHƯƠNG THỨC TRONG JAVA](#1-phương-thức-trong-java)
    - [1.1. Cách khai báo và gọi phương thức](#11-cách-khai-báo-và-gọi-phương-thức)
    - [1.2. Tham số trong phương thức](#12-tham-số-trong-phương-thức)
  - [2. Các ví dụ về phương thức trong Java từ cơ bản đến nâng cao](#2-các-ví-dụ-về-phương-thức-trong-java-từ-cơ-bản-đến-nâng-cao)
  - [3. Mảng (Array) trong Java](#3-mảng-array-trong-java)
    - [3.1. Định nghĩa mảng trong Java](#31-định-nghĩa-mảng-trong-java)
    - [3.2. Mảng 1 chiều (1D Arrays)](#32-mảng-1-chiều-1d-arrays)
    - [3.3. Mảng 2 chiều (2D Arrays)](#33-mảng-2-chiều-2d-arrays)
    - [3.4. Mảng động trong Java](#34-mảng-động-trong-java)
    - [3.5. Các thao tác cơ bản với mảng](#35-các-thao-tác-cơ-bản-với-mảng)
  - [4. ArrayList trong Java](#4-arraylist-trong-java)
  - [🎉 **Hoàn Thành Chương 2!**](#-hoàn-thành-chương-2)
  - [📌 **Những Điểm Mấu Chốt Cần Nhớ**](#-những-điểm-mấu-chốt-cần-nhớ)
  - [🚀 **Bước Tiếp Theo**](#-bước-tiếp-theo)
  - [📚 **Tài Nguyên Bổ Sung**](#-tài-nguyên-bổ-sung)
  - [🎨 **Chia Sẻ Hành Trình Của Bạn**](#-chia-sẻ-hành-trình-của-bạn)
  - [👏 **Chúc Mừng và Tiếp Tục Cố Gắng!**](#-chúc-mừng-và-tiếp-tục-cố-gắng)

---

# CHƯƠNG 2 - MẢNG (ARRAYS) TRONG JAVVA VÀ PHƯƠNG THỨC (METHODS) TRONG JAVA

## 1. PHƯƠNG THỨC TRONG JAVA

### 1.1. Cách khai báo và gọi phương thức

**1. Định Nghĩa Về Phương Thức**
Phương thức (method) trong Java là tập hợp các câu lệnh được nhóm lại để thực hiện một nhiệm vụ cụ thể. Phương thức giúp chia nhỏ một chương trình lớn thành các phân đoạn nhỏ dễ quản lý và tái sử dụng.

- Phương thức trong Java được khai báo trong các lớp (class).
- Mỗi phương thức có thể nhận tham số (parameters) và có thể trả về một giá trị.

**Cú pháp khai báo phương thức:**

```java
<access_modifier> <return_type> <method_name>(<parameters>) {
    // Thân phương thức
}
```

- `access_modifier`: Quyền truy cập (vd: `public`, `private`, `protected`).
- `return_type`: Kiểu dữ liệu trả về (vd: `void`, `int`, `String`).
- `method_name`: Tên phương thức.
- `parameters`: Danh sách tham số (để trống nếu không có tham số).

**Ví dụ:**

```java
public class Example {
    // Phương thức không trả về
    public void greet() {
        System.out.println("Hello, World!");
    }

    // Phương thức trả về giá trị int
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.greet(); // Gọi phương thức greet
        System.out.println("Sum: " + example.add(5, 3));
    }
}
```

---

**2. Các Loại Phương Thức Trong Java**

1. **Phương Thức Không Trả Về (`void`)**:
   - Thực hiện nhiều tác vục như in dữ liệu.

   **Ví dụ:**
   ```java
   public void printMessage() {
       System.out.println("This is a message.");
   }
   ```

2. **Phương Thức Trả Về Giá Trị**:
   - Két quả của phương thức được trả về bằng từ khoá `return`.

   **Ví dụ:**
   ```java
   public int multiply(int a, int b) {
       return a * b;
   }
   ```

3. **Phương Thức Tĩnh (`static`)**:
   - Thuộc về lớp, có thể gọi trực tiếp mà không cần khởi tạo đối tượng.

   **Ví dụ:**
   ```java
   public static void displayMessage() {
       System.out.println("Static Method");
   }
   ```

4. **Phương Thức Non-Static**:
   - Gắn vào mỗi đối tượng riêng lẻ.

   **Ví dụ:**
   ```java
   public void showInstanceMessage() {
       System.out.println("Instance Method");
   }
   ```

5. **Phương Thức Constructor**:
   - Được sử dụng để khởi tạo đối tượng.

   **Ví dụ:**
   ```java
   public Example(String name) {
       this.name = name;
   }
   ```

---

**3. Cách Khai Báo Phương Thức**

**Khai Báo Phương Thức Không Tham Số**
```java
public void printGreeting() {
    System.out.println("Hello!");
}
```

**Khai Báo Phương Thức Có Tham Số**
```java
public int square(int number) {
    return number * number;
}
```

**Khai Báo Phương Thức Tĩnh**
```java
public static void printInfo() {
    System.out.println("Static Method Example");
}
```

**Khai Báo Phương Thức Non-Static**
```java
public void printDetails(String name, int age) {
    System.out.println("Name: " + name + ", Age: " + age);
}
```

---

**4. Cách Gọi Phương Thức**

1. **Gọi Phương Thức Tĩnh**
   - Sử dụng tên lớp.
   ```java
   Example.displayMessage();
   ```

2. **Gọi Phương Thức Non-Static**
   - Cần khởi tạo đối tượng.
   ```java
   Example example = new Example();
   example.showInstanceMessage();
   ```

3. **Gọi Phương Thức Constructor**
   - Được gọi tự động khi tạo đối tượng.
   ```java
   Example example = new Example("John");
   ```

---

**5. Lưu Ý Khi Sử Dụng Phương Thức**

- **Phạm vi truy cập:**
  - Xác định tốt phạm vi truy cập (để tối ưu hóa bảo mật).
  - Sử dụng `private` cho phương thức nội bộ.

- **Tránh tham số không cần thiết:**
  - Truyền tham số đầy đủ và hợp lý.

- **Tái sử dụng phương thức:**
  - Viết phương thức nhỏ gọn, có thể tái sử dụng.

- **Tránh lắm dẫn:**
  - Tên phương thức phải rõ ràng và miêu tả nhiệm vụ.

---

**6. Mục đích của việc sử dụng phương thức**

- Phương thức (method) là một khối mã được định nghĩa để thực hiện một tác vụ cụ thể. Việc sử dụng phương thức mang lại nhiều lợi ích trong lập trình, đặc biệt là trong các ngôn ngữ hướng đối tượng như Java. Dưới đây là các mục đích chính của việc sử dụng phương thức:

  **1. Tái sử dụng mã (Code Reusability)**
    Phương thức cho phép bạn định nghĩa mã một lần và sử dụng lại nhiều lần trong chương trình, tránh việc viết lặp mã.
    Điều này giúp tiết kiệm thời gian và công sức, đồng thời làm cho chương trình dễ bảo trì hơn.
  - Ví dụ:

    ```java
    public int addNumbers(int a, int b) {
        return a + b;
    }
    // Có thể gọi phương thức này nhiều lần thay vì viết lại mã.
    ```

  **2. Tăng tính tổ chức (Modularity)**
    Phương thức giúp chia chương trình thành các phần nhỏ, dễ quản lý hơn.
    Mỗi phương thức có thể đảm nhận một tác vụ cụ thể, giúp mã nguồn rõ ràng, dễ đọc và dễ hiểu.

  - Ví dụ:
    - Một chương trình lớn có thể được chia thành các phương thức nhỏ như: `inputData()`, `processData()`, `displayResult()`.

  **3. Tăng tính bảo trì (Maintainability)**
    Nếu cần thay đổi logic của một tác vụ, bạn chỉ cần sửa đổi phương thức tương ứng, không cần thay đổi nhiều phần trong mã nguồn.
    Giảm nguy cơ lỗi khi bảo trì mã.

  **4. Hỗ trợ lập trình hướng đối tượng (OOP)**
    Phương thức là một phần quan trọng của lập trình hướng đối tượng.
    Giúp các lớp (class) mô tả hành vi của đối tượng (object) thông qua các phương thức, làm tăng tính tương tác và mô phỏng thực tế.

  **5. Giảm độ phức tạp của mã (Code Simplification)**
    Thay vì viết một đoạn mã dài dòng trong main(), bạn có thể phân chia công việc thành các phương thức riêng lẻ, giúp chương trình dễ hiểu hơn.

    - Ví dụ:

      ```java
      public class Calculator {
          public int add(int a, int b) {
              return a + b;
          }
          public int subtract(int a, int b) {
              return a - b;
          }
      }
      ```

  **6. Dễ dàng gỡ lỗi và kiểm thử (Debugging and Testing)**
    Phương thức giúp cô lập các đoạn mã có thể kiểm tra và gỡ lỗi độc lập, tăng hiệu quả khi xử lý lỗi.
    Việc viết Unit Test trở nên dễ dàng hơn khi kiểm thử từng phương thức riêng lẻ.

  **7. Tăng tính mở rộng (Extensibility)**
    Phương thức hỗ trợ dễ dàng mở rộng chương trình bằng cách thêm các phương thức mới mà không làm ảnh hưởng đến các phần khác.
      - Ví dụ:
        - Thêm một phương thức mới vào lớp `Calculator` để tính nhân hoặc chia mà không cần thay đổi phương thức `add` hoặc `subtract`.


> Lưu ý khi sử dụng phương thức:
  Khai báo tên phương thức rõ ràng để biểu thị chính xác mục đích của nó.
  Đừng viết phương thức quá dài, tốt nhất là mỗi phương thức chỉ nên làm một việc cụ thể.
  Tránh trùng lặp mã: Nếu một đoạn mã lặp lại nhiều lần, hãy cân nhắc đưa nó vào phương thức.
  Tận dụng Overloading: Sử dụng phương thức quá tải (method overloading) để thực hiện nhiều nhiệm vụ tương tự nhưng với tham số khác nhau.
  Sử dụng static hợp lý: Phương thức tĩnh (static) chỉ nên dùng khi hành vi không liên quan đến đối tượng cụ thể.

---

**7. Những lưu ý đối với phương thức**

1. **Đặt tên phương thức rõ ràng và ngắn gọn**

    - Tên phương thức cần biểu thị chính xác mục đích của nó.
    - Sử dụng camelCase khi đặt tên phương thức.
    - Tránh sử dụng các từ viết tắt hoặc tên khó hiểu.

    - Ví dụ:

      ```java
      public void calculateSum();  // Tên tốt, mô tả rõ ràng.
      public void cs();            // Tên xấu, khó hiểu.
      ```
2. **Tham số của phương thức (Parameters)**

    - Cần đặt tên tham số rõ ràng để mô tả chức năng của chúng.
    - Số lượng tham số nên hạn chế, tránh sử dụng quá nhiều tham số (thông thường không quá 4-5 tham số).
    - Nếu cần truyền nhiều tham số, hãy cân nhắc sử dụng Object hoặc Class.

    - Ví dụ:

      ```java
      public void displayInfo(String name, int age, String address);  // Nhiều tham số, dễ gây nhầm lẫn.
      ```

    - Giải pháp:

      ```java
      public class Person {
          String name;
          int age;
          String address;
      }
      public void displayInfo(Person person);  // Truyền đối tượng, rõ ràng hơn.
      ```

3. **Tránh viết phương thức quá dài**

    - Phương thức nên thực hiện một nhiệm vụ duy nhất.
    - Phương thức dài dòng sẽ khó đọc, khó gỡ lỗi và khó kiểm tra.
    - Nếu một phương thức dài hơn 20-30 dòng, hãy cân nhắc chia nhỏ nó thành các phương thức con.

    - Ví dụ xấu:

      ```java
      public void process() {
          // Hàng trăm dòng mã.
      }
      ```

    - Giải pháp:

      ```java
      public void process() {
          validateInput();
          calculateResult();
          displayOutput();
      }
      ```

4. **Tránh lạm dụng phương thức tĩnh (Static Methods)**

    - Phương thức tĩnh không cần đối tượng để gọi, nhưng nó không thể truy cập trực tiếp vào các thành viên không tĩnh (non-static) của lớp.
    - Sử dụng static khi phương thức không phụ thuộc vào trạng thái của đối tượng.

    - Ví dụ:

      ```java
      public static int calculateSum(int a, int b) {
          return a + b;  // Tốt khi không liên quan đến thuộc tính của lớp.
      }
      ```

5. **Overloading và Overriding**

    - Overloading (Quá tải): Phương thức có cùng tên nhưng khác nhau về số lượng hoặc kiểu tham số. Được sử dụng để thực hiện cùng một hành vi với dữ liệu khác nhau.
    - Overriding (Ghi đè): Ghi đè một phương thức của lớp cha trong lớp con để thay đổi hành vi.

    - Lưu ý:

      - Với `Overriding`, phương thức ghi đè phải có:
      - Cùng tên, cùng tham số, cùng kiểu trả về.
      - Không được hạ thấp phạm vi truy cập.
      - Với `Overloading`, các phương thức phải có:
      - Cùng tên nhưng khác tham số (số lượng hoặc kiểu).

      ```java
      // Overloading
      public int calculate(int a, int b) { return a + b; }
      public double calculate(double a, double b) { return a + b; }

      // Overriding
      @Override
      public void display() {
          System.out.println("This is the overridden method.");
      }
      ```

6. **Giá trị trả về (Return Value)**

    - Xác định rõ kiểu dữ liệu trả về (int, String, void, v.v.).
    - Nếu không có giá trị trả về, sử dụng void.
    - Kiểm tra kỹ trường hợp giá trị trả về bị thiếu hoặc không khớp.

    ```java
    public int calculateSum(int a, int b) {
        return a + b;  // Phải đảm bảo trả về giá trị.
    }
    ```

7. **Phạm vi truy cập (Access Modifier)**

    - Quyết định mức độ truy cập vào phương thức:
      - `public`: Phương thức có thể truy cập từ bất kỳ đâu.
      - `protected`: Truy cập từ các lớp cùng gói hoặc lớp con.
      - `default` (không khai báo): Truy cập từ các lớp trong cùng gói.
      - `private`: Chỉ truy cập trong cùng lớp.

---

### 1.2. Tham số trong phương thức

1. **Tham số trong phương thức là gì?**

    - Tham số trong phương thức (Method Parameters) là các biến được khai báo trong dấu ngoặc tròn của định nghĩa phương thức. Tham số cho phép truyền dữ liệu từ bên ngoài vào phương thức để sử dụng trong các thao tác bên trong phương thức.
    
    - Ví dụ:

      ```java
      public class Example {
          public void greet(String name) { // Tham số name
              System.out.println("Hello, " + name + "!");
          }

          public static void main(String[] args) {
              Example example = new Example();
              example.greet("Alice"); // Truyền giá trị "Alice" cho tham số name
          }
      }
      ```
    - Trong ví dụ này, `name` là tham số của phương thức `greet`, cho phép chương trình nhận dữ liệu (tên) khi gọi phương thức.

2. **Có mấy cách truyền phương thức trong Java**

    - Java hỗ trợ hai cách truyền tham số chính:
      - **Truyền tham trị (Pass by Value)**.
      - **Truyền tham chiếu (Pass by Reference - thông qua các tham chiếu đối tượng)**.

    1. **Truyền tham trị (Pass by Value)**
        - Java sử dụng truyền tham trị cho tất cả các tham số.
        - Khi truyền tham số, giá trị của biến được sao chép và truyền vào phương thức. Bất kỳ thay đổi nào đối với tham số bên trong phương thức không ảnh hưởng đến biến gốc bên ngoài.
    
          ```java
          public class PassByValue {
              public void modifyValue(int num) {
                  num = 100; // Thay đổi giá trị tham số
              }

              public static void main(String[] args) {
                  int value = 50;
                  PassByValue example = new PassByValue();
                  example.modifyValue(value);
                  System.out.println("Value after method call: " + value); // Kết quả: 50
              }
          }
          ```

        - Giải thích:
          - Giá trị của `value` được sao chép vào tham số `num`.
          - Thay đổi num trong phương thức không ảnh hưởng đến giá trị của `value`.

      2. **Truyền tham chiếu (Pass by Reference)**

          - `Java` không thực sự hỗ trợ truyền tham chiếu cho các kiểu nguyên thủy.
          - Đối với đối tượng, `Java` truyền tham chiếu đến đối tượng (`reference to object`) vào phương thức. Điều này có nghĩa là nếu bạn thay đổi thuộc tính của đối tượng, thay đổi này sẽ ảnh hưởng đến đối tượng gốc.

          - Ví dụ:

            ```java
            public class PassByReference {
                public void modifyObject(Person person) {
                    person.name = "Updated Name"; // Thay đổi thuộc tính của đối tượng
                }

                public static void main(String[] args) {
                    Person person = new Person("Original Name");
                    PassByReference example = new PassByReference();
                    example.modifyObject(person);
                    System.out.println("Person name after method call: " + person.name); // Kết quả: Updated Name
                }
            }

            class Person {
                String name;
                Person(String name) {
                    this.name = name;
                }
            }
            ```

          - Giải thích:
            - Tham chiếu đến đối tượng person được truyền vào phương thức.
            - Khi thay đổi thuộc tính của đối tượng trong phương thức, thay đổi này được phản ánh trên đối tượng gốc.

3. **Sự khác biệt giữa Pass by Value và Pass by Reference**

| **Đặc điểm**                | **Pass by Value**                                  | **Pass by Reference**                               |
|-----------------------------|----------------------------------------------------|-----------------------------------------------------|
| **Kiểu dữ liệu áp dụng**    | Kiểu nguyên thủy (primitive types).                | Đối tượng (object types).                           |
| **Truyền gì?**              | Giá trị của biến được sao chép.                    | Tham chiếu đến đối tượng trong bộ nhớ.              |
| **Ảnh hưởng đến biến gốc?** | Không, giá trị gốc không thay đổi.                 | Có, thay đổi thuộc tính của đối tượng sẽ ảnh hưởng. |
| **Thay đổi biến?**          | Không thể thay đổi biến gốc bên ngoài phương thức. | Có thể thay đổi trạng thái của đối tượng.           |

4. **Một số lưu ý quan trọng**
    - **Java luôn truyền tham trị (pass by value).**
      - Ngay cả khi làm việc với đối tượng, giá trị tham chiếu của đối tượng được sao chép, không phải chính đối tượng.
    - **Không thể truyền kiểu nguyên thủy bằng tham chiếu.**
      - Nếu muốn thay đổi giá trị của kiểu nguyên thủy bên ngoài phương thức, bạn cần gói chúng trong một đối tượng (wrapper).
    - **Thay đổi giá trị đối tượng.**
      - Thay đổi thuộc tính của đối tượng là hành vi thường gặp khi làm việc với tham chiếu. Tuy nhiên, không thể thay đổi tham chiếu của biến đối tượng bên ngoài phương thức.
    - **Cẩn thận với trạng thái đối tượng.**
      - Khi sử dụng tham chiếu, thay đổi trong một phương thức có thể gây lỗi không mong muốn nếu không kiểm soát trạng thái của đối tượng.

5. **Ví dụ thực tế về việc truyền tham số trong phương thức**

    - **Hoán đổi giá trị trong Java (sử dụng mảng)**

      ```java
      import java.util.Scanner;

      public class Main {
          public static void swap(int[] arr) {
              int tmp = arr[0];
              arr[0] = arr[1];
              arr[1] = tmp;
          }
          
          public static void main(String[] args) {
              int[] values = {3, 5};
              System.out.println("Before swap: a = " + values[0] + ", b = " + values[1]);
              swap(values);
              System.out.println("After swap: a = " + values[0] + ", b = " + values[1]);
          }
      }
      ```

    - **Hoán đổi giá trị trong Java (sử dụng đối tượng)**

      ```java
      import java.util.Scanner;

      class Pair {
          int a, b;
          
          Pair(int a, int b) {
              this.a = a;
              this.b = b;
          }
      }

      public class Main {
          public static void swap(Pair pair) {
              int tmp = pair.a;
              pair.a = pair.b;
              pair.b = tmp;
          }
          
          public static void main(String[] args) {
              Pair pair = new Pair(3, 5);
              System.out.println("Before swap: a = " + pair.a + ", b = " + pair.b);
              swap(pair);
              System.out.println("After swap: a = " + pair.a + ", b = " + pair.b);
          }
      }
      ```

- Đối với ngôn ngữ `Java`, việc truyền các tham số vào trong phương phức luôn là `pass by value`. Cho nên việc thay đổi giá trị trong Java chỉ dược thực hiện thông qua `mảng` hoặc `đối tượng`, hoặc `wrapper class`.
- Đối với phương thức `Constructor` và `Destructor` thì tên phương thức phải trùng với tên lớp (`class`).


<div class="notice note">
  <p class="bold large">💡 Note</p> 
  <ol>
    <li>Các tham số luôn được truyền bằng tham trị (value) trong Java.</li>
    <li>Thay đổi giá trị của biến được truyền bằng 2 cách là sử dụng mảng hoặc đối tượng.</li>
  </ol>
</div>

## 2. Các ví dụ về phương thức trong Java từ cơ bản đến nâng cao

1. Phương thức cơ bản:

```java
public class BasicMethod {
    public static void printMessage() {
        System.out.println("Hello, this is a simple method!");
    }

    public static void main(String[] args) {
        printMessage(); // Gọi phương thức
    }
}
```

2. Phương thức có tham số

```java
public class MethodWithParameters {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
    }
}
```

3. Phương thức trả về giá trị

```java
public class MethodWithReturn {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);
    }
}
```

4. Phương thức đệ quy

```java
public class RecursiveMethod {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial: " + result);
    }
}
```

5. Phương thức Overloading

```java
public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of doubles: " + add(5.5, 10.5));
    }
}
```

6. Phương thức sử dụng biến tĩnh

```java
public class StaticVariableExample {
    static int count = 0;

    public static void increment() {
        count++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        System.out.println("Count: " + count);
    }
}
```
7. Phương thức truyền tham chiếu

```java
class Person {
    String name;
}

public class ReferenceMethod {
    public static void changeName(Person person) {
        person.name = "John Doe";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        System.out.println("Before: " + person.name);
        changeName(person);
        System.out.println("After: " + person.name);
    }
}
```

8. Phương thức sử dụng mảng

```java
public class ArrayMethod {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 10, 5};
        System.out.println("Max value: " + findMax(numbers));
    }
}
```

9. Phương thức sử dụng lambda (Java 8)

```java
import java.util.Arrays;

public class LambdaExample {
    public static void main(String[] args) {
        Arrays.asList("Alice", "Bob", "Charlie")
              .forEach(name -> System.out.println("Hello, " + name));
    }
}
```

10. Phương thức tham chiếu (Method Reference)

```java
import java.util.Arrays;

public class MethodReferenceExample {
    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Arrays.asList("Alice", "Bob", "Charlie")
              .forEach(MethodReferenceExample::printName);
    }
}
```

11. Phương thức với generic

```java
public class GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
```

12. Phương thức với varargs

```java
public class VarargsExample {
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40);
    }
}
```

## 3. Mảng (Array) trong Java

### 3.1. Định nghĩa mảng trong Java

- Mảng (Array) trong Java là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu. Mỗi phần tử trong mảng được xác định bằng chỉ số (index). Mảng có kích thước cố định, được xác định khi khởi tạo.

- Đặc điểm:
  - Lưu trữ các phần tử cùng kiểu dữ liệu (int, float, String, etc.).
  - Kích thước cố định, không thể thay đổi sau khi tạo.
  - Chỉ số của mảng bắt đầu từ 0.

- Khai báo mảng:

  ```java
  int[] arr;        // Khai báo mảng
  arr = new int[5]; // Khởi tạo mảng với kích thước 5
  ```

- Khởi tạo mảng với giá trị ban đầu:

  ```java
  int[] arr = {1, 2, 3, 4, 5}; // Mảng chứa 5 phần tử
  ```

### 3.2. Mảng 1 chiều (1D Arrays)

1. Khái niệm
    - Mảng một chiều là một tập hợp các phần tử được lưu trữ liên tiếp trong bộ nhớ và được truy cập thông qua chỉ số.

2. Cách khai báo

    ```java
    int[] arr = new int[5];         // Mảng gồm 5 phần tử
    int[] arr2 = {10, 20, 30, 40}; // Mảng khởi tạo sẵn
    ```

3. Duyệt 

    ```java
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]); // In từng phần tử của mảng
    }
    ```

### 3.3. Mảng 2 chiều (2D Arrays)

1. Khái niệm
    - Mảng hai chiều là một mảng gồm nhiều mảng một chiều, được biểu diễn dưới dạng bảng với hàng (row) và cột (column).

2. Cách khai báo

    ```java
    int[][] matrix = new int[3][4];          // Mảng 3 hàng và 4 cột
    int[][] matrix2 = { {1, 2}, {3, 4} };     // Mảng 2 hàng, 2 cột
    ```

3. Duyệt mảng 2 chiều

    ```java
    for (int i = 0; i < matrix.length; i++) {          // Duyệt qua các hàng
        for (int j = 0; j < matrix[i].length; j++) {   // Duyệt qua các cột
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    ```

### 3.4. Mảng động trong Java

1. `ArrayList`

    - Đặc điểm:
      - Kích thước có thể thay đổi (thêm/xóa phần tử dễ dàng).
      - Chỉ lưu trữ các đối tượng (wrapper classes nếu cần kiểu dữ liệu nguyên thủy).
      - Khai báo và sử dụng:

        ```java
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);   // Thêm phần tử
        list.add(20);
        list.remove(0); // Xóa phần tử tại chỉ số 0
        System.out.println(list.get(0)); // Truy cập phần tử
        ```

2. `Vector`

    - Đặc điểm:
      - Giống ArrayList nhưng thread-safe (sử dụng trong môi trường đa luồng).
      - Hiệu suất chậm hơn ArrayList do cơ chế đồng bộ hóa.
      - Khai báo và sử dụng:

        ```java
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Programming");
        ```

### 3.5. Các thao tác cơ bản với mảng

1. Thêm phần tử

    - Với mảng cố định, bạn không thể thay đổi kích thước. Để thêm phần tử, bạn cần tạo mảng mới:

      ```java
      int[] arr = {1, 2, 3};
      int[] newArr = new int[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, arr.length);
      newArr[newArr.length - 1] = 4;
      ```
    - Với `ArrayList`:

      ```java
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20); // Thêm phần tử
      ```

2. Xóa phần tử

    - Với `ArrayList`:

      ```java
      list.remove(1); // Xóa phần tử tại chỉ số 1
      ```

3. Sửa phần tử

    ```java
    arr[0] = 100; // Cập nhật giá trị tại chỉ số 0
    list.set(0, 200); // Thay đổi phần tử tại chỉ số 0 trong ArrayList
    ```

4. Tìm kiếm phần tử

    ```java
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            System.out.println("Found at index " + i);
        }
    }
    ```

## 4. ArrayList trong Java

1. **Định nghĩa ArrayList**

    - ArrayList là một lớp trong Java thuộc gói java.util và được sử dụng để lưu trữ danh sách các phần tử. Không giống như mảng tĩnh, 
    - ArrayList có kích thước linh hoạt, nghĩa là bạn có thể thay đổi số lượng phần tử trong quá trình thực thi chương trình.

    - Đặc điểm:

        - Kích thước động: ArrayList tự động điều chỉnh kích thước khi thêm hoặc xóa phần tử.
        - Chỉ lưu trữ các đối tượng: Đối với kiểu dữ liệu nguyên thủy (int, float,...), bạn phải sử dụng lớp bọc (wrapper class) như Integer, Double,...
        - Chỉ số (Index): Các phần tử được lưu trữ với chỉ số bắt đầu từ 0.

    - Khai báo `ArrayList`:

      ```java
      import java.util.ArrayList;
      ArrayList<Type> list = new ArrayList<>();
      ```

2. **Các thao tác cơ bản với ArrayList**

    - 2.1. Khởi tạo
      - Tạo một ArrayList rỗng:

        ```java
        ArrayList<String> list = new ArrayList<>();
        ```

      - Tạo một ArrayList với kích thước ban đầu:

        ```java
        ArrayList<Integer> list = new ArrayList<>(10); // Kích thước ban đầu là 10
        ```

    - 2.2. Thêm phần tử
      - Thêm vào cuối danh sách:

        ```java
        list.add("Java");
        ```

      - Thêm phần tử vào vị trí cụ thể:

        ```java
        list.add(1, "Python"); // Thêm "Python" vào chỉ số 1
        ```

    - 2.3. Truy cập phần tử
      - Truy cập phần tử bằng chỉ số:

        ```java
        String value = list.get(0);
        ```

    - 2.4. Cập nhật phần tử
      - Sửa giá trị của phần tử tại chỉ số:

        ```java
        list.set(0, "C++");
        ```

    - 2.5. Xóa phần tử
      - Xóa phần tử theo chỉ số:

        ```java
        list.remove(0); // Xóa phần tử tại chỉ số 0
        ```

      - Xóa phần tử theo giá trị:

        ```java
        list.remove("Java");
        ```

    -  2.6. Kích thước của ArrayList
        - Lấy kích thước:

          ```java
          int size = list.size();
          ```


    -  2.7. Duyệt qua ArrayList
        - Dùng vòng lặp for:

          ```java
          for (int i = 0; i < list.size(); i++) {
              System.out.println(list.get(i));
          }
          ```

        - Dùng vòng lặp for-each:

          ```java
          for (String item : list) {
              System.out.println(item);
          }
          ```

        - Sử dụng Streams (Java 8+):

          ```java
          list.stream().forEach(System.out::println);
          ```

3. **Nâng Cao**

    - 3.1. So sánh ArrayList với LinkedList

        - Đặc điểm	ArrayList	LinkedList
        - Bộ nhớ	Sử dụng một mảng động.	Sử dụng danh sách liên kết đôi.
        - Truy cập phần tử	Nhanh (O(1)).	Chậm hơn (O(n)).
        - Thêm/xóa ở giữa hoặc đầu	Chậm hơn (phải dời các phần tử).	Nhanh hơn.
        - Ứng dụng	Thích hợp lưu trữ dữ liệu nhỏ, truy cập thường xuyên.	Thích hợp thêm/xóa dữ liệu thường xuyên.

    - 3.2. Sắp xếp ArrayList

        - Sắp xếp tăng dần:

          ```java
          import java.util.Collections;

          Collections.sort(list);
          ```

        - Sắp xếp giảm dần:

          ```java
          Collections.sort(list, Collections.reverseOrder());
          ```

        - Sử dụng comparator tùy chỉnh:

          ```java
          list.sort((a, b) -> a.compareTo(b)); // Sắp xếp tăng dần
          ```

    - 3.3. Tìm kiếm trong ArrayList
        - Tìm kiếm tuyến tính:

          ```java
          boolean exists = list.contains("Java");
          ```

        - Tìm kiếm nhị phân (dùng cho danh sách đã sắp xếp):

          ```java
          int index = Collections.binarySearch(list, "Java");
          ```

    - 3.4. Chuyển đổi ArrayList
        - Chuyển từ ArrayList sang mảng:

          ```java
          String[] arr = list.toArray(new String[0]);
          ```

        - Chuyển từ mảng sang ArrayList:

          ```java
          String[] arr = {"Java", "Python"};
          ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
          ```

    - 3.5. ArrayList trong lập trình đa luồng
        - ArrayList không hỗ trợ thread-safe (an toàn cho đa luồng). Để sử dụng trong môi trường đa luồng, có thể chuyển đổi sang thread-safe:

          ```java
          List<String> syncList = Collections.synchronizedList(new ArrayList<>());
          ```

    - 3.6. ArrayList với Generics
        - ArrayList sử dụng Generics để đảm bảo loại phần tử:

          ```java
          ArrayList<Integer> intList = new ArrayList<>();
          intList.add(10);
          intList.add(20);
          ```

    - 3.7. Hạn chế của ArrayList
        - Không thread-safe: ArrayList không an toàn trong môi trường đa luồng.
        - Hiệu suất thấp với thao tác thêm/xóa ở giữa danh sách: Do phải dời các phần tử khác.
        - Không thể chứa kiểu dữ liệu nguyên thủy: Cần sử dụng các lớp bọc (wrapper class).


4. Các lưu ý khi sử dụng ArrayList

    - Sử dụng đúng loại dữ liệu với Generics:
    - Tránh sử dụng ArrayList mà không chỉ định kiểu:

      ```java
      ArrayList list = new ArrayList(); // Không nên làm
      ```

    - Kiểm tra kích thước trước khi truy cập:

      ```java
      if (!list.isEmpty()) {
          System.out.println(list.get(0));
      }
      ```

    - Tránh thay đổi danh sách khi duyệt:
    - Không nên thêm hoặc xóa phần tử khi đang duyệt qua danh sách (tránh lỗi ConcurrentModificationException).

---

## 🎉 **Hoàn Thành Chương 2!**

Chúc mừng bạn đã hoàn thành **Chương 2** của hành trình học Java. Trong chương này, bạn đã tìm hiểu:

- ✅ **Phương thức**: Khai báo, gọi phương thức, truyền tham số, và hiểu rõ vai trò của phương thức trong tổ chức code.
- ✅ **Mảng**: Mảng 1 chiều, mảng 2 chiều, và mảng động (`ArrayList`, `Vector`) trong Java.
- ✅ **Các thao tác với mảng**: Thêm, sửa, xóa, duyệt, và tối ưu hóa sử dụng mảng.

---

## 📌 **Những Điểm Mấu Chốt Cần Nhớ**

1. **Phương thức**:
   - Phương thức là khối mã được định nghĩa để thực hiện một nhiệm vụ cụ thể.
   - Học cách **khai báo**, **gọi** và **truyền tham số** vào phương thức để tái sử dụng code hiệu quả.

2. **Mảng**:
   - Mảng là cấu trúc dữ liệu cơ bản để lưu trữ các phần tử cùng loại.
   - **Mảng động (`ArrayList`)** cung cấp kích thước linh hoạt và dễ sử dụng hơn so với mảng thông thường.

3. **Các Lưu Ý**:
   - Với mảng, cần chú ý kiểm tra kích thước trước khi thao tác để tránh lỗi **ArrayIndexOutOfBoundsException**.
   - Với `ArrayList`, sử dụng `Generics` để tăng tính an toàn về kiểu dữ liệu.

---

## 🚀 **Bước Tiếp Theo**

Bạn đã sẵn sàng để chuyển sang **Chương 3: Lập Trình Hướng Đối Tượng (OOP)**. Trong chương tiếp theo, bạn sẽ học cách tổ chức code tốt hơn với các khái niệm như lớp, đối tượng, kế thừa, đa hình, và nhiều hơn nữa.

---

## 📚 **Tài Nguyên Bổ Sung**

- 📖 [Java Documentation](https://docs.oracle.com/en/java/)
- 📘 [Java Tutorials on Baeldung](https://www.baeldung.com/java)
- 🎥 [Java Video Tutorials](https://www.youtube.com/results?search_query=java+tutorials)

---

## 🎨 **Chia Sẻ Hành Trình Của Bạn**

💡 Đừng quên chia sẻ những gì bạn học được qua các dự án nhỏ! Đây là cách tuyệt vời để củng cố kiến thức và nhận phản hồi từ cộng đồng.

---

## 👏 **Chúc Mừng và Tiếp Tục Cố Gắng!**

🎊 Bạn đã làm rất tốt trong việc hoàn thành chương này. Tiếp tục giữ vững tinh thần học tập và khám phá những kiến thức mới trong hành trình Java của bạn! 🌟

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