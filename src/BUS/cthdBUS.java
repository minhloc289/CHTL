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
}
