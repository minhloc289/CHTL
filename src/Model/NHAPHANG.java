/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class NHAPHANG {
    private String maNhap;
    private String maSP;
    private Date ngayNhap;
    private int slNhap;
    private String nhaCC;

    public NHAPHANG() {
    }

    public NHAPHANG(String maNhap, String maSP, Date ngayNhap, int slNhap, String nhaCC) {
        this.maNhap = maNhap;
        this.maSP = maSP;
        this.ngayNhap = ngayNhap;
        this.slNhap = slNhap;
        this.nhaCC = nhaCC;
    }

    public String getMaNhap() {
        return maNhap;
    }

    public String getMaSP() {
        return maSP;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    @Override
    public String toString() {
        return "NHAPHANG{" + "maNhap=" + maNhap + ", maSP=" + maSP + ", ngayNhap=" + ngayNhap + ", slNhap=" + slNhap + ", nhaCC=" + nhaCC + '}';
    }
    
    
    
}
