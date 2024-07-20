/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhachHangDAO;
import Model.KHACHHANG;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhachHangBUS {
    private KhachHangDAO khdao;
    public KhachHangBUS(){
        khdao = new KhachHangDAO();
    }
    public ArrayList<KHACHHANG> selectAll(KHACHHANG t){
        return khdao.selectAll(t);
    }
    public int insert(KHACHHANG t){
        return khdao.insert(t);
    }
    public int update(KHACHHANG t){
        return khdao.update(t);
    }
}
