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
    private String maCC;
    private String maNV;
    private String tenNV;
    private float tongLuong;
    
    public LUONGNHANVIEN(){};
    
    public LUONGNHANVIEN(String maCC, String maNV, String tenNV, float tongLuong) {
        this.maCC = maCC;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tongLuong = tongLuong;
    }

    public String getMaCC() {
        return maCC;
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

    @Override
    public String toString() {
        return "LUONGNHANVIEN{" + "maCC=" + maCC + ", maNV=" + maNV + ", tenNV=" + tenNV + ", tongLuong=" + tongLuong + '}';
    }
    
    
    
}
