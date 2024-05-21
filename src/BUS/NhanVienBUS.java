/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVienDAO;
import Model.NHANVIEN;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NhanVienBUS {
    private NhanVienDAO nvdao;
    public NhanVienBUS(){
        nvdao = new NhanVienDAO();
    }
    public ArrayList<NHANVIEN> selectAll(NHANVIEN t){
        return nvdao.selectAll(t);
    }
}
