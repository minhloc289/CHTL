/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ADMIN
 */
public class KHACHHANG {
    private String maKH;
    private String tenKH;
    private String gioiTinh;
    private Date ngaySinh;
    private int tichDiem;

    public KHACHHANG() {
    }

    public KHACHHANG(String maKH, String tenKH, String gioiTinh, Date ngaySinh, int tichDiem) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.tichDiem = tichDiem;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        Date date = Date.valueOf(ngaySinh);
        this.ngaySinh = date;
    }

    public void setTichDiem(int tichDiem) {
        this.tichDiem = tichDiem;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public int getTichDiem() {
        return tichDiem;
    }

    @Override
    public String toString() {
        return "KHACHHANG{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", tichDiem=" + tichDiem + '}';
    }
    
}
