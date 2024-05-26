/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhuyenMaiDAO;
import Model.KHUYENMAI;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class KhuyenMaiBUS {
    private KhuyenMaiDAO kmdao;
    public KhuyenMaiBUS(){
        kmdao = new KhuyenMaiDAO();
    }
    public ArrayList<KHUYENMAI> selectAll(KHUYENMAI t){
        return kmdao.selectAll(t);
    }
    
    public int insert (KHUYENMAI t ) {
        return kmdao.insert(t);
    }
    public int delete(KHUYENMAI t){
        return kmdao.delete(t);
    }
    public int update(KHUYENMAI t){
        return kmdao.update(t);
    }
}
