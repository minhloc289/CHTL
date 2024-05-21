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

public class DoanhThuDAO implements DAOInterface<DOANHTHU> {
    
    public static DoanhThuDAO getInstance() {
        return new DoanhThuDAO();
    }

    @Override
    public int insert(DOANHTHU t) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DOANHTHU selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

