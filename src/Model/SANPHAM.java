/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author quanlong79
 */
public class SANPHAM {
    private String maSP;
    private String tenSP;
    private String dvt;
    private float giaBan;
    private float giaNhap;
    private int slSP;

    public SANPHAM() {
    }

    public SANPHAM(String maSP, String tenSP, String dvt,  float giaNhap,float giaBan, int slSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dvt = dvt;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.slSP = slSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getDvt() {
        return dvt;
    }


    public float getGiaBan() {
        return giaBan;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public int getSlSP() {
        return slSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }
    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setSlSP(int slSP) {
        this.slSP = slSP;
    }

    @Override
    public String toString() {
        return "SANPHAM{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", dvt=" + dvt + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", slSP=" + slSP + '}';
    }
    
}
