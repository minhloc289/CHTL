/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.NHAPHANG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;

public class NhapHangDAO implements DAOInterface<NHAPHANG> {
    
    public static NhapHangDAO getInstance() {
        return new NhapHangDAO();
    }

    @Override
    public int insert(NHAPHANG t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO NHAPHANG (MASP, NGNHAP, SLNHAP, NHACC) "
                   + "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaSP());
            ps.setDate(2, Date.valueOf(t.getNgayNhap())); 
            ps.setInt(3, t.getSlNhap());
            ps.setString(4, t.getNhaCC());
           
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }    }

    @Override
    public int delete(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<NHAPHANG> selectAll(NHAPHANG t) {
        ArrayList<NHAPHANG> nhapHangList = new ArrayList<>();
        try {
            Connection con = JDBC.getConnection();
            String sql = "select * from NHAPHANG ORDER BY MANHAP ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                NHAPHANG nh = new NHAPHANG();
                nh.setMaNhap(rs.getString("MANHAP"));
                nh.setMaSP(rs.getString("MASP"));
                java.sql.Date sqlDate = rs.getDate("NGNHAP");
                LocalDate localDate = sqlDate.toLocalDate();
                nh.setNgayNhap(localDate);
                nh.setSlNhap(rs.getInt("SLNHAP"));
                nh.setNhaCC(rs.getString("NHACC"));
              
                nhapHangList.add(nh);
               
            }
            rs.close();
            ps.close();
            con.close();
    }
         catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return nhapHangList;
    }
    


    @Override
    public NHAPHANG selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
     public boolean productExists(String maSP) {
        boolean exists = false;
        // Assuming you have a database connection method `getConnection`
        Connection conn = JDBC.getConnection();
        String query = "SELECT COUNT(*) FROM SANPHAM WHERE MASP = ? AND ISDELETED =0";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, maSP);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    exists = rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Make sure to close the connection
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return exists;
    }
}

