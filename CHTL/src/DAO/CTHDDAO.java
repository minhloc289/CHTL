/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.CTHD;
import Model.CTHD_temp;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;
import javax.swing.JOptionPane;

public class CTHDDAO  {
    
    public static CTHDDAO getInstance() {
        return new CTHDDAO();
    }

    
    public int insert(CTHD t) {
    try {
        Connection con = JDBC.getConnection();
        String sql = "{CALL INSERT_CTHD(?, ?, ?, ?, ?)}"; // Replace with your actual procedure name

        CallableStatement cs = con.prepareCall(sql);

        cs.setString(1, t.getMaHD());
        cs.setString(2, t.getMaSP());
        cs.setString(3, t.getMaKM());
        cs.setFloat(4, t.getTriGia());
        cs.setInt(5, t.getSL());

        int rse = cs.executeUpdate();
        return rse;
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage(), "Xin mời nhập lại", JOptionPane.ERROR_MESSAGE);
        return 0; // Return an appropriate value based on your business logic
    }
}


    
    public int delete(String mahd) {
        int rs;
        try {
            Connection con = JDBC.getConnection();
            String sql = "DELETE FROM HOADON WHERE MAHD = ?";
            PreparedStatement ps = con.prepareStatement(sql);
       
            ps.setString(1, mahd);
            
            rs = ps.executeUpdate();
            if(rs>0){
                JOptionPane.showMessageDialog(null,"Xóa thành công"); 
                return rs;
            }
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }   
        return rs;
    }

    

   
    public int update(CTHD t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<CTHD_temp> selectAll(CTHD_temp t) {
        ArrayList<CTHD_temp> cthd = new ArrayList<CTHD_temp>();
        try {
            Connection con = JDBC.getConnection();
            String sql ="SELECT CTHD.MAHD, SANPHAM.TENSP, KHUYENMAI.CHIETKHAU, CTHD.SL, SANPHAM.GIABAN, CTHD.TRIGIA " +
                     "FROM CTHD " +
                     "JOIN SANPHAM ON CTHD.MASP = SANPHAM.MASP " +
                     "LEFT JOIN KHUYENMAI ON CTHD.MAKM = KHUYENMAI.MAKM";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CTHD_temp sp_rec = new CTHD_temp();
                sp_rec.setMaHD(rs.getString("mahd"));
                sp_rec.setTenSP(rs.getString("tensp"));
                sp_rec.setChietKhau(rs.getFloat("chietkhau"));
                sp_rec.setSL(rs.getInt("SL"));
                sp_rec.setGiaBan(rs.getFloat("giaban"));
                sp_rec.setTriGia(rs.getFloat("trigia"));
                cthd.add(sp_rec);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
        }
        
        return cthd;
    }

    public String getNewMaHD(){
        try {
            Connection con = JDBC.getConnection();
             CallableStatement callableStatement = con.prepareCall("{call GET_NEWEST_MAHD(?)}");
            // Đăng ký tham số OUT cho mã hóa đơn mới nhất
            callableStatement.registerOutParameter(1, Types.VARCHAR);
            // Thực thi procedure
            callableStatement.execute();
            // Lấy giá trị của tham số OUt
            String newestMaHD;
            newestMaHD = callableStatement.getString(1);
            return newestMaHD;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Float> getInfCTHD(String maSp,String maKh,int soLuong) {
        ArrayList<Float> list = new ArrayList<>();
        try{
             Connection con = JDBC.getConnection();
             CallableStatement callableStatement = con.prepareCall("{call GET_DISCOUNT_AND_VALUE(?, ?, ?, ?, ?)}");

            // Đặt giá trị cho tham số đầu vào
            callableStatement.setString(1, maSp);
            callableStatement.setString(2, maKh);
            callableStatement.setInt(3, soLuong);

            // Đăng ký tham số OUT
            callableStatement.registerOutParameter(4, Types.FLOAT);
            callableStatement.registerOutParameter(5, Types.FLOAT);

            // Thực thi procedure
            callableStatement.execute();

            // Lấy giá trị từ các tham số OUT
            list.add(callableStatement.getFloat(4));
            list.add(callableStatement.getFloat(5));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Số lượng chọn mua lớn hơn số lượng hàng tồn","Xin mời nhập lại",JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public String getMakm (String masp){
        String maKM = null;
        try {
            Connection con = JDBC.getConnection();
            String sql = "SELECT MAKM FROM KHUYENMAI WHERE MASP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masp);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            maKM = rs.getString("makm");
            }
            return maKM;  
        } catch (Exception e) {
             e.printStackTrace(); 
        }
          return maKM;  
    }
    public int updateTongHoaDon(String maHD,float triGia){
        try {
            Connection con = JDBC.getConnection();
            String sql = "{call UPDATE_TONG_HOA_DON(?, ?)}";
            CallableStatement stmt = con.prepareCall(sql);
                stmt.setString(1, maHD);
                stmt.setFloat(2, triGia);
                stmt.execute();
                System.out.println("Tổng trị giá của hóa đơn " + maHD + " đã được cập nhật thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return 1;
    }
}         

