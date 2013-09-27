/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adonis.core.components;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author Bobby
 */
public class GradientButton extends JButton implements MouseListener
{
    boolean mouseIn=false;
    String text;

    public GradientButton(String s)
    {
        super(s);
        text = s;
        //setBorderPainted(false);
        this.setOpaque(true);
        addMouseListener(this);
        setContentAreaFilled(false);
        this.setFocusPainted(false);
        //this.setBorder(new LineBorder(Color.LIGHT_GRAY,2,true));
      

    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        
        int w = getWidth( );
    int h = getHeight( );
 
    // Paint a gradient from top to bottom
    GradientPaint gp = new GradientPaint(
    0, 5, Color.GRAY,
    0, h, Color.DARK_GRAY );
    GradientPaint gp2 = new GradientPaint(
    0, 0, Color.LIGHT_GRAY,
    0, h, Color.GRAY );

    if(mouseIn)
    g2.setPaint( gp2);
    else
    g2.setPaint(gp);
        
    g2.fillRect( 0, 0, w, h );
    
      
  

    

    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       mouseIn=true;
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
     mouseIn=false;  
    }
}
