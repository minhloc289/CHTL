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
public class DOANHTHU {
    private String maHD;
    private Date ngayLap;
    private float tongDoanhThu;

    public DOANHTHU() {
    }

    public DOANHTHU(String maHD, Date ngayLap, float tongDoanhThu) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.tongDoanhThu = tongDoanhThu;
    }

    public String getMaHD() {
        return maHD;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public float getTongDoanhThu() {
        return tongDoanhThu;
    }

    @Override
    public String toString() {
        return "DOANHTHU{" + "maHD=" + maHD + ", ngayLap=" + ngayLap + ", tongDoanhThu=" + tongDoanhThu + '}';
    }
    
}
