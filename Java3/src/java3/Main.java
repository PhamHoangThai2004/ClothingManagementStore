/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3;

import javax.swing.UIManager;

/**
 *
 * @author PHAM HOANG THAI
 */
public class Main {
    public static void main(String[] args) {
try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new NewJFrame();
        }
        catch(Exception e) {
            e.printStackTrace();
        }    }
}
