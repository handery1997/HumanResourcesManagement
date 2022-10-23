import java.lang.reflect.Array;
import java.util.*;
import java.text.NumberFormat;
public class Employee extends Staff implements Cloneable,ICalculator{
    private double soGioLamThem;
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double heSoLuong;
    private String ngayVaoLam;
    private int ngayNghiPhep;
    private String boPhanLamViec;
    //Create new Employee
    public Employee(String maNhanVien,String tenNhanVien,int tuoiNhanVien,double heSoLuong,String ngayVaoLam
            ,int ngayNghiPhep,String boPhanLamViec,double soGioLamThem){
        this.maNhanVien=maNhanVien;
        this.tenNhanVien=tenNhanVien;
        this.tuoiNhanVien=tuoiNhanVien;
        this.heSoLuong=heSoLuong;
        this.ngayVaoLam=ngayVaoLam;
        this.ngayNghiPhep=ngayNghiPhep;
        this.boPhanLamViec=boPhanLamViec;
        this.soGioLamThem=soGioLamThem;
    }
    // Display employee on table method
    public String displayInformation(){
        String prMaNhanVien= maNhanVien;
        String prTenNhanVien="| "+ tenNhanVien;
        String prTuoi = "| "+ tuoiNhanVien;
        String prHSLuong ="| "+ heSoLuong;
        String prNgayVaoLam ="| "+ ngayVaoLam;
        String prNgayNghiPhep="| "+ ngayNghiPhep;
        String prBoPhan ="| "+ boPhanLamViec;
        String prSoGioLamThem="| "+ soGioLamThem;
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
        while(prSoGioLamThem.length()<=25){
            prSoGioLamThem+=" ";
        }
        while(prLuong.length()<=40){
            prLuong+=" ";
        }

        return prMaNhanVien + prTenNhanVien + prTuoi + prHSLuong + prNgayVaoLam + prNgayNghiPhep + prBoPhan +
                prSoGioLamThem + prLuong;
    }
    //Calculate salary method
    public double calculateSalary() {

        return Math.round(this.heSoLuong*3000000 + this.soGioLamThem*200000);
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
    //Clone employee object method
    public Staff cloneE()  {
       return new Employee(this.maNhanVien,this.tenNhanVien
               ,this.tuoiNhanVien,this.heSoLuong,this.ngayVaoLam,this.ngayNghiPhep,this.boPhanLamViec,this.soGioLamThem);
    }
    public double getCalculateSalary(){
        return this.calculateSalary();
    };
}
