package Model;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CHAMCONG {
    private String maCC;
    private String maNV;
    private LocalDate ngayCC;
    private double soGioLam; // Đổi từ int thành double
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    public CHAMCONG() {
    }

    public CHAMCONG(String maCC, String maNV, LocalDate ngayCC, LocalDateTime checkInTime, LocalDateTime checkOutTime, double soGioLam) { // Đổi kiểu dữ liệu ở đây
        this.maCC = maCC;
        this.maNV = maNV;
        this.ngayCC = ngayCC;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.soGioLam = soGioLam; // Đổi kiểu dữ liệu ở đây
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

    public double getSoGioLam() { // Đổi kiểu dữ liệu ở đây
        return soGioLam;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
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

    public void setSoGioLam(double soGioLam) { // Đổi kiểu dữ liệu ở đây
        this.soGioLam = soGioLam;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        return "CHAMCONG{" + "maCC=" + maCC + ", maNV=" + maNV + ", ngayCC=" + ngayCC + ", soGioLam=" + soGioLam + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + '}';
    }
}
