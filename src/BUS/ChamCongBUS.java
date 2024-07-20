/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChamCongDAO;
import Model.CHAMCONG;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChamCongBUS {
    private ChamCongDAO ccdao;
    public ChamCongBUS(){
        ccdao = new ChamCongDAO();
    }
    public ArrayList<CHAMCONG> selectAll (CHAMCONG t){
        return ccdao.selectAll(t);
    }
    public CHAMCONG selectbyID (String t){
        return ccdao.selectbyID(t);
    }
    public int insert(CHAMCONG t){
       return ccdao.insert(t);
    }
}
