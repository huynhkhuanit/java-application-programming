package bai01;

public class Bai01 {
    public static void main(String[] args) {
        tuyenSinh ts = new tuyenSinh();
        // Tạo các mẫu đối tượng
        thiSinhA tsA1 = new thiSinhA(1, "Nguyễn Văn A", "Hà Nội", "Ưu tiên 1", 9.5, 8.5, 9.0);
        thiSinhA tsA2 = new thiSinhA(2, "Trần Thị B", "Hồ Chí Minh", "Ưu tiên 2", 8.0, 7.5, 8.5);
        
        thiSinhB tsB1 = new thiSinhB(3, "Lê Văn C", "Đà Nẵng", "Ưu tiên 1", 9.0, 8.5, 9.5);
        thiSinhB tsB2 = new thiSinhB(4, "Phạm Thị D", "Hải Phòng", "Ưu tiên 2", 7.5, 8.0, 8.5);
        
        thiSinhC tsC1 = new thiSinhC(5, "Ngô Văn E", "Quảng Nam", "Ưu tiên 1", 9.5, 8.5, 9.0);
        thiSinhC tsC2 = new thiSinhC(6, "Đặng Thị F", "Vinh", "Ưu tiên 2", 8.0, 7.5, 8.5);
        thiSinhC tsC3 = new thiSinhC(7, "Đặng Thị F", "Vinh", "Ưu tiên 2", 8.0, 7.5, 8.5);
        
        // Thêm các mẫu đối tượng vào danh sách
        ts.danhSachThiSinh.add(tsA1);
        ts.danhSachThiSinh.add(tsA2);
        ts.danhSachThiSinh.add(tsB1);
        ts.danhSachThiSinh.add(tsB2);
        ts.danhSachThiSinh.add(tsC1);
        ts.danhSachThiSinh.add(tsC2);
        ts.danhSachThiSinh.add(tsC3);
        
        // Hiển thị danh sách thí sinh
        ts.hienThiDanhSach();

        // Tìm thí sinh theo số báo danh
        ts.timTheoSoBaoDanh(1);
        ts.timTheoSoBaoDanh(7); // Không tồn tại

        // Tìm thí sinh theo khối thi
        ts.timTheoKhoiThi("a");
        ts.timTheoKhoiThi("b");
        ts.timTheoKhoiThi("c");
        ts.timTheoKhoiThi("d"); // Khối không hợp lệ

        // Sắp xếp thí sinh theo số báo danh
        ts.sapXepTheoSoBaoDanh();

        // Tổng số thí sinh
        ts.tongSoThiSinh();
    }
}
