/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
/**
 *
 * @author NK
 */
public class PanelRound extends JPanel{
    private int roundTOPright=0;
    private int roudTOPleft=0;
    private int roundBOTTOMright=0;
    private int roudBOTTOMleft=0;
    public PanelRound(){
        setOpaque(false);
    }

    public int getRoundTOPright() {
        return roundTOPright;
    }

    public void setRoundTOPright(int roundTOPright) {
        this.roundTOPright = roundTOPright;
        repaint();
    }

    public int getRoudTOPleft() {
        return roudTOPleft;
    }

    public void setRoudTOPleft(int roudTOPleft) {
        this.roudTOPleft = roudTOPleft;
        repaint();
    }

    public int getRoundBOTTOMright() {
        return roundBOTTOMright;
    }

    public void setRoundBOTTOMright(int roundBOTTOMright) {
        this.roundBOTTOMright = roundBOTTOMright;
        repaint();
    }

    public int getRoudBOTTOMleft() {
        return roudBOTTOMleft;
    }

    public void setRoudBOTTOMleft(int roudBOTTOMleft) {
        this.roudBOTTOMleft = roudBOTTOMleft;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2= (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(224, 238, 238));
        Area area = new Area(createRoundtopLeft());
        if (roundBOTTOMright>0){
            area.intersect(new Area(createRoundtopRight()));
        }
        if (roundBOTTOMright>0){
            area.intersect(new Area(createRoundBOTTOMright()));
        }
        if (roudBOTTOMleft>0){
            area.intersect(new Area(createRoundBOTTOMLeft()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    private Shape createRoundtopRight(){
        int  with =getWidth();
        int height = getHeight();
        int RoundX =Math.min(with,roundTOPright);
        int RoundY=Math.min(height, roundTOPright);
        Area   area     = new Area (new RoundRectangle2D.Double(0,0,with,height,RoundX,RoundY) );
        area.add(new Area(new Rectangle2D.Double(0,0,with-RoundX/2,height)));
        area.add(new Area(new Rectangle2D.Double(0,RoundY/2,with,height-RoundY/2)));
        return area;
        
    }
    private Shape createRoundtopLeft(){
        int  with =getWidth();
        int height = getHeight();
        int RoundX =Math.min(with,roudTOPleft);
        int RoundY=Math.min(height, roudTOPleft);
        Area   area     = new Area (new RoundRectangle2D.Double(0,0,with,height,RoundX,RoundY) );
        area.add(new Area(new Rectangle2D.Double(RoundX/2,0,with-RoundX/2,height)));
        area.add(new Area(new Rectangle2D.Double(0,RoundY/2,with,height-RoundY/2)));
        return area; 
    }
    private Shape createRoundBOTTOMLeft(){
        int  with =getWidth();
        int height = getHeight();
        int RoundX =Math.min(with,roudBOTTOMleft);
        int RoundY=Math.min(height, roudBOTTOMleft);
        Area   area     = new Area (new RoundRectangle2D.Double(0,0,with,height,RoundX,RoundY) );
        area.add(new Area(new Rectangle2D.Double(RoundX/2,0,with-RoundX/2,height)));
        area.add(new Area(new Rectangle2D.Double(0,0,with,height-RoundY/2)));
        return area; 
    }
    private Shape createRoundBOTTOMright(){
        int  with =getWidth();
        int height = getHeight();
        int RoundX =Math.min(with,roundBOTTOMright);
        int RoundY=Math.min(height, roundBOTTOMright);
        Area   area     = new Area (new RoundRectangle2D.Double(0,0,with,height,RoundX,RoundY) );
        area.add(new Area(new Rectangle2D.Double(0,0,with-RoundX/2,height)));
        area.add(new Area(new Rectangle2D.Double(0,0,with,height-RoundY/2)));
        return area; 
    }
}
