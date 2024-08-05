package DAO;

import Model.DOANHTHUTHANG;
import database.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DoanhThuThangDAO implements DAOInterface<DOANHTHUTHANG> {
    public static DoanhThuThangDAO getInstance() {
        return new DoanhThuThangDAO();
    }

    @Override
    public int insert(DOANHTHUTHANG t) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = JDBC.getConnection();
            String sql = "INSERT INTO DOANHTHUTHANG (THANGNAM, DTTHANG) VALUES (?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getThangNam());
            ps.setFloat(2, t.getDtThang());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        } finally {
            // Close resources
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int delete(DOANHTHUTHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(DOANHTHUTHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<DOANHTHUTHANG> selectAll(DOANHTHUTHANG t) {
        ArrayList<DOANHTHUTHANG> dttList = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBC.getConnection();
            String sql = "SELECT * FROM DOANHTHUTHANG ORDER BY THANGNAM ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DOANHTHUTHANG kh = new DOANHTHUTHANG();
                kh.setThangNam(rs.getString("THANGNAM"));
                kh.setDtThang(rs.getFloat("DTTHANG"));   
                dttList.add(kh);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dttList;
    }

    @Override
    public DOANHTHUTHANG selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
