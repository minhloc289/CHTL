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
}
