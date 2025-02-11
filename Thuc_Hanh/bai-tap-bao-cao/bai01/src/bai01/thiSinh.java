package bai01;

public class thiSinh {
    private Integer soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;
    
    public thiSinh() {
        soBaoDanh = 0; hoTen = diaChi = uuTien = "";
    }
    
    public thiSinh(Integer soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }
    
    //  Getter
    public Integer getSoBaoDanh() { return soBaoDanh; }
    public String getHoTen() { return hoTen; }
    public String getDiaChi() { return diaChi; }
    public String getUuTien() { return uuTien; }
    
    //  Setter
    public void setSoBaoDanh(Integer soBaoDanh) { this.soBaoDanh = soBaoDanh; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setUuTien(String uuTien) { this.uuTien = uuTien; }
    
    public void show() {
        System.out.println("\tSo Bao Danh thi sinh: " + soBaoDanh);
        System.out.println("\tHo ten thi sinh: " + hoTen);
        System.out.println("\tDia chi thi sinh: " + diaChi);
        System.out.println("\tUu tien thi sinh: " + uuTien);
        
    }
}

class thiSinhA extends thiSinh {
    private double Toan;
    private double Ly;
    private double Hoa;
    
    public thiSinhA() {
        super();
        Toan = 0.0; Ly = 0.0; Hoa = 0.0;
    }
    
    public thiSinhA(Integer soBaoDanh, String hoTen, String diaChi, String uuTien, double Toan, double Ly, double Hoa) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.Toan = Toan; this.Ly = Ly; this.Hoa = Hoa;
    }
    
    // Getter
    public double getToan() { return Toan; }
    public double getLy() { return Ly; }
    public double getHoa() { return Hoa; }
    
    // Setter
    public void setToan(double Toan) { this.Toan = Toan; }
    public void setLy(double Ly) { this.Toan = Ly; }
    public void setHoa(double Hoa) { this.Toan = Hoa; }
    
    // Show 
    @Override
    public void show() {
        super.show();
        System.out.println("\tDiem Toan thi sinh: " + Toan);
        System.out.println("\tDiem Ly thi sinh: " + Ly);
        System.out.println("\tDiem Hoa thi sinh: " + Hoa);
    }
}

class thiSinhB extends thiSinh {
    private double Toan;
    private double Hoa;
    private double Sinh;
    
    public thiSinhB() {
        super();
        Toan = 0.0; Hoa = 0.0; Sinh = 0.0;
    }
    
    public thiSinhB(Integer soBaoDanh, String hoTen, String diaChi, String uuTien, double Toan, double Hoa, double Sinh) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.Toan = Toan; this.Hoa = Hoa; this.Sinh = Sinh;
    }
    
    // Getter
    public double getToan() { return Toan; }
    public double getHoa() { return Hoa; }
    public double getSinh() { return Sinh; }
    
    // Setter
    public void setToan(double Toan) { this.Toan = Toan; }
    public void setHoa(double Hoa) { this.Hoa = Hoa; }
    public void setSinh(double Sinh) { this.Sinh = Sinh; }
    
    @Override
    public void show() {
        super.show();
        System.out.println("\tDiem Toan thi sinh: " + Toan);
        System.out.println("\tDiem Ly thi sinh: " + Hoa);
        System.out.println("\tDiem Hoa thi sinh: " + Sinh);
    }
}

class thiSinhC extends thiSinh {
    private double Van;
    private double Su;
    private double Dia;
    
    public thiSinhC() {
        super();
        Van = 0.0; Su = 0.0; Dia = 0.0;
    }
    
    public thiSinhC(Integer soBaoDanh, String hoTen, String diaChi, String uuTien, double Van, double Su, double Dia) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.Van = Van; this.Su = Su; this.Dia = Dia;
    }
    
    // Getter
    public double getVan() { return Van; }
    public double getSu() { return Su; }
    public double getDia() { return Dia; }
    
    // Setter
    public void setVan(double Van) { this.Van = Van; }
    public void setSu(double Su) { this.Su = Su; }
    public void setDia(double Dia) { this.Dia = Dia; }
    
    @Override
    public void show() {
        super.show();
        System.out.println("\tDiem Toan thi sinh: " + Van);
        System.out.println("\tDiem Ly thi sinh: " + Su);
        System.out.println("\tDiem Hoa thi sinh: " + Dia);
    }
}
