/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import Model.NHAPHANG;
import java.util.ArrayList;
import database.JDBC;
import java.sql.*;

public class NhapHangDAO implements DAOInterface<NHAPHANG> {
    
    public static NhapHangDAO getInstance() {
        return new NhapHangDAO();
    }

    @Override
    public int insert(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<NHAPHANG> selectAll(NHAPHANG t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NHAPHANG selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

