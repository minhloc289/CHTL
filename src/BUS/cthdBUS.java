/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTHDDAO;
import Model.CTHD;
import Model.CTHD_temp;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class cthdBUS {
    private CTHDDAO cthddao;
    public cthdBUS(){
        cthddao = new CTHDDAO();
    }
    public ArrayList<CTHD_temp> selectAll(CTHD_temp c){
        return cthddao.selectAll(c);
    }
    public ArrayList<Float> getInfCTHD(String maSp,String maKh,int sl){
        return cthddao.getInfCTHD(maSp,maKh, sl);
    }
    public int update_tongDT(String mahd,float triGia){
      return cthddao.updateTongHoaDon(mahd, triGia);
   }
   public String getNewMaHD(){
       return cthddao.getNewMaHD();
   }
   public int insert (CTHD c){
       return cthddao.insert(c);
   }
   public int delete(String mahd){
       return cthddao.delete(mahd);
   }
   public String getMakm(String masp){
       return cthddao.getMakm(masp);
   }
   
}
