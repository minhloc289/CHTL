/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

/**
 *
 * @author NK
 */
public class TableHoaDon extends JTable{
    public TableHoaDon () {
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent(JTable jtable,Object o,boolean bnl,boolean bln1,int i, int i1){
            TableHeader header= new TableHeader(o+"");
            if(i1==4){
                header.setHorizontalAlignment(JLabel.CENTER);
            }
            return header;
        }
    });
       
    }
   
    public void fixTable(JScrollPane scroll){
        scroll.getViewport().setBackground(Color.white);
        scroll.setVerticalScrollBar(new scrollbar.ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5,10,5,10));
    }
  
}
