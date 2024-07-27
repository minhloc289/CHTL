/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DoanhThuThangDAO;
import Model.DOANHTHUTHANG;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DoanhThuThangBUS {
    private DoanhThuThangDAO dttdao;

    public DoanhThuThangBUS() {
        dttdao = new DoanhThuThangDAO();
    }
    public int insert (DOANHTHUTHANG t){
        return dttdao.insert(t);
    }
    public ArrayList<DOANHTHUTHANG> selectAll(DOANHTHUTHANG t){
        return dttdao.selectAll(t);
    }
}
