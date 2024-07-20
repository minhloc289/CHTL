/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DoanhThuDAO;
import Model.DOANHTHU;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DoanhThuBUS {
    private DoanhThuDAO dtDAO;
    public DoanhThuBUS(){
        dtDAO = new DoanhThuDAO();
    }
    public ArrayList<DOANHTHU> selectAll(DOANHTHU t){
        return dtDAO.selectAll(t);
    }
    public int insert (DOANHTHU t){
        return dtDAO.insert(t);
    }
}
