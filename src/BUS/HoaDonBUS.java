/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HoaDonDAO;
import Model.HOADON;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDonBUS {
    private HoaDonDAO hdDAO;
    public HoaDonBUS(){
        hdDAO = new HoaDonDAO();
    }
    public ArrayList<HOADON> selectAll(HOADON t){
        return hdDAO.selectAll(t);
    }
}
