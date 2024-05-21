package database;
import DAO.NhanVienDAO;
import java.sql.*;
import database.JDBC;
import java.util.ArrayList;

/**
 *
 * @author quanlong79
 */
public class test {
    public static void main(String[] args) {
        Connection con = JDBC.getConnection();
        int kq = 0;
       try {
         
            String sql = "UPDATE NHANVIEN SET isDeleted = 1 WHERE MANV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1,"NV001");
            kq = ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static ArrayList<String> getUsername(Connection con) throws SQLException {
    ArrayList<String> username = new ArrayList<>();
    
    // Tạo một đối tượng Statement để thực hiện truy vấn
    Statement stat = con.createStatement();
    
    // Thực hiện truy vấn và lấy kết quả
    ResultSet rs = stat.executeQuery("SELECT SDT FROM NHANVIEN");
    
    // Lặp qua kết quả truy vấn và thêm vào danh sách
    while (rs.next()) {
        // Lấy giá trị của cột "SDT" và thêm vào danh sách
        username.add(rs.getString("SDT"));
    }
    
    // Đóng ResultSet và Statement để giải phóng tài nguyên
    rs.close();
    stat.close();
    
    // Trả về danh sách tên người dùng
    return username;
    }
}