package bai01;

import java.util.*;

public class tuyenSinh {

    List<thiSinh> danhSachThiSinh;
    int n;

    Scanner scanner = new Scanner(System.in);

    public tuyenSinh() {
        danhSachThiSinh = new ArrayList<>();
    }

    public void nhapDanhSach() {
        System.out.print("Nhap so luong thi sinh: ");
        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ":");
            System.out.print("So bao danh: ");
            Integer soBaoDanh = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("Dia chi: ");
            String diaChi = scanner.nextLine();

            System.out.print("Uu tien: ");
            String uuTien = scanner.nextLine();

            System.out.print("Nhap loai thi sinh (a / b / c): ");
            String loaiThiSinh = scanner.nextLine().toLowerCase();

            thiSinh tmpTS = null;

            switch (loaiThiSinh) {
                case "a":
                    System.out.print("Diem Toan: ");
                    double toan = scanner.nextDouble();
                    System.out.print("Diem Ly: ");
                    double ly = scanner.nextDouble();
                    System.out.print("Diem Hoa: ");
                    double hoa = scanner.nextDouble();
                    scanner.nextLine();
                    tmpTS = new thiSinhA(soBaoDanh, hoTen, diaChi, uuTien, toan, ly, hoa);
                    break;

                case "b":
                    System.out.print("Diem Toan: ");
                    toan = scanner.nextDouble();
                    System.out.print("Diem Hoa: ");
                    hoa = scanner.nextDouble();
                    System.out.print("Diem Sinh: ");
                    double sinh = scanner.nextDouble();
                    scanner.nextLine(); // Đọc bỏ dòng new line sau nextDouble()
                    tmpTS = new thiSinhB(soBaoDanh, hoTen, diaChi, uuTien, toan, hoa, sinh);
                    break;

                case "c":
                    System.out.print("Diem Van: ");
                    double van = scanner.nextDouble();
                    System.out.print("Diem Su: ");
                    double su = scanner.nextDouble();
                    System.out.print("Diem Dia: ");
                    double dia = scanner.nextDouble();
                    scanner.nextLine();
                    tmpTS = new thiSinhC(soBaoDanh, hoTen, diaChi, uuTien, van, su, dia);
                    break;

                default:
                    System.out.println("Loai thi sinh khong hop le. Vui long nhap lai.");
                    i--;
                    continue;
            }

            danhSachThiSinh.add(tmpTS);
            System.out.println("Da them thi sinh thanh cong!\n");
        }
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sach thi sinh:");
        for (thiSinh ts : danhSachThiSinh) {
            ts.show();
            System.out.println();
        }
    }

    public void timTheoSoBaoDanh(Integer soBaoDanh) {
        boolean found = false;
        for (thiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println("Thong tin thi sinh co so bao danh " + soBaoDanh + ":");
                ts.show();
                found = !found;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay thi sinh co so bao danh " + soBaoDanh);
        }
    }

    public void timTheoKhoiThi(String khoiThi) {
        boolean found = false;
        khoiThi = khoiThi.toLowerCase();

        System.out.println("Danh sach thi sinh khoi " + khoiThi.toUpperCase() + ":");
        for (thiSinh ts : danhSachThiSinh) {
            switch (khoiThi) {
                case "a":
                    if (ts instanceof thiSinhA) {
                        ts.show();
                        found = true;
                    }
                    break;

                case "b":
                    if (ts instanceof thiSinhB) {
                        ts.show();
                        found = true;
                    }
                    break;

                case "c":
                    if (ts instanceof thiSinhC) {
                        ts.show();
                        found = true;
                    }
                    break;

                default:
                    System.out.println("Khoi thi khong hop le. Vui long nhap a, b hoac c.");
                    return;
            }
        }

        if (!found) {
            System.out.println("Khong co thi sinh nao thuoc khoi " + khoiThi.toUpperCase());
        }
    }

    public void sapXepTheoSoBaoDanh() {
        Collections.sort(danhSachThiSinh, (ts1, ts2) -> ts1.getSoBaoDanh().compareTo(ts2.getSoBaoDanh()));
        System.out.println("Danh sach thi sinh sau khi sap xep theo so bao danh:");
        hienThiDanhSach();
    }

    public void tongSoThiSinh() {
        int countA = 0, countB = 0, countC = 0;
        for (thiSinh ts : danhSachThiSinh) {
            if (ts instanceof thiSinhA) {
                countA++;
            } else if (ts instanceof thiSinhB) {
                countB++;
            } else {
                countC++;
            }
        }

        System.out.println("Tong so thi sinh khoi A: " + countA);
        System.out.println("Tong so thi sinh khoi B: " + countB);
        System.out.println("Tong so thi sinh khoi C: " + countC);
        System.out.println("Tong so thi sinh: " + danhSachThiSinh.size());

    }
}
