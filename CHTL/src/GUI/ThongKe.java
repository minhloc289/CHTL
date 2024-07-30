/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Model.ModelThongKe;
import database.JDBC;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import raven.chart.ModelChart;


/**
 *
 * @author NK
 */
public class ThongKe extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
        initComponents();
        curveLineChart1.setTitle("Chart Data");
        curveLineChart1.addLegend("Amount", Color.decode("#7b4397"), Color.decode("#dc2430"));
        curveLineChart1.addLegend("Cost", Color.decode("#e65c00"), Color.decode("#F9D423"));
        columnchart2.setTitle("Chart Data");
        columnchart2.addLegend("Cost", Color.decode("#e65c00"), Color.decode("#F9D423"));
        loaddatacbb();
        setDatacolumn();
    }
    
    
 public void loaddatacbb(){
        try{
            Connection con = JDBC.getConnection();
            String query ="SELECT DISTINCT TENSP FROM SANPHAM WHERE ISDELETED =0";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet=statement.executeQuery();
            ArrayList<String> dataList = new ArrayList<>();

            while (resultSet.next()) {
                String data = resultSet.getString("TENSP");
                if(!data.equals("No Specific Product")){
                dataList.add(data);
                }
            }
            for (String s: dataList){
                jComboBox1.addItem(s);
            }
            jComboBox1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setData(); // Cập nhật dữ liệu khi combobox thay đổi
                }
            });

        } catch(Exception e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void setData(){
        try {
            List<Model.ModelThongKe> list= new ArrayList<>();
            Connection con = JDBC.getConnection();
            String tensp= (String) jComboBox1.getSelectedItem(); // Lấy tên sản phẩm từ combobox
            String sql = "SELECT TO_CHAR(NGAYHD, 'YYYY-MM') AS THANG,sanpham.tensp, SUM(SL) AS SOLUONG, SUM(TRIGIA) AS TONG_TRIGIA  FROM CTHD JOIN HOADON ON CTHD.MAHD = HOADON.MAHD JOIN sanpham ON cthd.masp = sanpham.masp where tensp=?  GROUP BY TO_CHAR(NGAYHD, 'YYYY-MM'), tensp ORDER BY THANG"; 
                           
            PreparedStatement stat= con.prepareStatement(sql);
            stat.setString(1, tensp); // Sử dụng tên sản phẩm từ combobox
            ResultSet rs= stat.executeQuery();
            while(rs.next()){
                String month = rs.getString("THANG");
                double amount = rs.getDouble("SOLUONG");
                double cost = rs.getDouble("TONG_TRIGIA");
                list.add(new ModelThongKe(month,amount,cost));
            }
            rs.close();
            stat.close();
            
            int listSize = list.size();
            if(listSize < 2){
                JOptionPane.showMessageDialog(null, "Không đủ dữ liệu để vẽ biểu đồ");
            }else{
                curveLineChart1.clear(); // Xóa dữ liệu trên biểu đồ
                for(int i = 0; i <listSize; i++){
                    ModelThongKe d = list.get(i);
                    curveLineChart1.addData(new ModelChart(d.getMonth(), new double[]{d.getAmount(), d.getCost()}));
                }

            curveLineChart1.start();
            }
        } catch (Exception e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void setDatacolumn(){
        try {
            List<Model.ModelThongKe> list= new ArrayList<>();
            Connection con = JDBC.getConnection();
            String sql = "SELECT TO_CHAR(NGAYHD, 'YYYY-MM') AS THANG, SUM(TRIGIA) AS TONG_TRIGIA  FROM CTHD JOIN HOADON ON CTHD.MAHD = HOADON.MAHD JOIN sanpham ON cthd.masp = sanpham.masp  GROUP BY TO_CHAR(NGAYHD, 'YYYY-MM') ORDER BY THANG";        
            PreparedStatement stat= con.prepareStatement(sql);

            ResultSet rs= stat.executeQuery();
            while(rs.next()){
                String month = rs.getString("THANG");
                double cost = rs.getDouble("TONG_TRIGIA");
                list.add(new ModelThongKe(month,cost));
            }
            rs.close();
            stat.close();
            columnchart2.clear();
            int listSize = list.size();
                for(int i = 0; i <listSize; i++){
                    ModelThongKe d = list.get(i);
                    columnchart2.addData(new ModelChart(d.getMonth(), new double[]{d.getCost()}));
                }
            columnchart2.start();
        } catch (Exception e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new raven.panel.PanelShadow();
        curveLineChart1 = new raven.chart.CurveLineChart();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelShadow2 = new raven.panel.PanelShadow();
        columnchart2 = new raven.chart.Columnchart();

        panelShadow1.setBackground(new java.awt.Color(34, 59, 69));
        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelShadow1.setColorGradient(new java.awt.Color(17, 38, 47));

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickcbb(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(curveLineChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(curveLineChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(columnchart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(columnchart2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clickcbb(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickcbb
        // TODO add your handling code here:

    }//GEN-LAST:event_clickcbb

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.chart.Columnchart columnchart2;
    private raven.chart.CurveLineChart curveLineChart1;
    private javax.swing.JComboBox<String> jComboBox1;
    private raven.panel.PanelShadow panelShadow1;
    private raven.panel.PanelShadow panelShadow2;
    // End of variables declaration//GEN-END:variables
}
