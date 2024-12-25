<p class="header" align="center">
  <img src="./assets/img/java.png" alt="Description" width="150"/>
</p>

<style>
html {
  font-size: 62.5%;
  scroll-behavior: smooth;
}

body {
  font-family: system-ui, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
}
</style>

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

3. S**ự khác biệt giữa Pass by Value và Pass by Reference**

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

5. Ví dụ thực tế về việc truyền tham số trong phương thức

Hoán đổi giá trị trong Java (sử dụng mảng)

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

Hoán đổi giá trị trong Java (sử dụng đối tượng)

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

> [!NOTE]
> 123


> [!TIP]
> 123