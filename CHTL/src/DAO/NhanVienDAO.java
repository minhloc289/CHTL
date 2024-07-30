/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.NHANVIEN;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienDAO implements DAOInterface<NHANVIEN>{
    
    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }

    @Override
    public int insert(NHANVIEN t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO NHANVIEN (TENNV, GIOITINH, NGAYSINH, DIACHI, SDT, Email, LUONG, PASSWORD) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, t.getTenNV());
            ps.setString(2, t.getGioiTinh());
            ps.setDate(3, Date.valueOf(t.getNgaySinh()));
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getSdt());
            ps.setString(6, t.getEmail()); 
            ps.setFloat(7, t.getLuong());
            ps.setString(8, t.getPassword());

            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            int errorCode = e.getErrorCode();
            return errorCode;
        }
    }

    @Override
    public int delete(NHANVIEN t) {
           try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE NHANVIEN SET isDeleted = 1 WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaNV());
             JOptionPane.showMessageDialog(null,"Xóa thành công"); 
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(NHANVIEN t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE NHANVIEN SET " +
                         "TENNV = ?, " +
                         "GIOITINH = ?, " +
                         "NGAYSINH = ?, " +
                         "DIACHI = ?, " +
                         "SDT = ?, " +
                         "Email = ?, " + // Thêm dòng này để cập nhật giá trị Email
                         "LUONG = ?, " +
                         "PASSWORD = ? " +
                         "WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, t.getTenNV());
            ps.setString(2, t.getGioiTinh());
            ps.setDate(3, Date.valueOf(t.getNgaySinh()));
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getSdt());
            ps.setString(6, t.getEmail()); // Thiết lập giá trị cho Email
            ps.setFloat(7, t.getLuong());
            ps.setString(8, t.getPassword());
            ps.setString(9, t.getMaNV());

            int rs = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sửa thành công nhân viên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return rs;
        } catch (SQLException e) {
            int errorCode = e.getErrorCode();
            return errorCode;
        }
    }

    @Override
    public NHANVIEN selectbyID(String T) {
        NHANVIEN nhanVien = null;
        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT * FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, T);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                nhanVien = new NHANVIEN();
                nhanVien.setMaNV(rs.getString("MANV"));
                nhanVien.setTenNV(rs.getString("TENNV"));
                nhanVien.setGioiTinh(rs.getString("GIOITINH"));
                java.sql.Date sqlDate = rs.getDate("NGAYSINH");
                LocalDate localDate = sqlDate.toLocalDate();
                nhanVien.setNgaySinh(localDate);

                nhanVien.setDiaChi(rs.getString("DIACHI"));
                nhanVien.setSdt(rs.getString("SDT"));
                nhanVien.setEmail(rs.getString("Email")); // Thêm dòng này để lấy giá trị Email
                nhanVien.setLuong(rs.getFloat("LUONG"));
                nhanVien.setPassword(rs.getString("PASSWORD"));
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return nhanVien;
    }

    
    public boolean checkLogin (String username, String password){
        try {
            Connection con = JDBC.getConnection();
            
            String sql = "Select * from NHANVIEN where SDT = ? and password = ?"; 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return false;
    }

    @Override
    public ArrayList<NHANVIEN> selectAll(NHANVIEN t) {
        ArrayList<NHANVIEN> nhanVienList = new ArrayList<>();

        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT * FROM NHANVIEN WHERE isDeleted = 0 ORDER BY MANV ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NHANVIEN nv = new NHANVIEN();
                nv.setMaNV(rs.getString("MANV"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setGioiTinh(rs.getString("GIOITINH"));

                java.sql.Date sqlDate = rs.getDate("NGAYSINH");
                LocalDate localDate = sqlDate.toLocalDate();
                nv.setNgaySinh(localDate);
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setSdt(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email")); // Thêm dòng này để lấy giá trị Email
                nv.setLuong(rs.getFloat("LUONG"));
                nv.setPassword(rs.getString("PASSWORD"));

                nhanVienList.add(nv);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return nhanVienList;
    }
    
    public int updatePassword(String email, String newPassword) {
        int ketQua = 0;
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE NHANVIEN SET PASSWORD=? WHERE Email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newPassword); 
            pst.setString(2, email);
            ketQua = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

   
}
