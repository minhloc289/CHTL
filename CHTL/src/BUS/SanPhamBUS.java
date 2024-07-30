/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.SanPhamDAO;
import Model.SANPHAM;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SanPhamBUS {
    private SanPhamDAO sanpham;
    SanPhamDAO spdao= new SanPhamDAO();
    public SanPhamBUS(){
        sanpham = new SanPhamDAO();
    }
     public ArrayList<SANPHAM> selectAll(SANPHAM t){
         return sanpham.selectAll(t);
     }
     public int insert(SANPHAM t){
       return spdao.insert(t);
     }
     public int delete(SANPHAM t){
         return spdao.delete(t);
     }
     public int update(SANPHAM t){
         return spdao.update(t);
     }
}


