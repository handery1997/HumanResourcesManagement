import java.util.*;
public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVien;
    // Create new department object
    public Department(String maBoPhan,String tenBoPhan,int soLuongNhanVien){
        this.maBoPhan=maBoPhan;
        this.tenBoPhan=tenBoPhan;
        this.soLuongNhanVien=soLuongNhanVien;
    }
    //Method for return department information on table
    public String toString(){
        String prMaBoPhan = maBoPhan;
        String prTenBoPhan = "| "+tenBoPhan;
        String prSoLuongNhanVien="| "+ soLuongNhanVien;
        while(prMaBoPhan.length()<20){
            prMaBoPhan+=" ";
        }
        while(prTenBoPhan.length()<30){
            prTenBoPhan+=" ";
        }
        while(prSoLuongNhanVien.length()<35){
            prSoLuongNhanVien+=" ";
        }
        return prMaBoPhan+prTenBoPhan+prSoLuongNhanVien;
    }
    //Add department employee number method
    public void addSoLuongNhanVien(){
        this.soLuongNhanVien+=1;
    }
    //Getting
    public String getMaBoPhan(){
        return this.maBoPhan;
    }
    public String getTenBoPhan(){
        return this.tenBoPhan;
    }
}
