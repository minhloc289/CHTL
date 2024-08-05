/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Dialog;

import BUS.ChamCongBUS;
import Model.CHAMCONG;
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
import GUI.NhanVien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author admin
 */
public class ChamCongDialog_add extends javax.swing.JDialog {
    private JTextField maNVField;
    private boolean isCheckedIn=true;
     private NhanVien parentPanel;

    public ChamCongDialog_add(NhanVien parent) {
        this.parentPanel = parent;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlHeader = new javax.swing.JPanel();
        jlblHeader = new javax.swing.JLabel();
        panelRound1 = new table.PanelRound();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPnlHeader.setPreferredSize(new java.awt.Dimension(400, 60));
        jPnlHeader.setLayout(new java.awt.BorderLayout());

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("CHẤM CÔNG");
        jlblHeader.setPreferredSize(new java.awt.Dimension(400, 50));
        jPnlHeader.add(jlblHeader, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPnlHeader, java.awt.BorderLayout.NORTH);

        panelRound1.setPreferredSize(new java.awt.Dimension(500, 375));

        checkInButton.setText("Check in");
        checkInButton.setPreferredSize(new java.awt.Dimension(150, 40));
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("Check Out");
        checkOutButton.setPreferredSize(new java.awt.Dimension(150, 40));
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        
        ChamCongBUS chamCongBUS = new ChamCongBUS();
        CHAMCONG chamCong = chamCongBUS.selectbyID(NhanVien.getmaNV);

        // Kiểm tra nếu chưa check-in thì không cho check-out
        if (chamCong == null || chamCong.getCheckInTime() == null) {
            JOptionPane.showMessageDialog(this, "Chưa check-in!");
            return;
        }

        // Kiểm tra nếu đã check-out thì không cho check-out lại
        if (!parentPanel.getArrayList().contains(NhanVien.getmaNV)) {
            JOptionPane.showMessageDialog(this, "Đã check-out rồi.");
            return;
        }

        // Tính số giờ làm
        LocalDateTime checkInTime = chamCong.getCheckInTime();
        LocalDateTime checkOutTime = LocalDateTime.now();
        long hoursWorked = java.time.Duration.between(checkInTime, checkOutTime).toHours();

        // Cập nhật thông tin chấm công với thời gian check-out và số giờ làm
        chamCong.setCheckOutTime(checkOutTime);
        chamCong.setSoGioLam((int) hoursWorked);

        int result = chamCongBUS.update(chamCong);
        if (result > 0) {
            isCheckedIn = true;
            parentPanel.removeNV(NhanVien.getmaNV);
            JOptionPane.showMessageDialog(this, "Check-out thành công!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi check-out.");
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed

       if (parentPanel.getArrayList().contains(NhanVien.getmaNV)) {
            JOptionPane.showMessageDialog(this, "Nhân viên này đã check-in rồi!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            // Proceed with the check-in
            // Tạo đối tượng chấm công với thời gian check-in
            ChamCongBUS chamCongBUS = new ChamCongBUS();
            CHAMCONG newChamCong = new CHAMCONG();
            newChamCong.setMaNV(NhanVien.getmaNV);
            newChamCong.setNgayCC(LocalDateTime.now().toLocalDate());
            newChamCong.setCheckInTime(LocalDateTime.now());
            newChamCong.setCheckOutTime(null); // Chưa check-out nên để null
            newChamCong.setSoGioLam(0); // Chưa tính số giờ làm

            int result = chamCongBUS.insert(newChamCong);
            parentPanel.addMaNV(NhanVien.getmaNV);  // Add employee ID to the list after successful check-in
            JOptionPane.showMessageDialog(this, "Check-in thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();  // Close the dialog after successful check-in
        }
    }//GEN-LAST:event_checkInButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(KhachHangDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KhachHangDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KhachHangDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KhachHangDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                KhachHangDialog_add dialog = new KhachHangDialog_add(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JLabel jlblHeader;
    private table.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
