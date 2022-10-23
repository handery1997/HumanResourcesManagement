import java.util.*;
public abstract class Staff {
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double heSoLuong;
    private String ngayVaoLam;
    private int ngayNghiPhep;
    private String boPhanLamViec;
    public Staff(){}
    // Abstract method for displayInformation()
    public abstract String displayInformation();
    public abstract String getMaNhanVien();

    public abstract String getTenNhanVien();

    public abstract int getTuoiNhanVien();

    public abstract double getHeSoLuong();
    public abstract String getNgayVaoLam();
    public abstract int getNgayNghiPhep();
    public abstract String getBoPhanLamViec();
    public abstract Staff cloneE();
    public abstract double getCalculateSalary();
}
