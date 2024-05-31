package model.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class RectButton extends JButton{

    public RectButton() {
        this.setContentAreaFilled(false);
        this.setBackground(Color.WHITE);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(getModel().isArmed()) {
            g2.setColor(getBackground().darker());
        }
        else {
            g2.setColor(getBackground());
        }
        
        // Vẽ nền
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        // Vẽ đường viền
        g2.setColor(getForeground());
        g2.drawRect(0, 0, getWidth()-1, getHeight()-1);
        
        // Vẽ văn bản
        FontMetrics fm = g2.getFontMetrics();
        int textWidth = fm.stringWidth(getText());
        int textHeight = fm.getHeight();
        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() + textHeight) / 2 - fm.getDescent();
        
        g2.setColor(getForeground());
        g2.drawString(getText(), x, y);
        
        g2.dispose();
    }
    
//    @Override
//    public Dimension getPreferredSize() {
//        Dimension size = super.getPreferredSize();
//        size.width+=20
//    }
    
}
