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

public class ChamCongDAO implements DAOInterface<CHAMCONG> {
    
    public static ChamCongDAO getInstance() {
        return new ChamCongDAO();
    }

    @Override
    public int insert(CHAMCONG t) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CHAMCONG selectbyID(String T) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

