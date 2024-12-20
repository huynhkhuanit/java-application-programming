# Lộ Trình Học Java - Từ Cơ Bản Đến Nâng Cao

## Mục Tiêu
- Học từ cơ bản đến nâng cao để xây dựng các ứng dụng Console, GUI và ứng dụng với cơ sở dữ liệu.
- Phát triển kỹ năng thực hành và tư duy lập trình hướng đối tượng (OOP).

---

## Giai Đoạn 1: Khởi Đầu Với Java Cơ Bản (4-6 Tuần)

### 1.1 Làm Quen Với Java
#### Mục tiêu
- Hiểu môi trường phát triển và viết chương trình Java đầu tiên.
#### Nội dung học
- Cài đặt **JDK** và **IDE** (VS Code hoặc IntelliJ IDEA).
- Viết chương trình "Hello World".
- Tìm hiểu cấu trúc cơ bản: `class`, `method`, `main method`.

![Java Hello World](https://upload.wikimedia.org/wikipedia/commons/6/61/Java_Programming_Language.png)

#### Thực hành
- Viết chương trình đầu tiên in ra "Hello, Java!".

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

---

### 1.2 Hiểu Cú Pháp và Cấu Trúc Java
#### Mục tiêu
- Nắm vững các khái niệm cơ bản về cú pháp Java.
#### Nội dung học
- **Các kiểu dữ liệu**: `int`, `double`, `boolean`, `char`, `String`.
- **Biến và hằng số**.
- **Toán tử**: số học, so sánh, logic.
- **Câu lệnh điều kiện**: `if-else`, `switch`.
- **Câu lệnh vòng lặp**: `for`, `while`, `do-while`.

#### Thực hành
- Tính tổng, hiệu, tích, thương của hai số.
- Kiểm tra số nguyên tố, số chẵn/lẻ.
- In bảng cửu chương.

```java
for (int i = 1; i <= 9; i++) {
    System.out.println("Bảng cửu chương: " + i);
    for (int j = 1; j <= 9; j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
    }
}
```

---

### 1.3 Làm Việc Với Phương Thức
#### Mục tiêu
- Hiểu và sử dụng phương thức trong Java.
#### Nội dung học
- Cách khai báo và gọi phương thức.
- Các kiểu trả về: `void`, `int`, `String`.
- Tham trị và tham chiếu trong phương thức.

#### Thực hành
- Viết phương thức tính giai thừa của một số.
- Viết phương thức kiểm tra số hoàn hảo.

```java
public static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

---

### 1.4 Làm Việc Với Mảng
#### Mục tiêu
- Hiểu và thao tác với mảng.
#### Nội dung học
- Mảng 1 chiều và mảng 2 chiều.
- Mảng động: `ArrayList`.
#### Thực hành
- Viết chương trình sắp xếp mảng (bubble sort).
- Tìm giá trị lớn nhất/nhỏ nhất trong mảng.

```java
int[] arr = {4, 2, 9, 1};
Arrays.sort(arr);
System.out.println("Sắp xếp mảng: " + Arrays.toString(arr));
```

---

## Giai Đoạn 2: Lập Trình Hướng Đối Tượng OOP (6-8 Tuần)

### 2.1 Hiểu Cơ Bản Về OOP
#### Mục tiêu
- Hiểu các khái niệm cơ bản của lập trình hướng đối tượng.
#### Nội dung học
- Lớp (Class) và đối tượng (Object).
- Thuộc tính (Attribute) và phương thức (Method).
- Constructor.
#### Thực hành
- Xây dựng lớp `SinhVien` với các thuộc tính: tên, tuổi, điểm.

```java
class SinhVien {
    private String ten;
    private int tuoi;

    public SinhVien(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void hienThi() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi);
    }
}
```

---

### 2.2 Các Nguyên Lý OOP
#### Mục tiêu
- Áp dụng các nguyên lý OOP: **Encapsulation**, **Inheritance**, **Polymorphism**, **Abstraction**.
#### Nội dung học
- Đóng gói: sử dụng `private`, `getter`, `setter`.
- Kế thừa: lớp cha và lớp con.
- Đa hình: overloading, overriding.

#### Thực hành
- Xây dựng lớp `NhanVien` kế thừa thành `NhanVienHanhChinh`, `NhanVienSanXuat`.

```java
class NhanVien {
    public void lamViec() {
        System.out.println("Làm việc chung");
    }
}

class NhanVienSanXuat extends NhanVien {
    @Override
    public void lamViec() {
        System.out.println("Sản xuất sản phẩm");
    }
}
```

---

## Giai Đoạn 3: Xây Dựng Ứng Dụng Console (4-6 Tuần)

### 3.1 Ứng Dụng Quản Lý Sinh Viên
#### Nội dung thực hiện
- Thêm, sửa, xóa, tìm kiếm, hiển thị danh sách sinh viên.
- Xử lý ngoại lệ và kiểm tra nhập liệu hợp lệ.

---

## Giai Đoạn 4: GUI Cơ Bản Với JavaFX (4-8 Tuần)

### 4.1 Làm Quen Với JavaFX
#### Mục tiêu
- Hiểu cách xây dựng giao diện đồ họa.
#### Nội dung học
- **Layout**: VBox, HBox, GridPane.
- Các thành phần giao diện: Button, TextField, TableView.
- Xử lý sự kiện (Event Handling).

---

## Giai Đoạn 5: Kết Nối Cơ Sở Dữ Liệu (4-8 Tuần)

### 5.1 Làm Quen Với JDBC
#### Mục tiêu
- Kết nối Java với cơ sở dữ liệu SQL.
#### Nội dung học
- Thực hiện các thao tác CRUD (Create, Read, Update, Delete).

#### Thực hành
- Xây dựng ứng dụng quản lý sinh viên kết hợp giao diện GUI và cơ sở dữ liệu.

---

## Giai Đoạn 6: Nâng Cao (6-12 Tuần)

### 6.1 Xử Lý Đa Luồng và Tối Ưu Hóa
#### Nội dung học
- Làm việc với Threads, ExecutorService.
- Tối ưu hóa hiệu suất ứng dụng.

---

## Kế Hoạch Cụ Thể Hàng Tuần
- **Tuần 1-2**: Java cơ bản.
- **Tuần 3-4**: Phương thức và mảng.
- **Tuần 5-8**: Lập trình OOP.
- **Tuần 9-12**: Ứng dụng Console.
- **Tuần 13-16**: GUI với JavaFX.
- **Tuần 17-20**: JDBC và ứng dụng nâng cao.

![Learning Roadmap](https://via.placeholder.com/600x300.png?text=Java+Learning+Roadmap)
