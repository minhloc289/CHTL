/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.DOANHTHU;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;

public class DoanhThuDAO implements DAOInterface<DOANHTHU> {
    
    public static DoanhThuDAO getInstance() {
        return new DoanhThuDAO();
    }

    @Override
    public int insert(DOANHTHU t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "{CALL INSERT_DOANHTHU(?, ?)}"; 
            CallableStatement cs = con.prepareCall(sql);

            // Đặt các tham số cho procedure
            
            cs.setDate(1, Date.valueOf(t.getNgayLap()));
            cs.setFloat(2, t.getTongDoanhThu());
            // Thực thi procedure
            cs.execute();

            // Đóng kết nối
            con.close();

            return 0; // Trả về 1 nếu thực thi thành công
            } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            int errorCode = e.getErrorCode();
            e.printStackTrace();
            return errorCode; // Trả về 0 nếu có lỗi xảy ra
}

    }

    @Override
    public int delete(DOANHTHU t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(DOANHTHU t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<DOANHTHU> selectAll(DOANHTHU t) {
        ArrayList<DOANHTHU> doanhthuList = new ArrayList<DOANHTHU>();
        
        try {
            Connection con = JDBC.getConnection();
            String sql ="Select * From DOANHTHU order by NGAYLAP asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DOANHTHU doanhthu = new DOANHTHU();
                java.sql.Date sqlDate = rs.getDate("ngaylap");
                LocalDate localDate = sqlDate.toLocalDate();
                doanhthu.setNgayLap(localDate);
                doanhthu.setTongDoanhThu(rs.getFloat("tongdt"));
                doanhthuList.add(doanhthu);
            }
            rs.close();
            ps.close();
            con.close();
        }
           catch (SQLException e) {
        }
        return doanhthuList;
    }

    @Override
    public DOANHTHU selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

