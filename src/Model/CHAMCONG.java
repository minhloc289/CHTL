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
public class CHAMCONG {
    private String maCC;
    private String maNV;
    private Date ngayCC;
    private int soGioLam;

    public CHAMCONG() {
    }

    public CHAMCONG(String maCC, String maNV, Date ngayCC, int soGioLam) {
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

    public Date getNgayCC() {
        return ngayCC;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    @Override
    public String toString() {
        return "CHAMCONG{" + "maCC=" + maCC + ", maNV=" + maNV + ", ngayCC=" + ngayCC + ", soGioLam=" + soGioLam + '}';
    }
    
}
