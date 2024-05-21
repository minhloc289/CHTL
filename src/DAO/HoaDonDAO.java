/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.HOADON;
import Model.SANPHAM;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;

public class HoaDonDAO implements DAOInterface<HOADON> {
    
    public static HoaDonDAO getInstance() {
        return new HoaDonDAO();
    }

    @Override
    public int insert(HOADON t) {
        throw new UnsupportedOperationException("Not supported yet.");
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
            String sql ="Select * From HOADON";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HOADON hoadon = new HOADON();
                hoadon.setMaHD(rs.getString("mahd"));
                hoadon.setMaNV(rs.getString("manv"));
                hoadon.setNgayHD(rs.getDate("ngayhd"));
                hoadon.setMaKH(rs.getString("makh"));
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

