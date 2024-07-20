/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Dialog;

import BUS.KhuyenMaiBUS;

import Model.KHUYENMAI;
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
public class KhuyenMaiDialog_add extends javax.swing.JDialog {


    public KhuyenMaiDialog_add() {
        //super(parent, modal);
        initComponents();
        this.setSize(new Dimension(500, 600));
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
        textFieldTenKM = new javax.swing.JTextField();
        textFieldMaSP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textFieldCK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldNgayBD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldNgayKT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPnlHeader.setPreferredSize(new java.awt.Dimension(400, 60));
        jPnlHeader.setLayout(new java.awt.BorderLayout());

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("THÊM KHÁCH HÀNG");
        jlblHeader.setPreferredSize(new java.awt.Dimension(400, 50));
        jPnlHeader.add(jlblHeader, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPnlHeader, java.awt.BorderLayout.NORTH);

        panelRound1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel1.setText("Tên khuyến mại");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        textFieldTenKM.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldTenKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTenKMActionPerformed(evt);
            }
        });

        textFieldMaSP.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMaSPActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm khuyến mãi");
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

        textFieldCK.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCKActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel4.setText("Chiết khấu");

        textFieldNgayBD.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldNgayBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNgayBDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel5.setText("Ngày bắt đầu");

        textFieldNgayKT.setPreferredSize(new java.awt.Dimension(200, 40));
        textFieldNgayKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNgayKTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel6.setText("Ngày kết thúc");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(textFieldNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldCK, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(textFieldTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(textFieldMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(textFieldCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(textFieldNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(textFieldNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelRound1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldTenKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTenKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTenKMActionPerformed

    private void textFieldMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMaSPActionPerformed
        // TODO add your hand090ling code here:
    }//GEN-LAST:event_textFieldMaSPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textFieldCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCKActionPerformed

    private void textFieldNgayBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNgayBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNgayBDActionPerformed

    private void textFieldNgayKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNgayKTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNgayKTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       KhuyenMaiBUS kmbus = new KhuyenMaiBUS();
    String tenKM = textFieldTenKM.getText();
    String maSP = textFieldMaSP.getText();
    String chietKhau = textFieldCK.getText();
    String ngayBD = textFieldNgayBD.getText();
    String ngayKT = textFieldNgayKT.getText();
    KHUYENMAI km = new KHUYENMAI();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    float chietKhauFloat;

if (tenKM.isEmpty() || maSP.isEmpty() || chietKhau.isEmpty() || ngayBD.isEmpty() || ngayKT.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin.", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
            if (tenKM.isEmpty()) {
                highlightField(textFieldTenKM);
            } else if(!tenKM.isEmpty()){
                           rehighlightField(textFieldTenKM);
                        if (maSP.isEmpty()) {
                                highlightField(textFieldMaSP);
                        } else if(!maSP.isEmpty()){
                                     rehighlightField(textFieldMaSP);
                                if (chietKhau.isEmpty()) {
                                    highlightField(textFieldCK);
                                } else if(!chietKhau.isEmpty()){
                                    rehighlightField(textFieldCK);
                                    if (ngayBD.isEmpty()){
                                        highlightField(textFieldNgayBD);
                                    } else if (!ngayBD.isEmpty()){
                                        rehighlightField(textFieldNgayBD);
                                        if (ngayKT.isEmpty()) {
                                            highlightField(textFieldNgayKT);
                                        } else if (!ngayKT.isEmpty()){
                                            rehighlightField(textFieldNgayKT);
                                        }
                                    }  
                            }
                        }
                    }
        }
        else {
        try {
        chietKhauFloat = Float.parseFloat(chietKhau);
           } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Chiết khấu không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        };
        
       

        try {
        LocalDate date1 = LocalDate.parse(ngayBD, formatter);
        km.setNgayBD(date1);
        LocalDate date2 = LocalDate.parse(ngayKT, formatter);
        km.setNgayKT(date2);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Ngày không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
        km.setCtkm(tenKM);
        km.setMaSP(maSP);
        km.setChietKhau(chietKhauFloat);

        }
 
        
        int errorCode = kmbus.insert(km);
        if (productAddedListener != null) {
                    productAddedListener.onProductAdded();
                }
       switch (errorCode) {
        case 20001:
            JOptionPane.showMessageDialog(null, "Thông tin khuyến mãi không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            break;
        case 20002:
            JOptionPane.showMessageDialog(null, "Lỗi: Ngày kết thúc phải lớn hơn ngày hiện tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            break;
        case 20003:
            JOptionPane.showMessageDialog(null, "Lỗi: Ngày kết thúc phải lớn hơn ngày bắt đầu", "Thông báo", JOptionPane.ERROR_MESSAGE);
            break;
        case 2291:
            JOptionPane.showMessageDialog(null, "Lỗi: Không tìm thấy mã sản phẩm phù hợp", "Thông báo", JOptionPane.ERROR_MESSAGE);
            break;
        case 2290:
             JOptionPane.showMessageDialog(null, "Lỗi: Chiết khấu không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            break;
        default:
            dispose();
            break;
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void highlightOrRehighlightField(JTextField field, boolean highlight) {
    if (highlight) {
        highlightField(field);
    } else {
        rehighlightField(field);
    }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JLabel jlblHeader;
    private table.PanelRound panelRound1;
    private javax.swing.JTextField textFieldCK;
    private javax.swing.JTextField textFieldMaSP;
    private javax.swing.JTextField textFieldNgayBD;
    private javax.swing.JTextField textFieldNgayKT;
    private javax.swing.JTextField textFieldTenKM;
    // End of variables declaration//GEN-END:variables
}
