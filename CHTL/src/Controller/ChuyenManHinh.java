/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bean.DanhMuc;
import GUI.ChotCa;
import GUI.DangKy;
import GUI.HoaDon;
import GUI.KhachHang;
import GUI.KhoHang;
import GUI.KhuyenMai;
import GUI.NhanVien;
import GUI.SanPham;
import GUI.ThongKe;
import GUI.TrangChu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.RootPaneUI;
import org.w3c.dom.Node;

/**
 *
 * @author NK
 */
public class ChuyenManHinh {
    private JPanel root;
    private String kindSelected="";
    private List<DanhMuc> listItem= null;
    public ChuyenManHinh(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jblItem){
        kindSelected="TrangChu";
        jpnItem.setBackground(new Color(0, 204, 204));
        jblItem.setBackground(new Color(0, 204, 204));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu());
        root.validate();
        root.repaint();
    }
    public void setEvent(List<DanhMuc> listItem){
            this.listItem=listItem;
        for(DanhMuc item: listItem){
            item.getJlb().addMouseListener(new LableEnvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    class LableEnvent implements MouseListener{
        private JPanel node;
        
        private  String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LableEnvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node= new TrangChu();
                    break;
                case "HoaDon":
                    node = new HoaDon();
                    break;
                case "SanPham":
                    node = new SanPham();
                    break;
                case "KhuyenMai":
                    node = new KhuyenMai();
                    break;
                case "NhanVien":
                    node = new NhanVien();
                    break;
                case "ChotCa":
                    node = new ChotCa();
                    break;
                case "ThongKe":
                    node = new ThongKe();
                    break;
                case "KhachHang":
                    node = new KhachHang();
                    break;
                case "NhapHang":
                    node = new KhoHang();
                    break;
            }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
        setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected=kind;
            jpnItem.setBackground(new Color(187, 222, 251));
            jlbItem.setBackground(new Color(187, 222, 251));
                  
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(187, 222, 251));
            jlbItem.setBackground(new Color(187, 222, 251));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
            jpnItem.setBackground(Color.white);
            jlbItem.setBackground(Color.white);
            }
        }
        private  void setChangeBackground(String kind){
            for(DanhMuc item:listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(0,204,204));
                item.getJlb().setBackground(new Color(0,204,204));
                }
                else{
                    item.getJpn().setBackground(Color.white);
                    item.getJlb().setBackground(Color.white);
                }
            }
            
        }
        
    }
}
