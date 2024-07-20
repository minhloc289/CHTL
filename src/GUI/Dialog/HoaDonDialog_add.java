/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Dialog;

import BUS.SanPhamBUS;
import BUS.cthdBUS;
import GUI.Dialog.NhapKhachHangDialog;
import Model.CTHD;
import Model.SANPHAM;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class HoaDonDialog_add extends javax.swing.JDialog {
    Float tongHD = (float)0;
    SANPHAM s = new SANPHAM();
    SanPhamBUS sanPhamBUS= new SanPhamBUS();
    DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel2;
    public ArrayList <CTHD> c = new ArrayList();
    cthdBUS cthdBUS = new cthdBUS();
    int quantity;
    String maSP;
    String maHD;
    
    public HoaDonDialog_add() {
        //super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        jPnlHeader.setBackground(new Color(22, 122, 198));
        jPnlHeader.setPreferredSize(new Dimension(600, 100));
        jlblHeader.setFont(new Font(FlatRobotoFont.FAMILY, 1, 18));
        jlblHeader.setForeground(new Color(255, 255, 255));
        jlblHeader.setHorizontalAlignment(JLabel.CENTER);
        jlblHeader.setText("THÊM HÓA ĐƠN");
        jlblHeader.setPreferredSize(new Dimension(500, 40));
        
         defaultTableModel = new DefaultTableModel();
         defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){
                return column == 3;
            }
        };
        String headerString[] = new String[]{"Mã sản phẩm", "Tên sản phẩm", "Giá bán", "Số lượng"};
        defaultTableModel.setColumnIdentifiers(headerString);
        jTable1.setModel(defaultTableModel);
        sanPhamBUS = new SanPhamBUS();
        setDataTable(sanPhamBUS.selectAll(s));
        
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
        jTable1.setAutoCreateRowSorter(true);
        
        
         defaultTableModel2 = new DefaultTableModel();
         defaultTableModel2 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        String headerString1[] = new String[]{"Tên sản phẩm", "Giá bán", "Số lượng", "Chiết khấu", "Trị giá"};
        defaultTableModel2.setColumnIdentifiers(headerString1);
        jTable2.setModel(defaultTableModel2);
        maHD = cthdBUS.getNewMaHD();
        
        jTable2.setFocusable(false);
        jScrollPane2.setViewportView(jTable2);
    
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);  
        jTable2.setAutoCreateRowSorter(true);
        
        jButton1.requestFocus();
    }
public interface OnProductAddedListener {
        void onProductAdded();
    }

    private OnProductAddedListener productAddedListener;

    public void setOnProductAddedListener(OnProductAddedListener listener) {
        this.productAddedListener = listener;
    }
   private void setDataTable(ArrayList<SANPHAM> spDao) {
        for (SANPHAM spSanpham : spDao){
            if(spSanpham.getMaSP().equals("N/A")) continue;
            defaultTableModel.addRow(new Object[]{spSanpham.getMaSP(),spSanpham.getTenSP(),spSanpham.getGiaBan(),""
            });
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPnlHeader = new javax.swing.JPanel();
        jlblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 350));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 350));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Hoàn thành");
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPnlHeader.setPreferredSize(new java.awt.Dimension(1000, 100));

        jlblHeader.setBackground(new java.awt.Color(255, 255, 255));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("THÊM HÓA ĐƠN");
        jlblHeader.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên sản phẩm");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Nhập thông tin sản phẩm cần tìm");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        jLabel2.setText("Thêm");
        jLabel2.setIconTextGap(10);
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 50));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("None");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        javax.swing.GroupLayout jPnlHeaderLayout = new javax.swing.GroupLayout(jPnlHeader);
        jPnlHeader.setLayout(jPnlHeaderLayout);
        jPnlHeaderLayout.setHorizontalGroup(
            jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlHeaderLayout.createSequentialGroup()
                .addGroup(jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnlHeaderLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPnlHeaderLayout.setVerticalGroup(
            jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlHeaderLayout.createSequentialGroup()
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnlHeaderLayout.createSequentialGroup()
                        .addGroup(jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlHeaderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        getContentPane().add(jPnlHeader, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
         jTextField1.setText("");
        jTextField1.setForeground(Color.black);
        TableRowSorter<DefaultTableModel> rowSorter;

         rowSorter = new TableRowSorter<>(defaultTableModel);
        jTable1.setRowSorter(rowSorter);

        // Tạo JTextField để nhập từ khóa tìm kiếm
        
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = jTextField1.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
       
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float tong_dt =(float) 0.0 ;
        int countRow = defaultTableModel2.getRowCount();
        if(countRow<=0){
           JOptionPane.showMessageDialog(null,"Chưa có sản phẩm được chọn","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
       int rs= JOptionPane.showConfirmDialog(this, "Xác Nhận Thêm Hóa Đơn", "Thêm Hóa Đơn", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if(rs==JOptionPane.YES_OPTION){
           for (int i = 0; i < c.size(); i++) {
            cthdBUS.insert(c.get(i));
            tong_dt+= c.get(i).getTriGia();
             }
            cthdBUS.update_tongDT(maHD,tong_dt);
           JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
           if (productAddedListener != null) {
                    productAddedListener.onProductAdded();
                }
            int rs2= JOptionPane.showConfirmDialog(this, "Xác nhận in hóa đơn ", "In Hóa Đơn", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(rs2==JOptionPane.YES_OPTION){
                printToPdf();
            }
           dispose();
         }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private PdfPCell createCell(String content, com.itextpdf.text.Font font) {
    PdfPCell cell = new PdfPCell(new Phrase(content, font));
    cell.setBorder(Rectangle.NO_BORDER);
    return cell;
}
      public void printToPdf() {
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("cthd_output.pdf"));
            document.open();
            Image logo = Image.getInstance("D:\\icon\\logo.png"); // Hoặc JPG/ok 
            logo.scaleToFit(150, 100); // Điều chỉnh kích thước logo nếu cần
            logo.setAlignment(Element.ALIGN_CENTER);
            document.add(logo);

            // Thêm tên công ty
            com.itextpdf.text.Font fontTitle = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 24, com.itextpdf.text.Font.BOLD); // Tùy chỉnh font
            Paragraph title = new Paragraph("INVOICE", fontTitle);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            com.itextpdf.text.Font fontSubtitle = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12);
            Paragraph subtitle = new Paragraph("COMPANY SELL PRODUCT", fontSubtitle);
            subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(subtitle);

            Locale localeUS = new Locale("en", "US"); 
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeUS);
            // ... (Các phần khác của code)

// Thêm thông tin khách hàng, hóa đơn, ngày xuất và thông tin ngân hàng
        PdfPTable headerTable = new PdfPTable(2);
        headerTable.setWidthPercentage(100);

        // Cột 1: Bank Details
        PdfPCell bankDetailsCell = new PdfPCell();
        bankDetailsCell.setBorder(Rectangle.NO_BORDER);

        Paragraph bank = new Paragraph("BANK DETAILS", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD));
        bank.setAlignment(Element.ALIGN_LEFT); // Căn lề trái
        bankDetailsCell.addElement(bank);

        bankDetailsCell.addElement(new Paragraph("Bank: Vietcombank", fontSubtitle));
        bankDetailsCell.addElement(new Paragraph("Account number: 123456789", fontSubtitle));
        bankDetailsCell.addElement(new Paragraph("Branch: Thu Duc City", fontSubtitle));
        headerTable.addCell(bankDetailsCell);

        // Cột 2: Date Export
        PdfPCell dateExportCell = new PdfPCell();
        dateExportCell.setBorder(Rectangle.NO_BORDER);
        
        Paragraph ngayXuat = new Paragraph("Date Export: " + java.time.LocalDate.now(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12));
        ngayXuat.setAlignment(Element.ALIGN_RIGHT); // Căn lề phải
        dateExportCell.addElement(ngayXuat);

        headerTable.addCell(dateExportCell);

        document.add(headerTable);
// ... (Các phần khác của code)

//            Paragraph ngayXuat = new Paragraph("Date Export: " + java.time.LocalDate.now(), new Font(Font.FontFamily.HELVETICA, 12));
//            ngayXuat.setAlignment(Element.ALIGN_RIGHT);
//            document.add(ngayXuat);

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            addTableHeader(table);

            double tongCong = 0; // Biến lưu tổng cộng
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                table.addCell(jTable2.getValueAt(i, 0).toString());
                float giaBan = Float.parseFloat(jTable2.getValueAt(i, 1).toString());
                table.addCell(currencyFormatter.format(giaBan));
                table.addCell(jTable2.getValueAt(i, 2).toString());
                float discount = Float.parseFloat(jTable2.getValueAt(i, 3).toString());
                table.addCell(currencyFormatter.format(discount));
                double giaCa = Float.parseFloat(jTable2.getValueAt(i, 4).toString());
                table.addCell(currencyFormatter.format(giaCa));
                tongCong += giaCa;
            }

            document.add(table);
            //
            
//            Paragraph bank= new Paragraph("Bank Detail" +  new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
//            bank.setAlignment(Element.ALIGN_LEFT);
//            document.add(bank);
//            
            
            
            // Tổng cộng
//            Paragraph tongCongPara = new Paragraph("Total: " + currencyFormatter.format(tongCong), new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD));
//            tongCongPara.setAlignment(Element.ALIGN_RIGHT);
//            document.add(tongCongPara);
//
//            Thuế (10%)
            //double thue = tongCong * 0.05;
//            Paragraph thuePara = new Paragraph("Tax (5%): " + currencyFormatter.format(thue), new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD));
//            thuePara.setAlignment(Element.ALIGN_RIGHT);
//            document.add(thuePara);
//
//            // Chi phí phải trả
           double chiPhiPhaiTra = tongCong;
//            Paragraph chiPhiPara = new Paragraph("Fee Cost: " + currencyFormatter.format(chiPhiPhaiTra), new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD));
//            chiPhiPara.setAlignment(Element.ALIGN_RIGHT);
//            document.add(chiPhiPara);
              PdfPTable infoTable = new PdfPTable(2); 
        infoTable.setWidthPercentage(100);
        infoTable.setSpacingBefore(20f); 

        // Cột 1: Thông tin liên lạc
        PdfPCell contactInfoCell = new PdfPCell();
        contactInfoCell.setBorder(Rectangle.NO_BORDER);

        Paragraph contactHeader = new Paragraph("Contact Information", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD));
        contactHeader.setAlignment(Element.ALIGN_LEFT); 
        contactInfoCell.addElement(contactHeader);
        
        // Thêm thông tin liên lạc của bạn
        contactInfoCell.addElement(new Paragraph("Name: Noahs", fontSubtitle));
        contactInfoCell.addElement(new Paragraph("Email: convenient@gmail.com", fontSubtitle));
        contactInfoCell.addElement(new Paragraph("Phone: 09012345678", fontSubtitle));
        infoTable.addCell(contactInfoCell);

        // Cột 2: Thông tin thanh toán (Tổng cộng, Thuế, Chi phí)
        PdfPCell paymentInfoCell = new PdfPCell();
        paymentInfoCell.setBorder(Rectangle.NO_BORDER);

        // Tạo các đoạn văn bản cho tổng cộng, thuế, và chi phí phải trả
        Paragraph tongCongPara = new Paragraph("Total: " + currencyFormatter.format(tongCong), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD));
        //Paragraph thuePara = new Paragraph("Tax (5%): " + currencyFormatter.format(thue), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD));
        Paragraph chiPhiPara = new Paragraph("Fee Cost: " + currencyFormatter.format(chiPhiPhaiTra), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD));

        // Căn chỉnh các đoạn văn bản sang phải
        tongCongPara.setAlignment(Element.ALIGN_RIGHT);
        //thuePara.setAlignment(Element.ALIGN_RIGHT);
        chiPhiPara.setAlignment(Element.ALIGN_RIGHT);

        // Thêm các đoạn văn bản vào cell
        paymentInfoCell.addElement(tongCongPara);
        //paymentInfoCell.addElement(thuePara);
        paymentInfoCell.addElement(chiPhiPara);
        infoTable.addCell(paymentInfoCell);

        document.add(infoTable);
            document.close();

            JOptionPane.showMessageDialog(this, "Xuất PDF thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xuất PDF!");
        }
    }

    private void addTableHeader(PdfPTable table) {
        table.addCell("Product");
        table.addCell("Price");
        table.addCell("Quantity");
        table.addCell("Discount");
        table.addCell("Value");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rs= JOptionPane.showConfirmDialog(this, "Xác muốn hủy tạo hóa đơn", "Hủy hóa đơn", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(rs==JOptionPane.YES_OPTION){
                cthdBUS.delete(maHD);
                 dispose();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int row = jTable1.getSelectedRow();
           
           if(row==-1){
            JOptionPane.showMessageDialog(null,"Hãy chọn sản phẩm cần thêm","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
            maSP = jTable1.getValueAt(row, 0).toString();
            String tenSP = jTable1.getValueAt(row,1).toString();
            String giaBan = jTable1.getValueAt(row,2).toString();
            String sl =jTable1.getValueAt(row,3).toString();
            if(sl.isEmpty()||sl.equals("0")){
                JOptionPane.showMessageDialog(null,"Bạn chưa nhập số lượng ","Thông báo",JOptionPane.ERROR_MESSAGE);
            }
            else{
            try {
                quantity = Integer.parseInt(sl);
                try {
                    ArrayList<Float> list = new ArrayList<>();
                    list = cthdBUS.getInfCTHD(maSP, NhapKhachHangDialog.makH, quantity);
                // Chỉ chạy câu lệnh dưới nếu không có lỗi
                     String makm = "N/A";
                    if(list.get(0)>0){
                        makm = cthdBUS.getMakm(maSP);
                    }
                    c.add(new CTHD(maHD,maSP,makm,quantity,list.get(1)));
                    defaultTableModel2.addRow(new Object[]{tenSP, giaBan, sl, list.get(0), list.get(1)});
                    tongHD += list.get(1);
                    String tonghdString = tongHD.toString();
                    jLabel3.setText(tonghdString);
                } catch (Exception e) {
                    // Xử lý lỗi nếu cần thiết, ví dụ như ghi log hoặc hiển thị thông báo lỗi
                     System.err.println("Lỗi khi gọi getInfCTHD: " + e.getMessage());
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ. Vui lòng nhập một số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
//            java.util.logging.Logger.getLogger(HoaDonDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HoaDonDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HoaDonDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HoaDonDialog_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                HoaDonDialog_add dialog = new HoaDonDialog_add(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlblHeader;
    // End of variables declaration//GEN-END:variables
}
