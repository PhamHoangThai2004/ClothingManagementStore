package model.swing;

import java.awt.*;
import javax.swing.*;

public class OvalButton extends JButton {

    public OvalButton() {
        this.setContentAreaFilled(false);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setBackground(Color.WHITE);

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ nền với các góc bo tròn
        if (getModel().isArmed()) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 55, 55);

        // Vẽ viền với các góc bo tròn
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 55, 55);

        // Vẽ văn bản của nút
        FontMetrics fm = g2.getFontMetrics();
        int textWidth = fm.stringWidth(getText());
        int textHeight = fm.getHeight();
        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() + textHeight) / 2 - fm.getDescent();

        g2.setColor(getForeground());
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width += 20; // Tăng thêm kích thước để có khoảng trống cho các góc bo tròn
        size.height += 10;
        return size;
    }

 
}
