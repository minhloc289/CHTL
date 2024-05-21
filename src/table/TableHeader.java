/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author NK
 */
public class TableHeader extends JLabel{
    public TableHeader(String text) {
        super(text);
    setOpaque(true);
    setBackground(Color.white);
    setFont (new Font("sansserif", 1, 12));
    setForeground (new Color (102, 102, 102));
    setBorder (new EmptyBorder (10, 5, 10, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(230,230,230));
        g2.drawLine(0,getHeight()-1,getWidth()-1 , getHeight()-1);
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
