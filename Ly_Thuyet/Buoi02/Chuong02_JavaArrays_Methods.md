<p class="header" align="center">
  <img src="./assets/img/java.png" alt="Description" width="150"/>
</p>

<style>
html {
  font-size: 62.5%;
  scroll-behavior: smooth;
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