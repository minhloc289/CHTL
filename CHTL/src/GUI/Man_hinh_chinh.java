/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Bean.DanhMuc;
import Controller.ChuyenManHinh;
import GUI.Dialog.HoaDonDialog_add;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.URL;
import java.util.ArrayList;
import  java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author NK
 */
public class Man_hinh_chinh extends javax.swing.JFrame {

           List<DanhMuc> listItem= new ArrayList<>();

    public Man_hinh_chinh() throws UnsupportedLookAndFeelException{
        initComponents();
        setSize(1100, 670);
        this.setTitle("Hệ thống quản lí cửa hàng tiện lợi");
        // Đặt kích thước cố định cho JFrame
        setResizable(true);
        // Thiết lập hành động mặc định khi đóng cửa sổ
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Trung tâm JFrame trên màn hình
        setLocationRelativeTo(null);
        
        FlatRobotoFont.install();
        FlatLaf.setPreferredFontFamily(FlatRobotoFont.FAMILY);
        FlatLaf.setPreferredLightFontFamily(FlatRobotoFont.FAMILY_LIGHT);
        FlatLaf.setPreferredSemiboldFontFamily(FlatRobotoFont.FAMILY_SEMIBOLD);
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        UIManager.put("Table.showVerticalLines", false);
        UIManager.put("Table.showHorizontalLines", true);
        UIManager.put("TextComponent.arc", 5);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
        UIManager.put("Button.iconTextGap", 10);
        UIManager.put("PasswordField.showRevealButton", true);
        UIManager.put("Table.selectionBackground", new Color(240, 247, 250));
        UIManager.put("Table.selectionForeground", new Color(0, 0, 0));
        UIManager.put("Table.scrollPaneBorder", new EmptyBorder(0, 0, 0, 0));
        UIManager.put("Table.rowHeight", 40);
        UIManager.put("TabbedPane.selectedBackground", Color.white);
        UIManager.put("TableHeader.height", 40);
        UIManager.put("TableHeader.font", UIManager.getFont("h4.font"));
        UIManager.put("TableHeader.background", new Color(242, 242, 242));
        
        UIManager.put("TableHeader.separatorColor", new Color(151, 151, 151));
        UIManager.put("TableHeader.bottomSeparatorColor", new Color(242, 242, 242));
        
        jPanelMenu.putClientProperty("FlatLaf.style", "font: 145% $medium.font");
       
        jScrollPane1 = new JScrollPane(jPnlCenter, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setBorder(new EmptyBorder(0, 0, 0, 0));
        jPanelMenu.add(jScrollPane1, BorderLayout.CENTER);
        
        ChuyenManHinh controller = new ChuyenManHinh(jPaneView);
        controller.setView(jPanelTrangChu, jLabelTrangChu);
        listItem.add(new DanhMuc("TrangChu",jPanelTrangChu,jLabelTrangChu));
        listItem.add(new DanhMuc("HoaDon",HoaDonjpn,HoaDonjlb));
        listItem.add(new DanhMuc("SanPham",SanPhanjpn,SanPhamjlb));
        listItem.add(new DanhMuc("KhuyenMai",KhuyenMaijpn,KhuyenMaijlb));
        listItem.add(new DanhMuc("ChotCa",ChotCajpn,ChotCajlb));
        listItem.add(new DanhMuc("KhachHang",KhachHangjpn,KhachHangjlb));
        listItem.add(new DanhMuc("NhapHang",KhoHangjpn,KhoHangjlb));
        checkuser(Login.LocalsdtNV);
        controller.setEvent(listItem);
    }
    
       public boolean checkuser(String user){
        if(!user.equals("0901234567")){
            NhanVienjlb.setBackground(new Color(204,204,204,240));
            NhanVienjlb.setForeground(new Color(204,204,204));
            ThongKejlb.setBackground(new Color(204,204,204,240));
            ThongKejlb.setForeground(new Color(204,204,204));
            JLabel jlb = new JLabel();
            JLabel jlb1 = new JLabel();
            URL iconURL = getClass().getResource("/thanh_phan_log/icon/icon/pass (1) (1).png");
            URL iconURL1 = getClass().getResource("/thanh_phan_log/icon/icon/pass (1) (1).png");

            ImageIcon icon = new ImageIcon(iconURL);
            ImageIcon icon1 = new ImageIcon(iconURL1);
            NhanVienjlb.setIcon(icon);
            ThongKejlb.setIcon(icon);
            return false;
    }
        else{
        listItem.add(new DanhMuc("NhanVien", NhanVienjpn, NhanVienjlb));
        listItem.add(new DanhMuc("ThongKe",ThongKejpn,ThongKejlb)); 
            return true;
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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jPnlLogo = new javax.swing.JPanel();
        LOGOHW = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPnlDangXuat = new javax.swing.JPanel();
        DangXuatjlb = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPnlCenter = new javax.swing.JPanel();
        jPnlListMenu = new javax.swing.JPanel();
        jPanelTrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTrangChu = new javax.swing.JLabel();
        HoaDonjpn = new javax.swing.JPanel();
        HoaDonjlb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SanPhanjpn = new javax.swing.JPanel();
        SanPhamjlb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KhuyenMaijpn = new javax.swing.JPanel();
        KhuyenMaijlb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KhachHangjpn = new javax.swing.JPanel();
        KhachHangjlb = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NhanVienjpn = new javax.swing.JPanel();
        NhanVienjlb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ChotCajpn = new javax.swing.JPanel();
        ChotCajlb = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ThongKejpn = new javax.swing.JPanel();
        ThongKejlb = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        KhoHangjpn = new javax.swing.JPanel();
        KhoHangjlb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TEST = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPaneView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thanh_phan_log/icon/icon/house (1).png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(null);

        jToggleButton1.setText("jToggleButton1");

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lí cửa hàng tiện lợi");

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(250, 1400));
        jPanelMenu.setLayout(new java.awt.BorderLayout());

        jPnlLogo.setBackground(new java.awt.Color(255, 255, 255));
        jPnlLogo.setPreferredSize(new java.awt.Dimension(250, 100));
        jPnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGOHW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logooo.png"))); // NOI18N
        LOGOHW.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LOGOHW.setPreferredSize(new java.awt.Dimension(130, 130));
        LOGOHW.setVerifyInputWhenFocusTarget(false);
        jPnlLogo.add(LOGOHW, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 249, 99));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPnlLogo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 0, -1, 99));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPnlLogo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 250, -1));

        jPanelMenu.add(jPnlLogo, java.awt.BorderLayout.NORTH);

        jPnlDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        jPnlDangXuat.setPreferredSize(new java.awt.Dimension(250, 50));
        jPnlDangXuat.setLayout(new java.awt.BorderLayout());

        DangXuatjlb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DangXuatjlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        DangXuatjlb.setText("Đăng Xuất");
        DangXuatjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DangXuatjlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatjlbMouseClicked(evt);
            }
        });
        jPnlDangXuat.add(DangXuatjlb, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPnlDangXuat.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPnlDangXuat.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanelMenu.add(jPnlDangXuat, java.awt.BorderLayout.SOUTH);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jPanelMenu.add(jPanel8, java.awt.BorderLayout.EAST);

        jPnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        jPnlCenter.setPreferredSize(new java.awt.Dimension(250, 583));
        jPnlCenter.setLayout(new java.awt.BorderLayout());

        jPnlListMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTrangChu.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanelTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-button.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanelTrangChu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTrangChu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTrangChu.setText("Trang Chủ");
        jLabelTrangChu.setAlignmentX(0.5F);
        jLabelTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelTrangChu.setIconTextGap(10);
        jLabelTrangChu.setPreferredSize(new java.awt.Dimension(200, 50));
        jLabelTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicktrangchu(evt);
            }
        });
        jPanelTrangChu.add(jLabelTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jPnlListMenu.add(jPanelTrangChu);

        HoaDonjpn.setBackground(new java.awt.Color(255, 255, 255));
        HoaDonjpn.setPreferredSize(new java.awt.Dimension(250, 50));
        HoaDonjpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HoaDonjlb.setBackground(new java.awt.Color(255, 255, 255));
        HoaDonjlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HoaDonjlb.setText("Hóa Đơn");
        HoaDonjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HoaDonjlb.setIconTextGap(10);
        HoaDonjlb.setPreferredSize(new java.awt.Dimension(200, 50));
        HoaDonjpn.add(HoaDonjlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checklist.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));
        HoaDonjpn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPnlListMenu.add(HoaDonjpn);

        SanPhanjpn.setBackground(new java.awt.Color(255, 255, 255));
        SanPhanjpn.setPreferredSize(new java.awt.Dimension(250, 50));
        SanPhanjpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SanPhamjlb.setBackground(new java.awt.Color(255, 255, 255));
        SanPhamjlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SanPhamjlb.setText("Sản Phẩm");
        SanPhamjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SanPhamjlb.setIconTextGap(10);
        SanPhamjlb.setPreferredSize(new java.awt.Dimension(200, 50));
        SanPhanjpn.add(SanPhamjlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));
        SanPhanjpn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, -1, -1));

        jPnlListMenu.add(SanPhanjpn);

        KhuyenMaijpn.setBackground(new java.awt.Color(255, 255, 255));
        KhuyenMaijpn.setPreferredSize(new java.awt.Dimension(250, 50));
        KhuyenMaijpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhuyenMaijlb.setBackground(new java.awt.Color(255, 255, 255));
        KhuyenMaijlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KhuyenMaijlb.setText("Khuyến Mại");
        KhuyenMaijlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KhuyenMaijlb.setIconTextGap(10);
        KhuyenMaijlb.setPreferredSize(new java.awt.Dimension(200, 50));
        KhuyenMaijpn.add(KhuyenMaijlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/offer.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        KhuyenMaijpn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(KhuyenMaijpn);

        KhachHangjpn.setBackground(new java.awt.Color(255, 255, 255));
        KhachHangjpn.setPreferredSize(new java.awt.Dimension(250, 50));
        KhachHangjpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhachHangjlb.setBackground(new java.awt.Color(255, 255, 255));
        KhachHangjlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KhachHangjlb.setText("Khách Hàng");
        KhachHangjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KhachHangjlb.setIconTextGap(10);
        KhachHangjlb.setPreferredSize(new java.awt.Dimension(200, 50));
        KhachHangjpn.add(KhachHangjlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guest.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 50));
        KhachHangjpn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(KhachHangjpn);

        NhanVienjpn.setBackground(new java.awt.Color(255, 255, 255));
        NhanVienjpn.setPreferredSize(new java.awt.Dimension(250, 50));
        NhanVienjpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NhanVienjlb.setBackground(new java.awt.Color(255, 255, 255));
        NhanVienjlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NhanVienjlb.setText("Nhân Viên");
        NhanVienjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhanVienjlb.setIconTextGap(10);
        NhanVienjlb.setPreferredSize(new java.awt.Dimension(200, 50));
        NhanVienjpn.add(NhanVienjlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));
        NhanVienjpn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(NhanVienjpn);

        ChotCajpn.setBackground(new java.awt.Color(255, 255, 255));
        ChotCajpn.setPreferredSize(new java.awt.Dimension(250, 50));
        ChotCajpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChotCajlb.setBackground(new java.awt.Color(255, 255, 255));
        ChotCajlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ChotCajlb.setText("Chốt Ca");
        ChotCajlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChotCajlb.setIconTextGap(10);
        ChotCajlb.setPreferredSize(new java.awt.Dimension(200, 50));
        ChotCajpn.add(ChotCajlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/work-schedule.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));
        ChotCajpn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(ChotCajpn);

        ThongKejpn.setBackground(new java.awt.Color(255, 255, 255));
        ThongKejpn.setPreferredSize(new java.awt.Dimension(250, 50));
        ThongKejpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ThongKejlb.setBackground(new java.awt.Color(255, 255, 255));
        ThongKejlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ThongKejlb.setText("Thống Kê");
        ThongKejlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThongKejlb.setIconTextGap(10);
        ThongKejlb.setPreferredSize(new java.awt.Dimension(200, 50));
        ThongKejpn.add(ThongKejlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistical.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));
        ThongKejpn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(ThongKejpn);

        KhoHangjpn.setBackground(new java.awt.Color(255, 255, 255));
        KhoHangjpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhoHangjlb.setBackground(new java.awt.Color(255, 255, 255));
        KhoHangjlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KhoHangjlb.setText("Nhập Hàng");
        KhoHangjlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KhoHangjlb.setIconTextGap(10);
        KhoHangjlb.setPreferredSize(new java.awt.Dimension(200, 50));
        KhoHangjpn.add(KhoHangjlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/warehouse.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));
        KhoHangjpn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPnlListMenu.add(KhoHangjpn);

        TEST.setBackground(new java.awt.Color(255, 255, 255));
        TEST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TESTMouseClicked(evt);
            }
        });
        TEST.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPnlListMenu.add(TEST);

        jPnlCenter.add(jPnlListMenu, java.awt.BorderLayout.CENTER);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1, 1));
        jPnlCenter.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        jPanelMenu.add(jPnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelMenu, java.awt.BorderLayout.WEST);

        jPaneView.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPaneViewLayout = new javax.swing.GroupLayout(jPaneView);
        jPaneView.setLayout(jPaneViewLayout);
        jPaneViewLayout.setHorizontalGroup(
            jPaneViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );
        jPaneViewLayout.setVerticalGroup(
            jPaneViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );

        getContentPane().add(jPaneView, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void clicktrangchu(){}
    private void clicktrangchu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicktrangchu
        // TODO add your handling code here:
        setBackground(Color.yellow);
       
    }//GEN-LAST:event_clicktrangchu

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
        setBackground(Color.yellow);
    }//GEN-LAST:event_click

    private void DangXuatjlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatjlbMouseClicked
        int input = JOptionPane.showConfirmDialog(null, "BẠn có muốn đăng xuất không ?", "Đăng xuất.",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)
 ;    
        if(input == 0){
            Login login= new Login();
            this.dispose();
            login.setVisible(true); 
        }
        
    }//GEN-LAST:event_DangXuatjlbMouseClicked

    private void TESTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TESTMouseClicked
        HoaDonDialog_add a = new HoaDonDialog_add();
        a.setVisible(true);
    }//GEN-LAST:event_TESTMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChotCajlb;
    private javax.swing.JPanel ChotCajpn;
    private javax.swing.JLabel DangXuatjlb;
    private javax.swing.JLabel HoaDonjlb;
    private javax.swing.JPanel HoaDonjpn;
    private javax.swing.JLabel KhachHangjlb;
    private javax.swing.JPanel KhachHangjpn;
    private javax.swing.JLabel KhoHangjlb;
    private javax.swing.JPanel KhoHangjpn;
    private javax.swing.JLabel KhuyenMaijlb;
    private javax.swing.JPanel KhuyenMaijpn;
    private javax.swing.JLabel LOGOHW;
    private javax.swing.JLabel NhanVienjlb;
    private javax.swing.JPanel NhanVienjpn;
    private javax.swing.JLabel SanPhamjlb;
    private javax.swing.JPanel SanPhanjpn;
    private javax.swing.JPanel TEST;
    private javax.swing.JLabel ThongKejlb;
    private javax.swing.JPanel ThongKejpn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTrangChu;
    private javax.swing.JPanel jPaneView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTrangChu;
    private javax.swing.JPanel jPnlCenter;
    private javax.swing.JPanel jPnlDangXuat;
    private javax.swing.JPanel jPnlListMenu;
    private javax.swing.JPanel jPnlLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
