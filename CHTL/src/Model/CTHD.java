/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class CTHD {
    private String maHD;
    private String maSP;
    private String maKM;
    private int SL;
    private float triGia;
    private float chietKhau;
    public CTHD() {
    }

    public CTHD(String maHD, String maSP, String maKM, int SL, float triGia) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.maKM = maKM;
        this.SL = SL;
        this.triGia = triGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getMaKM() {
        return maKM;
    }

    public int getSL() {
        return SL;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    @Override
    public String toString() {
        return "CTHD{" + "maHD=" + maHD + ", maSP=" + maSP + ", maKM=" + maKM + ", SL=" + SL + ", triGia=" + triGia + '}';
    }    
}
