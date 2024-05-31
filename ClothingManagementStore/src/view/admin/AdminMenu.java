package view.admin;

import java.awt.Color;

public class AdminMenu extends javax.swing.JPanel {

    public AdminMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Logo = new javax.swing.JLabel();
        label_ManageProduct = new javax.swing.JLabel();
        label_ManageBranch = new javax.swing.JLabel();
        label_InformationOrder = new javax.swing.JLabel();
        label_InformationCustomer = new javax.swing.JLabel();
        label_ManageAccount = new javax.swing.JLabel();
        separator_Menu = new javax.swing.JSeparator();
        label_InformationAccount = new javax.swing.JLabel();
        label_Account = new javax.swing.JLabel();
        label_LogOut = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 80, 75));
        setPreferredSize(new java.awt.Dimension(250, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Logo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_Logo.setForeground(new java.awt.Color(255, 255, 255));
        label_Logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/LogoShope64px.png"))); // NOI18N
        label_Logo.setText("SHOPE.VN");
        label_Logo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_Logo.setIconTextGap(30);
        label_Logo.setPreferredSize(new java.awt.Dimension(250, 80));
        add(label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        label_ManageProduct.setBackground(new java.awt.Color(0, 80, 75));
        label_ManageProduct.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_ManageProduct.setForeground(new java.awt.Color(255, 255, 255));
        label_ManageProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_ManageProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/ManageProduct16px.png"))); // NOI18N
        label_ManageProduct.setText("Quản Lý Sản Phẩm");
        label_ManageProduct.setToolTipText("");
        label_ManageProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_ManageProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ManageProduct.setIconTextGap(20);
        label_ManageProduct.setOpaque(true);
        label_ManageProduct.setPreferredSize(new java.awt.Dimension(250, 50));
        label_ManageProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ManageProduct_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ManageProduct_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ManageProduct_MouseExited(evt);
            }
        });
        add(label_ManageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        label_ManageBranch.setBackground(new java.awt.Color(0, 80, 75));
        label_ManageBranch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_ManageBranch.setForeground(new java.awt.Color(255, 255, 255));
        label_ManageBranch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_ManageBranch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/ManageBranch16px.png"))); // NOI18N
        label_ManageBranch.setText("Quản Lý Của Hàng");
        label_ManageBranch.setToolTipText("");
        label_ManageBranch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_ManageBranch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ManageBranch.setIconTextGap(20);
        label_ManageBranch.setOpaque(true);
        label_ManageBranch.setPreferredSize(new java.awt.Dimension(250, 50));
        label_ManageBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ManageBranch_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ManageBranch_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ManageBranch_MouseExited(evt);
            }
        });
        add(label_ManageBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, -1));

        label_InformationOrder.setBackground(new java.awt.Color(0, 80, 75));
        label_InformationOrder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_InformationOrder.setForeground(new java.awt.Color(255, 255, 255));
        label_InformationOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_InformationOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/InformationOrder16px.png"))); // NOI18N
        label_InformationOrder.setText("Thông Tin Hóa Đơn");
        label_InformationOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_InformationOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_InformationOrder.setIconTextGap(20);
        label_InformationOrder.setOpaque(true);
        label_InformationOrder.setPreferredSize(new java.awt.Dimension(250, 50));
        label_InformationOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_InformationOrder_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_InformationOrder_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_InformationOrder_MouseExited(evt);
            }
        });
        add(label_InformationOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, -1));

        label_InformationCustomer.setBackground(new java.awt.Color(0, 80, 75));
        label_InformationCustomer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_InformationCustomer.setForeground(new java.awt.Color(255, 255, 255));
        label_InformationCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_InformationCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/InformationCustomer16px.png"))); // NOI18N
        label_InformationCustomer.setText("Thông Tin Khách Hàng");
        label_InformationCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_InformationCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_InformationCustomer.setIconTextGap(20);
        label_InformationCustomer.setOpaque(true);
        label_InformationCustomer.setPreferredSize(new java.awt.Dimension(250, 50));
        label_InformationCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_InformationCustomer_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_InformationCustomer_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_InformationCustomer_MouseExited(evt);
            }
        });
        add(label_InformationCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        label_ManageAccount.setBackground(new java.awt.Color(0, 80, 75));
        label_ManageAccount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_ManageAccount.setForeground(new java.awt.Color(255, 255, 255));
        label_ManageAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_ManageAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/ManageAccount16px.png"))); // NOI18N
        label_ManageAccount.setText("Quản Lý Tài Khoản");
        label_ManageAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_ManageAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ManageAccount.setIconTextGap(20);
        label_ManageAccount.setOpaque(true);
        label_ManageAccount.setPreferredSize(new java.awt.Dimension(250, 50));
        label_ManageAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ManageAccount_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ManageAccount_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ManageAccount_MouseExited(evt);
            }
        });
        add(label_ManageAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        separator_Menu.setBackground(new java.awt.Color(255, 255, 255));
        separator_Menu.setForeground(new java.awt.Color(255, 255, 255));
        separator_Menu.setOpaque(true);
        add(separator_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, -1));

        label_InformationAccount.setForeground(new java.awt.Color(255, 255, 255));
        label_InformationAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_InformationAccount.setText("Thông tin tài khoản:");
        add(label_InformationAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, -1));

        label_Account.setBackground(new java.awt.Color(0, 80, 75));
        label_Account.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_Account.setForeground(new java.awt.Color(255, 255, 255));
        label_Account.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/Account16px.png"))); // NOI18N
        label_Account.setText("Tài Khoản");
        label_Account.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Account.setIconTextGap(20);
        label_Account.setOpaque(true);
        label_Account.setPreferredSize(new java.awt.Dimension(250, 50));
        label_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Account_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_Account_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_Account_MouseExited(evt);
            }
        });
        add(label_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        label_LogOut.setBackground(new java.awt.Color(0, 80, 75));
        label_LogOut.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_LogOut.setForeground(new java.awt.Color(255, 255, 255));
        label_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin/LogOut16px.png"))); // NOI18N
        label_LogOut.setText("Đăng Xuất");
        label_LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        label_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_LogOut.setIconTextGap(20);
        label_LogOut.setOpaque(true);
        label_LogOut.setPreferredSize(new java.awt.Dimension(250, 50));
        label_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_LogOut_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_LogOut_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_LogOut_MouseExited(evt);
            }
        });
        add(label_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void label_ManageProduct_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageProduct_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ManageProduct_MouseClicked

    private void label_ManageProduct_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageProduct_MouseEntered
        label_ManageProduct.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_ManageProduct_MouseEntered

    private void label_ManageProduct_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageProduct_MouseExited
        label_ManageProduct.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_ManageProduct_MouseExited

    private void label_ManageBranch_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageBranch_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ManageBranch_MouseClicked

    private void label_ManageBranch_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageBranch_MouseEntered
        label_ManageBranch.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_ManageBranch_MouseEntered

    private void label_ManageBranch_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageBranch_MouseExited
        label_ManageBranch.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_ManageBranch_MouseExited

    private void label_InformationOrder_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationOrder_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_InformationOrder_MouseClicked

    private void label_InformationOrder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationOrder_MouseEntered
        label_InformationOrder.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_InformationOrder_MouseEntered

    private void label_InformationOrder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationOrder_MouseExited
        label_InformationOrder.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_InformationOrder_MouseExited

    private void label_InformationCustomer_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationCustomer_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_InformationCustomer_MouseClicked

    private void label_InformationCustomer_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationCustomer_MouseEntered
        label_InformationCustomer.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_InformationCustomer_MouseEntered

    private void label_InformationCustomer_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_InformationCustomer_MouseExited
        label_InformationCustomer.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_InformationCustomer_MouseExited

    private void label_ManageAccount_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageAccount_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ManageAccount_MouseClicked

    private void label_ManageAccount_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageAccount_MouseEntered
        label_ManageAccount.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_ManageAccount_MouseEntered

    private void label_ManageAccount_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ManageAccount_MouseExited
        label_ManageAccount.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_ManageAccount_MouseExited

    private void label_Account_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Account_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_Account_MouseClicked

    private void label_Account_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Account_MouseEntered
        label_Account.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_Account_MouseEntered

    private void label_Account_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Account_MouseExited
        label_Account.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_Account_MouseExited

    private void label_LogOut_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_LogOut_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_LogOut_MouseClicked

    private void label_LogOut_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_LogOut_MouseEntered
        label_LogOut.setBackground(new Color(0, 80, 75).darker());
    }//GEN-LAST:event_label_LogOut_MouseEntered

    private void label_LogOut_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_LogOut_MouseExited
        label_LogOut.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_label_LogOut_MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_Account;
    private javax.swing.JLabel label_InformationAccount;
    private javax.swing.JLabel label_InformationCustomer;
    private javax.swing.JLabel label_InformationOrder;
    private javax.swing.JLabel label_LogOut;
    private javax.swing.JLabel label_Logo;
    private javax.swing.JLabel label_ManageAccount;
    private javax.swing.JLabel label_ManageBranch;
    private javax.swing.JLabel label_ManageProduct;
    private javax.swing.JSeparator separator_Menu;
    // End of variables declaration//GEN-END:variables
}
