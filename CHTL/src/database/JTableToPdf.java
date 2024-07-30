/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author admin
 */
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.FileOutputStream;

public class JTableToPdf {

    public static void main(String[] args) {
        // Tạo một JTable mẫu
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tên");
        model.addColumn("Tuổi");
        model.addColumn("Địa chỉ");
        model.addRow(new Object[]{"Nguyễn Văn A", 25, "Hà Nội"});
        model.addRow(new Object[]{"Trần Thị B", 30, "Hồ Chí Minh"});
        model.addRow(new Object[]{"Lê Văn C", 22, "Đà Nẵng"});
        
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("JTable to PDF Example");
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("table_output.pdf"));
            document.open();

            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            pdfTable.setWidthPercentage(100);

            // Thêm tiêu đề cột
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }

            // Thêm dữ liệu
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    pdfTable.addCell(table.getValueAt(i, j).toString());
                }
            }

            document.add(pdfTable);
            document.close();
            System.out.println("PDF created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
