/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.KHACHHANG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class KhachHangDAO implements DAOInterface<KHACHHANG>{

    @Override
    public int insert(KHACHHANG t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO KHACHHANG (MAKH, TENKH, GIOITINH, NGAYSINH, TICHDIEM)"
                        + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaKH());
            ps.setString(2, t.getTenKH());
            ps.setString(3, t.getGioiTinh());
            ps.setDate(4, t.getNgaySinh());
            ps.setInt(5, t.getTichDiem());
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
    }
    }

    @Override
    public int delete(KHACHHANG t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(KHACHHANG t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE KHACHHANG SET " +
                    "TENKH = ?, "+
                    "GIOITINH = ?, "+
                    "NGAYSINH = ?, "+
                    "TICHDIEM = ?, " +       
                    "WHERE MAKH = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaKH());
            ps.setString(2, t.getTenKH());
            ps.setString(3, t.getGioiTinh());
            ps.setDate(4, t.getNgaySinh());
            ps.setInt(5, t.getTichDiem());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<KHACHHANG> selectAll(KHACHHANG t) {
        ArrayList<KHACHHANG> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBC.getConnection();
            String sql = "Select * from KHACHHANG";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                KHACHHANG kh = new KHACHHANG();
                kh.setMaKH(rs.getString("MAKM"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setGioiTinh(rs.getString("GIOITINH"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setTichDiem(rs.getInt("TICHDIEM"));
                
                khachHangList.add(kh);
               
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return khachHangList;
    }

    @Override
    public KHACHHANG selectbyID(String T) {
    KHACHHANG khachHang = null;
        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT * FROM KHACHHANG WHERE MAKH = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, T);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                khachHang = new KHACHHANG();
                khachHang.setMaKH(rs.getString("MAKH"));
                khachHang.setTenKH(rs.getString("TENKH"));
                khachHang.setGioiTinh(rs.getString("GIOITINH"));
                khachHang.setNgaySinh(rs.getDate("NGAYSINH"));
                khachHang.setTichDiem(rs.getInt("TICHDIEM"));
            }
            
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return khachHang;
    }    
    
}
