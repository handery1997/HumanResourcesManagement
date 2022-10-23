import java.text.NumberFormat;
import java.util.*;
public class Manager extends Staff implements ICalculator{
    private String chucDanh;
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double heSoLuong;
    private String ngayVaoLam;
    private int ngayNghiPhep;
    private String boPhanLamViec;
    private int luongTrachNhiem;
    //Create new manager object
    public Manager(String maNhanVien,String tenNhanVien,int tuoiNhanVien,double heSoLuong,String ngayVaoLam
            ,int ngayNghiPhep,String boPhanLamViec,String chucDanh){
        this.maNhanVien=maNhanVien;
        this.tenNhanVien=tenNhanVien;
        this.tuoiNhanVien=tuoiNhanVien;
        this.heSoLuong=heSoLuong;
        this.ngayVaoLam=ngayVaoLam;
        this.ngayNghiPhep=ngayNghiPhep;
        this.boPhanLamViec=boPhanLamViec;
        this.chucDanh=chucDanh;
    }
    // Display manager on table method
    public String displayInformation(){
        String prMaNhanVien= maNhanVien;
        String prTenNhanVien="| "+ tenNhanVien;
        String prTuoi = "| "+ tuoiNhanVien;
        String prHSLuong ="| "+ heSoLuong;
        String prNgayVaoLam ="| "+ ngayVaoLam;
        String prNgayNghiPhep="| "+ ngayNghiPhep;
        String prBoPhan ="| "+ boPhanLamViec;
        String prChucDanh="| "+ chucDanh;
        String prLuong ="| "+ String.format("%.0f",this.calculateSalary());
        while(prMaNhanVien.length()<20){
            prMaNhanVien+=" ";
        }
        while(prTenNhanVien.length()<=30){
            prTenNhanVien+=" ";
        }
        while(prTuoi.length()<=10){
            prTuoi+=" ";
        }
        while(prHSLuong.length()<=15){
            prHSLuong+=" ";
        }
        while(prNgayVaoLam.length()<=20){
            prNgayVaoLam+=" ";
        }
        while(prNgayNghiPhep.length()<=20){
            prNgayNghiPhep+=" ";
        }
        while(prBoPhan.length()<=30){
            prBoPhan+=" ";
        }
        while(prChucDanh.length()<=25){
            prChucDanh+=" ";
        }
        while(prLuong.length()<=40){
            prLuong+=" ";
        }
        return prMaNhanVien + prTenNhanVien + prTuoi + prHSLuong + prNgayVaoLam + prNgayNghiPhep + prBoPhan +
                prChucDanh + prLuong;

    }
    //Calculate salary method
    public double calculateSalary() {
        if(this.chucDanh=="Business Leader"){
            this.luongTrachNhiem=8000000;
        } else if (this.chucDanh=="Project Leader") {
            this.luongTrachNhiem=5000000;
        }else if (this.chucDanh=="Technical Leader"){
            this.luongTrachNhiem=6000000;
        }

        return (Math.round(this.heSoLuong*5000000 + this.luongTrachNhiem));
    }

    //Getting
    public String getMaNhanVien(){
        return this.maNhanVien;
    }
    public String getTenNhanVien(){
        return this.tenNhanVien;
    }
    public int getTuoiNhanVien(){
        return this.tuoiNhanVien;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    public String getNgayVaoLam(){
        return this.ngayVaoLam;
    }
    public int getNgayNghiPhep(){
        return this.ngayNghiPhep;
    }
    public String getBoPhanLamViec(){
        return this.boPhanLamViec;
    }
    //Clone Manager object method
    public Staff cloneE()  {
        return new Manager( this.maNhanVien,this.tenNhanVien
                ,this.tuoiNhanVien,this.heSoLuong,this.ngayVaoLam,this.ngayNghiPhep,this.boPhanLamViec,this.chucDanh);
    }
    public double getCalculateSalary(){
        return this.calculateSalary();
    };
}
