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
public class DOANHTHU {
    
    private LocalDate ngayLap;
    private float tongDoanhThu; 
    
    public DOANHTHU(){
        
    }
    public DOANHTHU(LocalDate ngayLap, float tongDoanhThu) {
        this.ngayLap = ngayLap;
        this.tongDoanhThu = tongDoanhThu;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public float getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(float tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }
    
    
}
