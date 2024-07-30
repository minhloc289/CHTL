/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author admin
 */
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

public class JTableToPDFGUI extends JFrame {
    private JTable table;

    public JTableToPDFGUI() {
        setTitle("JTable to PDF Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo dữ liệu mẫu cho JTable
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {
            {"Data 1", "Data 2", "Data 3"},
            {"Data 4", "Data 5", "Data 6"},
            {"Data 7", "Data 8", "Data 9"}
        };

        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JButton exportButton = new JButton("Export to PDF");
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportToPDF();
            }
        });
        add(exportButton, BorderLayout.SOUTH);
    }

    private void exportToPDF() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String pdfFilePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!pdfFilePath.toLowerCase().endsWith(".pdf")) {
                pdfFilePath += ".pdf";
            }

            try (FileOutputStream fos = new FileOutputStream(pdfFilePath)) {
                PdfWriter writer = new PdfWriter(fos);
                PdfDocument pdfDoc = new PdfDocument(writer);
                Document document = new Document(pdfDoc);

                // Tạo bảng PDF
                Table pdfTable = new Table(table.getColumnCount());

                // Thêm tiêu đề cột vào bảng PDF
                TableModel model = table.getModel();
                for (int i = 0; i < model.getColumnCount(); i++) {
                    pdfTable.addCell(new Cell().add(new Paragraph(model.getColumnName(i))));
                }

                // Thêm dữ liệu vào bảng PDF
                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        pdfTable.addCell(new Cell().add(new Paragraph(model.getValueAt(row, col).toString())));
                    }
                }

                document.add(pdfTable);
                document.close();
                JOptionPane.showMessageDialog(this, "PDF exported successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error exporting PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTableToPDFGUI().setVisible(true);
            }
        });
    }
}

