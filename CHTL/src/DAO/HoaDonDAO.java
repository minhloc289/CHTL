/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import GUI.Login;
import Model.HOADON;
import Model.SANPHAM;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.Representation;

public class HoaDonDAO implements DAOInterface<HOADON> {
    
    public static HoaDonDAO getInstance() {
        return new HoaDonDAO();
    }

    @Override
    public int insert(HOADON t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO HOADON (MANV,NGAYHD, MAKH)"
                        + "VALUES ( ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1,t.getMaNV());
            ps.setDate(2, Date.valueOf(t.getNgayHD()));
            ps.setString(3, t.getMaKH());
            
            int rse = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
    }
        return 1;
    }

    @Override
    public int delete(HOADON t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(HOADON t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<HOADON> selectAll(HOADON t) {
        ArrayList<HOADON> hoadonList = new ArrayList<HOADON>();
        
        try {
            Connection con = JDBC.getConnection();
            String sql ="Select * From HOADON order by mahd asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HOADON hoadon = new HOADON();
                hoadon.setMaHD(rs.getString("mahd"));
                hoadon.setMaNV(rs.getString("manv"));
                java.sql.Date sqlDate = rs.getDate("ngayhd");
                LocalDate localDate = sqlDate.toLocalDate();
                hoadon.setNgayHD(localDate);
                hoadon.setMaKH(rs.getString("makh"));
                hoadon.setTonghoadon(rs.getFloat("TONGDT"));
                hoadonList.add(hoadon);
            }
            rs.close();
            ps.close();
            con.close();
        }
           catch (SQLException e) {
        }
        return hoadonList;
    }

    @Override
    public HOADON selectbyID(String T) {
        HOADON hd = new HOADON();
        try {
            Connection con = JDBC.getConnection();
            String sql ="Select MANV From NHANVIEN WHERE SDT = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, T);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            hd.setMaNV(rs.getString("manv"));
            }
        } catch (Exception e) {
        }
        return hd;
    }
}