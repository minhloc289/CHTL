/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author locmi
 */
public class LUONGNHANVIEN {
    private String maNV;
    private String tenNV;
    private float tongLuong;
    
    public LUONGNHANVIEN(){};
    
    public LUONGNHANVIEN(String maNV, String tenNV, float tongLuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tongLuong = tongLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    @Override
    public String toString() {
        return "LUONGNHANVIEN{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", tongLuong=" + tongLuong + '}';
    }

}
