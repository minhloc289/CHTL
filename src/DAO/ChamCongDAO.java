package DAO;

import Model.CHAMCONG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChamCongDAO implements DAOInterface<CHAMCONG> {

    public static ChamCongDAO getInstance() {
        return new ChamCongDAO();
    }

    @Override
    public int insert(CHAMCONG t) {
        try {
            Connection con = JDBC.getConnection();
            String sql = "INSERT INTO CHAMCONG (MANV, NGAYCC, CHECK_IN_TIME, CHECK_OUT_TIME, SOGIOLAM) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, t.getMaNV());
            ps.setDate(2, Date.valueOf(t.getNgayCC()));
            ps.setTimestamp(3, t.getCheckInTime() != null ? Timestamp.valueOf(t.getCheckInTime()) : null);
            ps.setTimestamp(4, t.getCheckOutTime() != null ? Timestamp.valueOf(t.getCheckOutTime()) : null);
            ps.setInt(5, t.getSoGioLam());

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
        try {
            Connection con = JDBC.getConnection();
            String sql = "UPDATE CHAMCONG SET CHECK_OUT_TIME = ?, SOGIOLAM = ? WHERE MANV = ? AND NGAYCC = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setTimestamp(1, Timestamp.valueOf(t.getCheckOutTime()));
            ps.setInt(2, t.getSoGioLam());
            ps.setString(3, t.getMaNV());
            ps.setDate(4, Date.valueOf(t.getNgayCC()));

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
    public ArrayList<CHAMCONG> selectAll(CHAMCONG t) {
        ArrayList<CHAMCONG> chamCongList = new ArrayList<>();
        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT * FROM CHAMCONG ORDER BY MACC ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CHAMCONG cc = new CHAMCONG();
                cc.setMaCC(rs.getString("MACC"));
                cc.setMaNV(rs.getString("MANV"));
                java.sql.Date sqlDate = rs.getDate("NGAYCC");
                LocalDate localDate = sqlDate.toLocalDate();
                cc.setNgayCC(localDate);
                cc.setCheckInTime(rs.getTimestamp("CHECK_IN_TIME") != null ? rs.getTimestamp("CHECK_IN_TIME").toLocalDateTime() : null);
                cc.setCheckOutTime(rs.getTimestamp("CHECK_OUT_TIME") != null ? rs.getTimestamp("CHECK_OUT_TIME").toLocalDateTime() : null);
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
            String sql = "SELECT * FROM CHAMCONG WHERE MANV = ? AND NGAYCC = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, T);
            ps.setDate(2, Date.valueOf(LocalDate.now())); // Giả sử ngày hôm nay để lấy chấm công hôm nay
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                chamCong = new CHAMCONG();
                chamCong.setMaCC(rs.getString("MACC"));
                chamCong.setMaNV(rs.getString("MANV"));
                chamCong.setNgayCC(rs.getDate("NGAYCC").toLocalDate());
                chamCong.setCheckInTime(rs.getTimestamp("CHECK_IN_TIME") != null ? rs.getTimestamp("CHECK_IN_TIME").toLocalDateTime() : null);
                chamCong.setCheckOutTime(rs.getTimestamp("CHECK_OUT_TIME") != null ? rs.getTimestamp("CHECK_OUT_TIME").toLocalDateTime() : null);
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
    
    public ArrayList<CHAMCONG> dsNhanVien(String month, String year) {
        ArrayList<CHAMCONG> dsChamCong = new ArrayList<>();
        try {
            Connection conn = JDBC.getConnection();
            String sql = "SELECT MACC, MANV, NGAYCC, SOGIOLAM FROM CHAMCONG WHERE EXTRACT(MONTH FROM NGAYCC) = ? AND EXTRACT(YEAR FROM NGAYCC) = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(month)); // Convert month to integer
            ps.setInt(2, Integer.parseInt(year));  // Convert year to integer

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CHAMCONG cc = new CHAMCONG();
                cc.setMaCC(rs.getString("MACC"));
                cc.setMaNV(rs.getString("MANV"));
                cc.setNgayCC(rs.getDate("NGAYCC").toLocalDate());
                cc.setSoGioLam(rs.getInt("SOGIOLAM"));
                dsChamCong.add(cc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }
}
