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
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class KhuyenMaiDAO implements DAOInterface<KHUYENMAI> {
    
    public static KhuyenMaiDAO getInstance() {
        return new KhuyenMaiDAO();
    }

    @Override
    public int insert(KHUYENMAI t) {
            try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO KHUYENMAI ( MASP, CTKM, CHIETKHAU, NGAYBD, NGAYKT)"
                        + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getMaSP());
            ps.setString(2, t.getCtkm());
            ps.setFloat(3, t.getChietKhau());
            ps.setDate(4, Date.valueOf(t.getNgayBD()));
            ps.setDate(5, Date.valueOf(t.getNgayKT()));
            

           int result = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        return result;
        
    } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
    }
    }

    @Override
    public int delete(KHUYENMAI t) {
            try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE KHUYENMAI SET isDeleted = 1 WHERE MAKM = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaKM());
            JOptionPane.showMessageDialog(null,"Xóa thành công"); 
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
            ps.setDate(4, Date.valueOf(t.getNgayBD()));
            ps.setDate(5,  Date.valueOf(t.getNgayKT()));
            ps.setString(6, t.getMaKM());
            int result = ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return result;
        } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
    }
    }

    @Override
    public ArrayList<KHUYENMAI> selectAll(KHUYENMAI t) {
        ArrayList<KHUYENMAI> khuyenMaiList = new ArrayList<>();
        
        try {
            Connection con = JDBC.getConnection();
            String sql = "Select * from KHUYENMAI where isDeleted = 0 ORDER BY MAKM ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                KHUYENMAI km = new KHUYENMAI();
                km.setMaKM(rs.getString("MAKM"));
                km.setMaSP(rs.getString("MASP"));
                km.setCtkm(rs.getString("CTKM"));
                km.setChietKhau(rs.getFloat("CHIETKHAU"));
               java.sql.Date sqlDate = rs.getDate("NGAYBD");   
               java.sql.Date sqlDate1 = rs.getDate("NGAYKT");
               LocalDate localDate ;
                LocalDate localDate1;
               if(sqlDate == null && sqlDate1 == null){
                   localDate = null;
                   localDate1 = null;
               }
               else{
                   localDate = sqlDate.toLocalDate();
                    localDate1 = sqlDate1.toLocalDate();   
               }
                km.setNgayBD(localDate);     
               km.setNgayKT(localDate1);   
                
                
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

