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
public class CHAMCONG {
    private String maCC;
    private String maNV;
    private LocalDate ngayCC;
    private int soGioLam;

    public CHAMCONG() {
    }

    public CHAMCONG(String maCC, String maNV, LocalDate ngayCC, int soGioLam) {
        this.maCC = maCC;
        this.maNV = maNV;
        this.ngayCC = ngayCC;
        this.soGioLam = soGioLam;
    }

    

    public String getMaCC() {
        return maCC;
    }

    public String getMaNV() {
        return maNV;
    }

    public LocalDate getNgayCC() {
        return ngayCC;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setMaCC(String maCC) {
        this.maCC = maCC;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNgayCC(LocalDate ngayCC) {
        this.ngayCC = ngayCC;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    
    

    @Override
    public String toString() {
        return "CHAMCONG{" + "maCC=" + maCC + ", maNV=" + maNV + ", ngayCC=" + ngayCC + ", soGioLam=" + soGioLam + '}';
    }
    
}
