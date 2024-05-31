package model.swing;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class NewComboBox extends JComboBox<Object> {

    public NewComboBox() {
        // Thiết lập màu nền và màu chữ của JComboBox
        setBackground(new Color(0, 80, 75));
        setForeground(Color.WHITE);
        
        // Loại bỏ viền của JComboBox
        setBorder(BorderFactory.createEmptyBorder());
        // Thiết lập renderer để tùy chỉnh màu nền và màu chữ của các mục trong phần hiển thị
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setOpaque(true); // Đảm bảo rằng label có thể vẽ màu nền
                
                // Thiết lập màu nền và màu chữ cho mục
                label.setBackground(new Color(0, 80, 75)); 
                label.setForeground(Color.WHITE); 
                
                // Thiết lập màu nền cho mục được chọn và mục không được chọn
                if (isSelected) {
                    label.setBackground(new Color(0, 80, 75).darker()); // Mục được chọn
                } else {
                    label.setBackground(new Color(0, 80, 75)); // Mục không được chọn
                }
                
                return label;
            }
        });

        // Thêm các mục vào JComboBox
//        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
//        addItem(items[0]);
//        addItem(items[1]);        
//        addItem(items[2]);        
//        addItem(items[3]);
    }
}