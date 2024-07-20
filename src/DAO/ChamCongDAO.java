/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.CHAMCONG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;

public class ChamCongDAO implements DAOInterface<CHAMCONG> {
    
    public static ChamCongDAO getInstance() {
        return new ChamCongDAO();
    }

    @Override
    public int insert(CHAMCONG t) {
    try {
        Connection con = JDBC.getConnection();
        String sql = "INSERT INTO CHAMCONG (MANV, NGAYCC, SOGIOLAM) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
  
        ps.setString(1, t.getMaNV());
        ps.setDate(2, Date.valueOf(t.getNgayCC()));
        ps.setInt(3, t.getSoGioLam());

        int result = ps.executeUpdate();
        
        ps.close();
        con.close();
        
        return result;
    } catch (SQLException e) {
        System.err.println("SQL Exception: " + e.getMessage());
        e.printStackTrace();
        return 0; // hoặc mã lỗi khác nếu cần
    }
}


    @Override
    public int delete(CHAMCONG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(CHAMCONG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<CHAMCONG> selectAll(CHAMCONG t) {
        ArrayList<CHAMCONG> chamCongList = new ArrayList<>();
        try {
            Connection con = JDBC.getConnection();
            String sql = "select * from CHAMCONG ORDER BY MACC ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CHAMCONG cc = new CHAMCONG();
                cc.setMaCC(rs.getString("MACC"));
                cc.setMaNV(rs.getString("MANV"));
                java.sql.Date sqlDate = rs.getDate("NGAYCC");
                LocalDate localDate = sqlDate.toLocalDate();
                cc.setNgayCC(localDate);
                cc.setSoGioLam(rs.getInt("SOGIOLAM"));
              
                chamCongList.add(cc);
               
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return chamCongList;
    }

    @Override
    public CHAMCONG selectbyID(String T) {
        CHAMCONG chamCong = null;
        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT * FROM CHAMCONG WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, T);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                chamCong = new CHAMCONG();
                chamCong.setMaCC(rs.getString("MACC"));
                chamCong.setMaNV(rs.getString("MANV"));
                chamCong.setNgayCC(rs.getDate("NGAYCC").toLocalDate());
                chamCong.setSoGioLam(rs.getInt("SOGIOLAM"));
            }
            
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return chamCong;
    }
}

