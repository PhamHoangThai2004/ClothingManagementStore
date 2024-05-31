package view.customer;

import execute.test.FormStart;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.entity.City;

public class ForgetPasswordForm extends javax.swing.JPanel {
    private FormStart formStart;
    private boolean showPassword;
    private boolean showRepeatPassword;
    
    public ForgetPasswordForm(FormStart formStart) {
        initComponents();
        this.formStart = formStart;
        ArrayList<City> list = City.getDSTinh();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_LoginOrRegister = new javax.swing.JPanel();
        label_AppName = new javax.swing.JLabel();
        rectButton_Login = new model.swing.RectButton();
        label_Logo = new javax.swing.JLabel();
        rectButton_Register = new model.swing.RectButton();
        panel_ForgetPasswordForm = new javax.swing.JPanel();
        label_Exit = new javax.swing.JLabel();
        label_Title = new javax.swing.JLabel();
        label_Instruction = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();
        textField_UserName = new javax.swing.JTextField();
        label_UserNameIcon = new javax.swing.JLabel();
        separator_UserName = new javax.swing.JSeparator();
        label_NewPassword = new javax.swing.JLabel();
        passwordField_NewPassword = new javax.swing.JPasswordField();
        label_NewPasswordIcon = new javax.swing.JLabel();
        separator_NewPassword = new javax.swing.JSeparator();
        ovalButton_Confirm = new model.swing.OvalButton();
        ovalButton_Cancel = new model.swing.OvalButton();
        separator_Email = new javax.swing.JSeparator();
        label_Email = new javax.swing.JLabel();
        label_EmailIcon = new javax.swing.JLabel();
        label_RepeatPassword = new javax.swing.JLabel();
        passwordField_RepeatPassword = new javax.swing.JPasswordField();
        label_RepeatPasswordIcon = new javax.swing.JLabel();
        separator_RepeatPassword = new javax.swing.JSeparator();
        textField_Email = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_LoginOrRegister.setBackground(new java.awt.Color(255, 255, 255));
        panel_LoginOrRegister.setPreferredSize(new java.awt.Dimension(300, 550));

        label_AppName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label_AppName.setForeground(new java.awt.Color(0, 80, 75));
        label_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_AppName.setText("SHOPE.ONLINE");

        rectButton_Login.setBackground(new java.awt.Color(0, 80, 75));
        rectButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        rectButton_Login.setText("LOGIN");
        rectButton_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rectButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectButton_Login_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectButton_Login_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rectButton_Login_MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rectButton_Login_MouseReleased(evt);
            }
        });

        label_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer/LogoShop256px.png"))); // NOI18N

        rectButton_Register.setBackground(new java.awt.Color(0, 80, 75));
        rectButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        rectButton_Register.setText("REGISTER");
        rectButton_Register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rectButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectButton_Register_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectButton_Register_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rectButton_Register_MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rectButton_Register_MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_LoginOrRegisterLayout = new javax.swing.GroupLayout(panel_LoginOrRegister);
        panel_LoginOrRegister.setLayout(panel_LoginOrRegisterLayout);
        panel_LoginOrRegisterLayout.setHorizontalGroup(
            panel_LoginOrRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_LoginOrRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_AppName, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_LoginOrRegisterLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_LoginOrRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rectButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_LoginOrRegisterLayout.setVerticalGroup(
            panel_LoginOrRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginOrRegisterLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(label_AppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Logo)
                .addGap(18, 18, 18)
                .addComponent(rectButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(rectButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        add(panel_LoginOrRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_ForgetPasswordForm.setBackground(new java.awt.Color(0, 80, 75));
        panel_ForgetPasswordForm.setPreferredSize(new java.awt.Dimension(400, 550));

        label_Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_Exit.setForeground(new java.awt.Color(255, 255, 255));
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

        label_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_Title.setForeground(new java.awt.Color(255, 255, 255));
        label_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Title.setText("FORGET PASSWORD");

        label_Instruction.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Instruction.setForeground(new java.awt.Color(255, 255, 255));
        label_Instruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Instruction.setText("Please fill in all information to confirm your account");

        label_UserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_UserName.setForeground(new java.awt.Color(255, 255, 255));
        label_UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_UserName.setText("UserName");

        textField_UserName.setBackground(new java.awt.Color(0, 80, 75));
        textField_UserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_UserName.setForeground(new java.awt.Color(255, 255, 255));
        textField_UserName.setBorder(null);

        label_UserNameIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_UserNameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/UserName24px.png"))); // NOI18N

        separator_UserName.setBackground(new java.awt.Color(255, 255, 255));
        separator_UserName.setForeground(new java.awt.Color(255, 255, 255));

        label_NewPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        label_NewPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NewPassword.setText("New Password");

        passwordField_NewPassword.setBackground(new java.awt.Color(0, 80, 75));
        passwordField_NewPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField_NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_NewPassword.setActionCommand("<Not Set>");
        passwordField_NewPassword.setBorder(null);

        label_NewPasswordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NewPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/EyeClose24px.png"))); // NOI18N
        label_NewPasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_NewPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_NewPasswordIconMouseClicked(evt);
            }
        });

        separator_NewPassword.setBackground(new java.awt.Color(255, 255, 255));
        separator_NewPassword.setForeground(new java.awt.Color(255, 255, 255));

        ovalButton_Confirm.setBorder(null);
        ovalButton_Confirm.setForeground(new java.awt.Color(0, 80, 75));
        ovalButton_Confirm.setText("CONFIRM");
        ovalButton_Confirm.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ovalButton_Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovalButton_Confirm_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ovalButton_Confirm_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ovalButton_Confirm_MouseExited(evt);
            }
        });

        ovalButton_Cancel.setBorder(null);
        ovalButton_Cancel.setForeground(new java.awt.Color(0, 80, 75));
        ovalButton_Cancel.setText("CANCEL");
        ovalButton_Cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ovalButton_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovalButton_Cancel_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ovalButton_Cancel_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ovalButton_Cancel_MouseExited(evt);
            }
        });

        separator_Email.setBackground(new java.awt.Color(255, 255, 255));
        separator_Email.setForeground(new java.awt.Color(255, 255, 255));

        label_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Email.setForeground(new java.awt.Color(255, 255, 255));
        label_Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Email.setText("Email");

        label_EmailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_EmailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer/Email24px.png"))); // NOI18N
        label_EmailIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_RepeatPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_RepeatPassword.setForeground(new java.awt.Color(255, 255, 255));
        label_RepeatPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_RepeatPassword.setText("Repeat Password");

        passwordField_RepeatPassword.setBackground(new java.awt.Color(0, 80, 75));
        passwordField_RepeatPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField_RepeatPassword.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_RepeatPassword.setActionCommand("<Not Set>");
        passwordField_RepeatPassword.setBorder(null);

        label_RepeatPasswordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_RepeatPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/EyeClose24px.png"))); // NOI18N
        label_RepeatPasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_RepeatPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_RepeatPasswordIconMouseClicked(evt);
            }
        });

        separator_RepeatPassword.setBackground(new java.awt.Color(255, 255, 255));
        separator_RepeatPassword.setForeground(new java.awt.Color(255, 255, 255));

        textField_Email.setBackground(new java.awt.Color(0, 80, 75));
        textField_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_Email.setForeground(new java.awt.Color(255, 255, 255));
        textField_Email.setBorder(null);

        javax.swing.GroupLayout panel_ForgetPasswordFormLayout = new javax.swing.GroupLayout(panel_ForgetPasswordForm);
        panel_ForgetPasswordForm.setLayout(panel_ForgetPasswordFormLayout);
        panel_ForgetPasswordFormLayout.setHorizontalGroup(
            panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ForgetPasswordFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Title)
                .addGap(43, 43, 43)
                .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ForgetPasswordFormLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_RepeatPassword)
                    .addComponent(label_Email)
                    .addComponent(separator_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NewPassword)
                    .addComponent(separator_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                        .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_UserNameIcon))
                    .addComponent(label_UserName)
                    .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                            .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ovalButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                            .addComponent(passwordField_NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label_NewPasswordIcon)))
                    .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                        .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordField_RepeatPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(separator_NewPassword)
                                .addComponent(separator_RepeatPassword, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(textField_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_EmailIcon)
                            .addComponent(label_RepeatPasswordIcon))))
                .addGap(29, 29, 29))
            .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Instruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ForgetPasswordFormLayout.setVerticalGroup(
            panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ForgetPasswordFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Instruction)
                .addGap(18, 18, 18)
                .addComponent(label_UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_UserNameIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_NewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField_NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NewPasswordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_RepeatPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField_RepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_RepeatPasswordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_RepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_EmailIcon)
                    .addComponent(textField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panel_ForgetPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ovalButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        add(panel_ForgetPasswordForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void label_Exit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_Exit_MouseClicked

    private void label_Exit_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseEntered
        label_Exit.setForeground(new Color(204, 0, 51));
    }//GEN-LAST:event_label_Exit_MouseEntered

    private void label_Exit_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Exit_MouseExited
        label_Exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_label_Exit_MouseExited

    private void label_NewPasswordIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_NewPasswordIconMouseClicked
        if(this.showPassword) {
            passwordField_NewPassword.setEchoChar('•');
            label_NewPasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeClose24px.png")));
        }
        else {
            passwordField_NewPassword.setEchoChar((char) 0);
            label_NewPasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeOpen24px.png")));
        }
        showPassword = !showPassword;
    }//GEN-LAST:event_label_NewPasswordIconMouseClicked

    private void ovalButton_Confirm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Confirm_MouseClicked
        
    }//GEN-LAST:event_ovalButton_Confirm_MouseClicked

    private void ovalButton_Confirm_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Confirm_MouseEntered
        ovalButton_Confirm.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_ovalButton_Confirm_MouseEntered

    private void ovalButton_Confirm_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Confirm_MouseExited
        ovalButton_Confirm.setForeground(new Color(0, 80, 75));
    }//GEN-LAST:event_ovalButton_Confirm_MouseExited

    private void ovalButton_Cancel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseClicked
        this.xoaForm();
    }//GEN-LAST:event_ovalButton_Cancel_MouseClicked

    private void ovalButton_Cancel_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseEntered
        ovalButton_Cancel.setForeground(new Color(204, 0, 51));
    }//GEN-LAST:event_ovalButton_Cancel_MouseEntered

    private void ovalButton_Cancel_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseExited
        ovalButton_Cancel.setForeground(new Color(0, 80, 75));
    }//GEN-LAST:event_ovalButton_Cancel_MouseExited

    private void label_RepeatPasswordIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RepeatPasswordIconMouseClicked
        if(this.showRepeatPassword) {
            passwordField_RepeatPassword.setEchoChar('•');
            label_RepeatPasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeClose24px.png")));
        }
        else {
            passwordField_RepeatPassword.setEchoChar((char) 0);
            label_RepeatPasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeOpen24px.png")));
        }
        showRepeatPassword = !showRepeatPassword;
    }//GEN-LAST:event_label_RepeatPasswordIconMouseClicked

    private void rectButton_Login_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Login_MouseClicked
        this.formStart.changePanel(this.formStart.forgetPasswordForm, this.formStart.loginForm);
        System.out.println("Có sử dụng 2");
    }//GEN-LAST:event_rectButton_Login_MouseClicked

    private void rectButton_Login_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Login_MouseEntered
        rectButton_Login.setBackground(new Color(255, 202, 89));
    }//GEN-LAST:event_rectButton_Login_MouseEntered

    private void rectButton_Login_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Login_MouseExited
        rectButton_Login.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_Login_MouseExited

    private void rectButton_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseClicked
        this.formStart.changePanel(this.formStart.forgetPasswordForm, this.formStart.registerForm);
    }//GEN-LAST:event_rectButton_Register_MouseClicked

    private void rectButton_Register_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseEntered
        rectButton_Register.setBackground(new Color(0, 0 , 204));
    }//GEN-LAST:event_rectButton_Register_MouseEntered

    private void rectButton_Register_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseExited
        rectButton_Register.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_Register_MouseExited

    private void rectButton_Register_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseReleased
        rectButton_Register.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_Register_MouseReleased

    private void rectButton_Login_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Login_MouseReleased
        rectButton_Login.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_Login_MouseReleased

    private void xoaForm() {
        textField_UserName.setText("");
        passwordField_NewPassword.setText("");
        passwordField_RepeatPassword.setText("");
        textField_Email.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_AppName;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_EmailIcon;
    private javax.swing.JLabel label_Exit;
    private javax.swing.JLabel label_Instruction;
    private javax.swing.JLabel label_Logo;
    private javax.swing.JLabel label_NewPassword;
    private javax.swing.JLabel label_NewPasswordIcon;
    private javax.swing.JLabel label_RepeatPassword;
    private javax.swing.JLabel label_RepeatPasswordIcon;
    private javax.swing.JLabel label_Title;
    private javax.swing.JLabel label_UserName;
    private javax.swing.JLabel label_UserNameIcon;
    private model.swing.OvalButton ovalButton_Cancel;
    private model.swing.OvalButton ovalButton_Confirm;
    private javax.swing.JPanel panel_ForgetPasswordForm;
    private javax.swing.JPanel panel_LoginOrRegister;
    private javax.swing.JPasswordField passwordField_NewPassword;
    private javax.swing.JPasswordField passwordField_RepeatPassword;
    private model.swing.RectButton rectButton_Login;
    private model.swing.RectButton rectButton_Register;
    private javax.swing.JSeparator separator_Email;
    private javax.swing.JSeparator separator_NewPassword;
    private javax.swing.JSeparator separator_RepeatPassword;
    private javax.swing.JSeparator separator_UserName;
    private javax.swing.JTextField textField_Email;
    private javax.swing.JTextField textField_UserName;
    // End of variables declaration//GEN-END:variables
}
