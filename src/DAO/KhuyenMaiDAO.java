/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.KHUYENMAI;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;

public class KhuyenMaiDAO implements DAOInterface<KHUYENMAI> {
    
    public static KhuyenMaiDAO getInstance() {
        return new KhuyenMaiDAO();
    }

    @Override
    public int insert(KHUYENMAI t) {
            try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO KHUYENMAI (MAKM, MASP, CTKM, CHIETKHAU, NGAYBD, NGAYKT)"
                        + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaKM());
            ps.setString(2, t.getMaSP());
            ps.setString(3, t.getCtkm());
            ps.setFloat(4, t.getChietKhau());
            ps.setDate(5, t.getNgayBD());
            ps.setDate(6, t.getNgayKT());
            
            return ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
             return 0;
        }
           
    }

    @Override
    public int delete(KHUYENMAI t) {
            try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE KHUYENMAI SET isDeleted = 1 WHERE MAKM = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaKM());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }    }

    @Override
    public int update(KHUYENMAI t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE KHUYENMAI SET " +
                    "MASP = ?, "+
                    "CTKM = ?, "+
                    "CHIETKHAU = ?, "+
                    "NGAYBD = ?, " +
                    "NGAYKT = ? "+ 
                    "WHERE MAKM = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaSP());
            ps.setString(2, t.getCtkm());
            ps.setFloat(3, t.getChietKhau());
            ps.setDate(4, t.getNgayBD());
            ps.setDate(5, t.getNgayKT());
            ps.setString(6, t.getMaKM());
            
            return ps.executeUpdate();
        }  catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<KHUYENMAI> selectAll(KHUYENMAI t) {
        ArrayList<KHUYENMAI> khuyenMaiList = new ArrayList<>();
        
        try {
            Connection con = JDBC.getConnection();
            String sql = "Select * from KHUYENMAI";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                KHUYENMAI km = new KHUYENMAI();
                km.setMaKM(rs.getString("MAKM"));
                km.setMaSP(rs.getString("MASP"));
                km.setCtkm(rs.getString("CTKM"));
                km.setChietKhau(rs.getFloat("CHIETKHAU"));
                km.setNgayBD(rs.getDate("NGAYBD"));
                km.setNgayKT(rs.getDate("NGAYKT"));
                
                
                khuyenMaiList.add(km);
               
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return khuyenMaiList;
    }

    @Override
    public KHUYENMAI selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

