/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.SANPHAM;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import javax.swing.JOptionPane;

public class SanPhamDAO implements DAOInterface<SANPHAM> {
    
    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    @Override
    public int insert(SANPHAM t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO SANPHAM (TENSP, DVT, GIABAN, GIANHAP)"
                        + "VALUES ( ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            

            ps.setString(1, t.getTenSP());
            ps.setString(2, t.getDvt());
            ps.setDouble(3, t.getGiaBan());
            ps.setDouble(4, t.getGiaNhap());
            
            int rs= ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            return rs;
        } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
    }
    }


   @Override
    public int delete(SANPHAM t) {
            try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE SANPHAM SET isDeleted = 1 WHERE MASP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, t.getMaSP());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }    }
     @Override
    public int update(SANPHAM t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE SANPHAM SET " +
                    "TENSP = ?, "+
                    "DVT = ?, "+
                    "GIABAN = ?, " +
                    "GIANHAP = ? "+ 
                    "WHERE MASP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getTenSP());
            ps.setString(2, t.getDvt());
            ps.setFloat(3, t.getGiaBan());
            ps.setFloat(4, t.getGiaNhap());
            ps.setString(5, t.getMaSP());

            int rs= ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return rs;
        } catch (SQLException e) {    
        int errorCode = e.getErrorCode();
        return errorCode;
        }
    }

   @Override
    public ArrayList<SANPHAM> selectAll(SANPHAM t) {
        ArrayList<SANPHAM> sanpham = new ArrayList<SANPHAM>();
        try {
            Connection con = JDBC.getConnection();
            String sql ="Select * From SANPHAM WHERE isdeleted = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SANPHAM sp_rec = new SANPHAM();
                sp_rec.setMaSP(rs.getString("masp"));
                sp_rec.setTenSP(rs.getString("tensp"));
                sp_rec.setDvt(rs.getString("DVT"));
                sp_rec.setGiaBan(rs.getFloat("giaban"));
                sp_rec.setGiaNhap(rs.getFloat("gianhap"));
                sp_rec.setSlSP(rs.getInt("Slsp"));
                sanpham.add(sp_rec);
            }
            rs.close();
            ps.close(); 
            con.close();
        } catch (SQLException e) {
        }
        
        return sanpham;
    }
    @Override
    public SANPHAM selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
    

