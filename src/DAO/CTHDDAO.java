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

public class CTHDDAO  {
    
    public static CTHDDAO getInstance() {
        return new CTHDDAO();
    }

    
    public int insert(CTHD t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public int delete(CTHD t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public int update(CTHD t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<CTHD_temp> selectAll(CTHD_temp t) {
        ArrayList<CTHD_temp> cthd = new ArrayList<CTHD_temp>();
        try {
            Connection con = JDBC.getConnection();
            String sql ="Select MAHD,MASP,MAKM,SL,TRIGIA From CTHD";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CTHD_temp sp_rec = new CTHD_temp();
                sp_rec.setMaHD(rs.getString("mahd"));
                sp_rec.setMaSP(rs.getString("masp"));
                sp_rec.setMaKM(rs.getString("makm"));
                sp_rec.setSL(rs.getInt("SL"));
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

   
    public CTHD selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

