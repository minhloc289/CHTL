/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Dialog;

import BUS.SanPhamBUS;
import Model.SANPHAM;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class SanPhamDialog_add extends javax.swing.JDialog {

    public SanPhamDialog_add() {
        //super(parent, modal);
        initComponents();
        this.setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(0, 0));
        
        jPnlHeader.setBackground(new Color(22, 122, 198));
        jPnlHeader.setPreferredSize(new Dimension(400, 60));
        jlblHeader.setFont(new Font(FlatRobotoFont.FAMILY, 1, 18));
        jlblHeader.setForeground(new Color(255, 255, 255));
        jlblHeader.setHorizontalAlignment(JLabel.CENTER);
        jlblHeader.setText("THÊM");
        jlblHeader.setPreferredSize(new Dimension(400, 50));
        
        
        jButton1.putClientProperty("JButton.buttonType", "roundRect");
        jButton1.putClientProperty("JButton.buttonType", "borderless");
        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jButton1.setFont(new java.awt.Font(FlatRobotoFont.FAMILY, 0, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new Dimension(150, 40));
        
        jButton2.putClientProperty("JButton.buttonType", "roundRect");
        jButton2.putClientProperty("JButton.buttonType", "borderless");
        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jButton2.setFont(new java.awt.Font(FlatRobotoFont.FAMILY, 0, 14));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new Dimension(150, 40));
    }

    
    public interface OnProductAddedListener {
        void onProductAdded();
    }

    private OnProductAddedListener productAddedListener;

    public void setOnProductAddedListener(OnProductAddedListener listener) {
        this.productAddedListener = listener;
    }
    private void highlightField(JTextField field) {
        field.requestFocus();
        field.setBackground(Color.YELLOW);
    }
    private void rehighlightField(JTextField field) {
        field.setBackground(Color.white);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlHeader = new javax.swing.JPanel();
        jlblHeader = new javax.swing.JLabel();
        panelRound1 = new table.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFiedTenSP = new javax.swing.JTextField();
        textFieldGiaNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textFieldGiaBan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPnlHeader.setPreferredSize(new java.awt.Dimension(400, 60));
        jPnlHeader.setLayout(new java.awt.BorderLayout());

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setPreferredSize(new java.awt.Dimension(400, 50));
        jPnlHeader.add(jlblHeader, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPnlHeader, java.awt.BorderLayout.NORTH);

        panelRound1.setPreferredSize(new java.awt.Dimension(500, 375));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel1.setText("Tên sản phẩm");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel2.setText("Giá nhập");

        textFiedTenSP.setPreferredSize(new java.awt.Dimension(200, 40));
        textFiedTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiedTenSPActionPerformed(evt);
            }
        });

        textFieldGiaNhap.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldGiaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldGiaNhapActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel3.setText("Đơn vị tính");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cai", "Goi", "Hop", "Chai", "Lon", "Tui", "Thanh" }));

        jButton1.setText("Thêm sản phẩm");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textFieldGiaBan.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldGiaBanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel4.setText("Giá bán");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textFieldGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFiedTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFiedTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(panelRound1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFiedTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiedTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiedTenSPActionPerformed

    private void textFieldGiaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldGiaNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldGiaNhapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textFieldGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldGiaBanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         SanPhamBUS spBUS= new SanPhamBUS();
        SANPHAM sp = new SANPHAM();
String tensp = textFiedTenSP.getText();
String dvt = (String) jComboBox1.getSelectedItem();
String gianhap = textFieldGiaNhap.getText();
String giaban = textFieldGiaBan.getText();

if (tensp.isEmpty() || dvt.isEmpty() || gianhap.isEmpty() || giaban.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin đầy đủ.", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
    
        if (tensp.isEmpty()) {
                highlightField(textFiedTenSP);
            }else if(!tensp.isEmpty()){
                rehighlightField(textFiedTenSP);
                            if (giaban.isEmpty()) {
                        highlightField(textFieldGiaNhap);
                        }else if(!giaban.isEmpty()){
                        rehighlightField(textFieldGiaNhap);
                                    if (gianhap.isEmpty()) {
                                    highlightField(textFieldGiaBan);
                                    }else if(!gianhap.isEmpty()){
                                    rehighlightField(textFieldGiaBan);
                            }
                        }
                    }
    } else {
        try {
            float gncheck = Float.parseFloat(gianhap);
            sp.setGiaNhap(gncheck);
            rehighlightField(textFieldGiaNhap);
            try {
            float gbcheck = Float.parseFloat(giaban);
            sp.setGiaBan(gbcheck);
            rehighlightField(textFieldGiaBan);

                sp.setTenSP(tensp);
                    sp.setDvt(dvt);

                    int errorCode = spBUS.insert(sp);
                if (productAddedListener != null) {
                    productAddedListener.onProductAdded();
                }

                 if (errorCode == 20001){
                        JOptionPane.showMessageDialog(null, "Gia ban phai lon hon gia nhap", "Thông báo", JOptionPane.ERROR_MESSAGE);
                 }else{
                             dispose();

                 }                
                 

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Giá bán không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                highlightField(textFieldGiaBan);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Giá nhập không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            highlightField(textFieldGiaNhap);
        }

                    
}

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SanPhamDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SanPhamDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SanPhamDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SanPhamDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                SanPhamDialog_add dialog = new SanPhamDialog_add(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JLabel jlblHeader;
    private table.PanelRound panelRound1;
    private javax.swing.JTextField textFiedTenSP;
    private javax.swing.JTextField textFieldGiaBan;
    private javax.swing.JTextField textFieldGiaNhap;
    // End of variables declaration//GEN-END:variables
}
