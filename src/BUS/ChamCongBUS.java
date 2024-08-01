package BUS;

import DAO.ChamCongDAO;
import Model.CHAMCONG;
import java.util.ArrayList;

public class ChamCongBUS {
    private ChamCongDAO ccdao;

    public ChamCongBUS(){
        ccdao = ChamCongDAO.getInstance();
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

    public int update(CHAMCONG t){
        return ccdao.update(t);
    }
}
