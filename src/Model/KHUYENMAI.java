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
public class KHUYENMAI {
 private String maKM;
    private String maSP;
    private String ctkm;
    private float chietKhau;
    private Date ngayBD;
    private Date ngayKT;

    public KHUYENMAI() {
    }

    public KHUYENMAI(String maKM, String maSP, String ctkm, float chietKhau, Date ngayBD, Date ngayKT) {
        this.maKM = maKM;
        this.maSP = maSP;
        this.ctkm = ctkm;
        this.chietKhau = chietKhau;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }   

    public String getMaKM() {
        return maKM;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setCtkm(String ctkm) {
        this.ctkm = ctkm;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getCtkm() {
        return ctkm;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    @Override
    public String toString() {
        return "KHUYENMAI{" + "maKM=" + maKM + ", maSP=" + maSP + ", ctkm=" + ctkm + ", chietKhau=" + chietKhau + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + '}';
    }
   
}
