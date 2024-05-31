package execute.test;

import java.awt.BorderLayout;
import java.awt.Color;
import view.admin.AdminMenu;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        this.panel_Menu.setLayout(new BorderLayout());
        this.panel_Menu.add(new AdminMenu());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Menu = new javax.swing.JPanel();
        panel_Main = new javax.swing.JPanel();
        label_Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panel_Menu.setPreferredSize(new java.awt.Dimension(250, 650));

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        panel_Main.setBackground(new java.awt.Color(153, 255, 51));
        panel_Main.setPreferredSize(new java.awt.Dimension(680, 580));

        javax.swing.GroupLayout panel_MainLayout = new javax.swing.GroupLayout(panel_Main);
        panel_Main.setLayout(panel_MainLayout);
        panel_MainLayout.setHorizontalGroup(
            panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panel_MainLayout.setVerticalGroup(
            panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        label_Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Exit.setText("X");
        label_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Exit_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_Exit_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_Exit_MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(panel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(1000, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label_Exit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_Exit_MouseClicked

    private void label_Exit_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseEntered
        label_Exit.setForeground(new Color(204, 0, 51));
    }//GEN-LAST:event_label_Exit_MouseEntered

    private void label_Exit_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseExited
        label_Exit.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_label_Exit_MouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_Exit;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel panel_Menu;
    // End of variables declaration//GEN-END:variables
}
