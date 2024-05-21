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
            String sql = "INSERT INTO NHANVIEN (MANV, TENNV, GIOITINH, NGAYSINH, DIACHI, SDT, LUONG, PASSWORD) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaNV());
            ps.setString(2, t.getTenNV());
            ps.setString(3, t.getGioiTinh());
            ps.setDate(4, t.getNgaySinh()); 
            ps.setString(5, t.getDiaChi());
            ps.setString(6, t.getSdt());
            ps.setFloat(7, t.getLuong());
            ps.setString(8, t.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(NHANVIEN t) {
           try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE NHANVIEN SET isDeleted = 1 WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaNV());
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
             "LUONG = ?, " +
             "PASSWORD = ? " +
             "WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaNV());
            ps.setString(2, t.getTenNV());
            ps.setString(3, t.getGioiTinh());
            ps.setDate(4, t.getNgaySinh()); 
            ps.setString(5, t.getDiaChi());
            ps.setString(6, t.getSdt());
            ps.setFloat(7, t.getLuong());
            ps.setString(8, t.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<NHANVIEN> selectAll(NHANVIEN t) {
        ArrayList<NHANVIEN> nhanVienList = new ArrayList<>();
        
        try {
            Connection con = JDBC.getConnection();
            String sql = "Select * from NHANVIEN";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                NHANVIEN nv = new NHANVIEN();
                nv.setMaNV(rs.getString("MANV"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setGioiTinh(rs.getString("GIOITINH"));
                nv.setNgaySinh(rs.getDate("NGAYSINH"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setSdt(rs.getString("SDT"));
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

    @Override
    public NHANVIEN selectbyID(String T) {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
   
}
