/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.annotation.AnnotationFormatError;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author Admin
 */
public class TextField extends JTextField{
    private final AnnotationFormatError animator;
    private boolean animateHinText=true;
    private float location;
    private boolean show;
 
private boolean mouseOver=false;
private String labelText="Label";
private Color lineColor=new Color(3,155,216);

    public TextField() {
        setBorder(new EmptyBorder(20, 3, 10, 3));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent me) {
                super.mouseExited(me); 
                mouseOver=true;
                 repaint();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                super.mouseEntered(me);  
                mouseOver=false;
                repaint();
            }
        
        
        });
        animator=null;
        
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        int width=getWidth();
        int height=getHeight();
        if(mouseOver){
            g2.setColor(lineColor);
        }else{
            g2.setColor(new Color(150,150,150));
        }
        g2.fillRect(2, height-1, width-4, 1);
        g2.dispose();
        
    }
    
    
    
}
