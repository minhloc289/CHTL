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
import java.awt.*;
import java.io.FileOutputStream;

public class SwingToPdf {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing to PDF Example");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Hello, this is a Swing component!"));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
            document.open();

            PdfContentByte contentByte = writer.getDirectContent();
            PdfTemplate template = contentByte.createTemplate(panel.getWidth(), panel.getHeight());
            Graphics2D g2d = template.createGraphics(panel.getWidth(), panel.getHeight());
            panel.print(g2d);
            g2d.dispose();
            contentByte.addTemplate(template, 0, 0);

            document.close();
            System.out.println("PDF created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

