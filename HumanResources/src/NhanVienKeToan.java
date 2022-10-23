public class NhanVienKeToan extends Staff{
    public NhanVienKeToan(){}
    // Abstract method for displayInformation()
    public  String displayInformation(){
        return "abc";
    }
    public  String getMaNhanVien(){
        return "K";
    }

    public  String getTenNhanVien(){
        return "abc";
    }

    public  int getTuoiNhanVien(){
        return 1;
    }

    public  double getHeSoLuong(){
        return 1.2;
    }
    public  String getNgayVaoLam(){
        return "";
    }
    public  int getNgayNghiPhep(){
        return 1;
    }
    public  String getBoPhanLamViec(){
        return "";
    }
    public  Staff cloneE(){
        NhanVienKeToan a = new NhanVienKeToan();
        return a;
    }
    public  double getCalculateSalary(){
        return 1.2;
    }
}
