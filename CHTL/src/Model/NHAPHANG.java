/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class NHAPHANG {
    private String maNhap;
    private String maSP;
    private LocalDate ngayNhap;
    private int slNhap;
    private String nhaCC;

    public NHAPHANG() {
    }

    public NHAPHANG(String maNhap, String maSP, LocalDate ngayNhap, int slNhap, String nhaCC) {
        this.maNhap = maNhap;
        this.maSP = maSP;
        this.ngayNhap = ngayNhap;
        this.slNhap = slNhap;
        this.nhaCC = nhaCC;
    }

    public String getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(String maNhap) {
        this.maNhap = maNhap;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    @Override
    public String toString() {
        return "NHAPHANG{" + "maNhap=" + maNhap + ", maSP=" + maSP + ", ngayNhap=" + ngayNhap + ", slNhap=" + slNhap + ", nhaCC=" + nhaCC + '}';
    }
}
