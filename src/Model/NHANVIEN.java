/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author quanlong79
 */
public class NHANVIEN {
    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;
    private String sdt;
    private float luong;
    private String password;

    public NHANVIEN() {
    }

    public NHANVIEN(String maNV, String tenNV, String gioiTinh, LocalDate ngaySinh, String diaChi, String sdt, float luong, String password) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.luong = luong;
        this.password = password;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public float getLuong() {
        return luong;
    }

    public String getPassword() {
        return password;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString() {
        return "NHANVIEN{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", luong=" + luong + ", password=" + password + '}';
    }
    
}
