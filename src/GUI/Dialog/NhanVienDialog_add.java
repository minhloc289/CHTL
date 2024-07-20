/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Dialog;

import BUS.KhuyenMaiBUS;
import BUS.NhanVienBUS;


import Model.KHUYENMAI;
import Model.NHANVIEN;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class NhanVienDialog_add extends javax.swing.JDialog {


    public NhanVienDialog_add() {
        //super(parent, modal);
        initComponents();
        this.setSize(new Dimension(500, 800));
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlHeader = new javax.swing.JPanel();
        jlblHeader = new javax.swing.JLabel();
        panelRound1 = new table.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldTenNV = new javax.swing.JTextField();
        textFieldNgaySinh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textFieldDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldNgaySDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldMK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 710));
        setResizable(false);

        jPnlHeader.setPreferredSize(new java.awt.Dimension(400, 60));
        jPnlHeader.setLayout(new java.awt.BorderLayout());

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("THÊM KHÁCH HÀNG");
        jlblHeader.setPreferredSize(new java.awt.Dimension(400, 50));
        jPnlHeader.add(jlblHeader, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPnlHeader, java.awt.BorderLayout.NORTH);

        panelRound1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel1.setText("Tên nhân viên");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel2.setText("Ngày sinh");

        textFieldTenNV.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTenNVActionPerformed(evt);
            }
        });

        textFieldNgaySinh.setPreferredSize(new java.awt.Dimension(200, 34));
        textFieldNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNgaySinhActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm nhân viên");
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

        textFieldDiaChi.setPreferredSize(new java.awt.Dimension(200, 34));
        textFieldDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDiaChiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel4.setText("Địa chỉ");

        textFieldNgaySDT.setPreferredSize(new java.awt.Dimension(200, 34));
        textFieldNgaySDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNgaySDTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel5.setText("Số điện thoại");

        textFieldLuong.setPreferredSize(new java.awt.Dimension(200, 34));
        textFieldLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLuongActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel6.setText("Lương");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel7.setText("Mật khẩu");

        textFieldMK.setPreferredSize(new java.awt.Dimension(200, 34));
        textFieldMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMKActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel3.setText("Giới tính");

        jComboBox1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 34));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(textFieldMK, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(textFieldLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                        .addComponent(textFieldNgaySDT, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(textFieldDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(textFieldTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNgaySDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTenNVActionPerformed

    private void textFieldNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNgaySinhActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textFieldDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDiaChiActionPerformed

    private void textFieldNgaySDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNgaySDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNgaySDTActionPerformed

    private void textFieldLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLuongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      NhanVienBUS nvbus= new NhanVienBUS();
        NHANVIEN nv = new NHANVIEN();
        String tenNV=textFieldTenNV.getText();
        String gioiTinh = (String) jComboBox1.getSelectedItem();
        String ngaySinh =textFieldNgaySinh.getText();
        String diaChi =textFieldDiaChi.getText();
        String sdt = textFieldNgaySDT.getText();
        String luong = textFieldLuong.getText();
        String password = textFieldMK.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        float floatLuong;
        
        if(tenNV.isEmpty() || ngaySinh.isEmpty() || diaChi.isEmpty() || sdt.isEmpty() || luong.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin đầy đủ.", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
            if (tenNV.isEmpty()) {
                highlightField(textFieldTenNV);
            } else if(!tenNV.isEmpty()){
                           rehighlightField(textFieldTenNV);
                        if (ngaySinh.isEmpty()) {
                                highlightField(textFieldNgaySinh);
                        } else if(!ngaySinh.isEmpty()){
                                     rehighlightField(textFieldNgaySinh);
                                if (diaChi.isEmpty()) {
                                    highlightField(textFieldDiaChi);
                                } else if(!diaChi.isEmpty()){
                                    rehighlightField(textFieldDiaChi);
                                    if (sdt.isEmpty()){
                                        highlightField(textFieldNgaySDT);
                                    } else if (!sdt.isEmpty()){
                                        rehighlightField(textFieldNgaySDT);
                                        if (luong.isEmpty()) {
                                            highlightField(textFieldLuong);
                                        } else if (!luong.isEmpty()){
                                            rehighlightField(textFieldLuong);
                                            if (password.isEmpty()) {
                                                highlightField(textFieldMK);
                                            } else if (!password.isEmpty()){
                                                rehighlightField(textFieldMK);
                                            }
                                            }
                                        }
                                    }  
                            }
                        }
                    }
        else {
            try {
            floatLuong = Float.parseFloat(luong);
           } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, " Lương không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        };
        
          try {
        LocalDate date1 = LocalDate.parse(ngaySinh, formatter);
        nv.setNgaySinh(date1);
         } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Ngày không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
          nv.setGioiTinh(gioiTinh);
          nv.setTenNV(tenNV);
          nv.setDiaChi(diaChi);
          nv.setSdt(sdt);
          nv.setLuong(floatLuong);
          nv.setPassword(password);
          
       int errorCode= nvbus.insert(nv);
        if (productAddedListener != null) {
                    productAddedListener.onProductAdded();
                }

                 if (errorCode == 20001){
                        JOptionPane.showMessageDialog(null, "Ngày sinh phải bé hơn ngày hiện tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                 }else{
                             dispose();

                 }
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFieldMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMKActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    /**
    
    
    
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(KhuyenMaiDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KhuyenMaiDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KhuyenMaiDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KhuyenMaiDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>

//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                KhuyenMaiDialog_add dialog = new KhuyenMaiDialog_add(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JLabel jlblHeader;
    private table.PanelRound panelRound1;
    private javax.swing.JTextField textFieldDiaChi;
    private javax.swing.JTextField textFieldLuong;
    private javax.swing.JTextField textFieldMK;
    private javax.swing.JTextField textFieldNgaySDT;
    private javax.swing.JTextField textFieldNgaySinh;
    private javax.swing.JTextField textFieldTenNV;
    // End of variables declaration//GEN-END:variables
}
