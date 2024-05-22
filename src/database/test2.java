/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import DAO.KhuyenMaiDAO;
import Model.KHUYENMAI;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author ADMIN
 */
public class test2 {
    public static void main(String[] args) {
        LocalDate bd = LocalDate.of(2024, 04, 02);
        LocalDate kt = LocalDate.of(2024, 05, 21);
        KHUYENMAI tc = new KHUYENMAI();
        KhuyenMaiDAO a = new KhuyenMaiDAO();
        tc.setMaKM("KM050");
        tc.setMaSP("SP004");
        tc.setCtkm("test");
        tc.setChietKhau((float) 0.5);
        tc.setNgayBD(bd);
        tc.setNgayKT(kt);
        System.out.println(a.insert(tc));
    }
}
