/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.KHACHHANG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class KhachHangDAO implements DAOInterface<KHACHHANG>{

    @Override
    public int insert(KHACHHANG t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO KHACHHANG (TENKH, GIOITINH, NGAYSINH)"
                        + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getTenKH());
            ps.setString(2, t.getGioiTinh());
            ps.setDate(3, Date.valueOf(t.getNgaySinh()));
            
           int rs= ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return rs;
        } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
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
                     "TENKH = ?, " +
                     "GIOITINH = ?, " +
                     "NGAYSINH = ? " + // Chú ý dấu cách trước WHERE
                     "WHERE MAKH = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setString(1, t.getTenKH());
            ps.setString(2, t.getGioiTinh());
            ps.setDate(3, Date.valueOf(t.getNgaySinh()));
            ps.setString(4, t.getMaKH());
            int rs= ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sửa khách hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return rs;
        } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
        }
    }

    @Override
    public ArrayList<KHACHHANG> selectAll(KHACHHANG t) {
        ArrayList<KHACHHANG> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBC.getConnection();
            String sql = "select * from khachhang order by makh asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                KHACHHANG kh = new KHACHHANG();
                kh.setMaKH(rs.getString("MAKh"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setGioiTinh(rs.getString("GIOITINH"));
                java.sql.Date sqlDate = rs.getDate("ngaysinh");
                if(sqlDate!= null){
                LocalDate localDate = sqlDate.toLocalDate();
                kh.setNgaySinh(localDate);
                }
                
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
                java.sql.Date sqlDate = rs.getDate("NGAYSINH");    
                LocalDate localDate = sqlDate.toLocalDate();
                khachHang.setNgaySinh(localDate);
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
