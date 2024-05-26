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
public class HOADON {
    private String maHD;
    private String maNV;
    private Date ngayHD;
    private String maKH;
    private float tongHoaDon;

    public HOADON(String maHD, String maNV, Date ngayHD, String maKH, float tongHoaDon) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.ngayHD = ngayHD;
        this.maKH = maKH;
        this.tongHoaDon = tongHoaDon;
    }

    public HOADON() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public float getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(float tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
    }

    @Override
    public String toString() {
        return "HOADON{" + "maHD=" + maHD + ", maNV=" + maNV + ", ngayHD=" + ngayHD + ", maKH=" + maKH + ", tongHoaDon=" + tongHoaDon + '}';
    }

    
    
}
