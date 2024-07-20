/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhapHangDAO;
import Model.NHAPHANG;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NhapHangBUS {
    private NhapHangDAO nhdao;
    public NhapHangBUS(){
        nhdao = new NhapHangDAO();
    }
    public ArrayList<NHAPHANG> selectAll (NHAPHANG t){
        return nhdao.selectAll(t);
    }
    public int insert (NHAPHANG t) {
        return nhdao.insert(t);
    }
    
    public boolean productExists (String maSP){
        return nhdao.productExists(maSP);
    }
}
