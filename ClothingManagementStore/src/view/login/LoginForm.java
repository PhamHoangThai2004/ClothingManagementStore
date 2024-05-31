package view.login;

import database.connect.AccountDAO;
import execute.test.FormStart;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.entity.Account;

public class LoginForm extends javax.swing.JPanel {
    private FormStart formStart;
    private boolean showPassword;
    
    public LoginForm(FormStart formStart) {
        initComponents();
        this.formStart = formStart;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Register = new javax.swing.JPanel();
        label_AppName = new javax.swing.JLabel();
        label_Instruction = new javax.swing.JLabel();
        rectButton_Register = new model.swing.RectButton();
        label_Logo = new javax.swing.JLabel();
        panel_LoginForm = new javax.swing.JPanel();
        label_Exit = new javax.swing.JLabel();
        label_Title = new javax.swing.JLabel();
        label_Recommend = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();
        textField_UserName = new javax.swing.JTextField();
        label_UserNameIcon = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        passwordField_Password = new javax.swing.JPasswordField();
        label_PasswordIcon = new javax.swing.JLabel();
        checkBox_Password = new javax.swing.JCheckBox();
        label_ForgetPassword = new javax.swing.JLabel();
        ovalButton_Login = new model.swing.OvalButton();
        ovalButton_Cancel = new model.swing.OvalButton();
        separator_UserName = new javax.swing.JSeparator();
        separator_Password = new javax.swing.JSeparator();
        label_Error = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Register.setBackground(new java.awt.Color(255, 255, 255));
        panel_Register.setPreferredSize(new java.awt.Dimension(300, 550));

        label_AppName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label_AppName.setForeground(new java.awt.Color(0, 80, 75));
        label_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_AppName.setText("SHOPE.ONLINE");

        label_Instruction.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Instruction.setForeground(new java.awt.Color(0, 80, 75));
        label_Instruction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Instruction.setText("<html>You do not have an account? <br> Please register</html>");

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
        });

        label_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer/LogoShop256px.png"))); // NOI18N

        javax.swing.GroupLayout panel_RegisterLayout = new javax.swing.GroupLayout(panel_Register);
        panel_Register.setLayout(panel_RegisterLayout);
        panel_RegisterLayout.setHorizontalGroup(
            panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_AppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_RegisterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(rectButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Instruction))
        );
        panel_RegisterLayout.setVerticalGroup(
            panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegisterLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(label_AppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Logo)
                .addGap(18, 18, 18)
                .addComponent(label_Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rectButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        add(panel_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_LoginForm.setBackground(new java.awt.Color(0, 80, 75));
        panel_LoginForm.setPreferredSize(new java.awt.Dimension(400, 550));

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
        label_Title.setText("LOGIN");

        label_Recommend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Recommend.setForeground(new java.awt.Color(255, 255, 255));
        label_Recommend.setText("Welcome to Shope.online. Please login to your account ");

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

        label_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Password.setForeground(new java.awt.Color(255, 255, 255));
        label_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Password.setText("Password");

        passwordField_Password.setBackground(new java.awt.Color(0, 80, 75));
        passwordField_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField_Password.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_Password.setActionCommand("<Not Set>");
        passwordField_Password.setBorder(null);

        label_PasswordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/EyeClose24px.png"))); // NOI18N
        label_PasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_PasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_PasswordIcon_MouseClicked(evt);
            }
        });

        checkBox_Password.setBackground(new java.awt.Color(0, 80, 75));
        checkBox_Password.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        checkBox_Password.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_Password.setText("Remember Password");
        checkBox_Password.setBorder(null);
        checkBox_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_ForgetPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        label_ForgetPassword.setForeground(new java.awt.Color(255, 255, 255));
        label_ForgetPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ForgetPassword.setText("Forget Password?");
        label_ForgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ForgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ForgetPassword_MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_ForgetPassword_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label_ForgetPassword_MouseReleased(evt);
            }
        });

        ovalButton_Login.setBorder(null);
        ovalButton_Login.setForeground(new java.awt.Color(0, 80, 75));
        ovalButton_Login.setText("LOGIN");
        ovalButton_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ovalButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovalButton_Login_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ovalButton_Login_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ovalButton_Login_MouseExited(evt);
            }
        });

        ovalButton_Cancel.setBorder(null);
        ovalButton_Cancel.setForeground(new java.awt.Color(0, 80, 75));
        ovalButton_Cancel.setText("CANCEL");
        ovalButton_Cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        label_Error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel_LoginFormLayout = new javax.swing.GroupLayout(panel_LoginForm);
        panel_LoginForm.setLayout(panel_LoginFormLayout);
        panel_LoginFormLayout.setHorizontalGroup(
            panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LoginFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_LoginFormLayout.createSequentialGroup()
                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_LoginFormLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_UserName)
                            .addComponent(label_Recommend)
                            .addGroup(panel_LoginFormLayout.createSequentialGroup()
                                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(separator_Password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_LoginFormLayout.createSequentialGroup()
                                        .addComponent(checkBox_Password)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(label_ForgetPassword))
                                    .addComponent(passwordField_Password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_UserName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separator_UserName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_PasswordIcon)
                                    .addComponent(label_UserNameIcon)))))
                    .addGroup(panel_LoginFormLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ovalButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LoginFormLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_LoginFormLayout.setVerticalGroup(
            panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginFormLayout.createSequentialGroup()
                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_LoginFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Recommend)
                .addGap(18, 18, 18)
                .addComponent(label_UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_UserNameIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_PasswordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox_Password)
                    .addComponent(label_ForgetPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(ovalButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        add(panel_LoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));
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

    private void label_PasswordIcon_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PasswordIcon_MouseClicked
        if(this.showPassword) {
            passwordField_Password.setEchoChar('•');
            label_PasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeClose24px.png")));
        }
        else {
            passwordField_Password.setEchoChar((char) 0);
            label_PasswordIcon.setIcon(new ImageIcon(
                getClass().getResource("/icon/login/EyeOpen24px.png")));
        }
        showPassword = !showPassword;
    }//GEN-LAST:event_label_PasswordIcon_MouseClicked

    private void ovalButton_Login_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Login_MouseClicked
        String userName = textField_UserName.getText();

        char[] passwordChars = passwordField_Password.getPassword();
        String password = new String(passwordChars);

        Arrays.fill(passwordChars, '0');

        if(userName.isEmpty() || password.isEmpty()) {
            label_Error.setText("Vui lòng điền đầy đủ thông tin");
        }
        else {
            Account a = new Account(userName, password, null,
            null, null, true);      
            Account account = AccountDAO.setOBJ().Select(a);
            if(account != null) {              
                label_Error.setText("");
                System.out.println(account.getUserName());
                System.out.println(account.getPassword());
                System.out.println(account.getCreationDate());
                System.out.println(account.getLocation());
                System.out.println(account.getAuthority());
                System.out.println(account.isStatus());
                this.formStart.dispose();
                
//                JOptionPane.showMessageDialog(this.formStart, 
//                        "Đăng nhập thành công", "Login",
//                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                label_Error.setText("Tài khoản hoặc mật khẩu không chính xác");
                System.err.println("lỗi");
            }
        }
    }//GEN-LAST:event_ovalButton_Login_MouseClicked

    private void ovalButton_Login_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Login_MouseEntered
        ovalButton_Login.setForeground(new Color(255, 202, 89));
    }//GEN-LAST:event_ovalButton_Login_MouseEntered

    private void ovalButton_Login_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Login_MouseExited
        ovalButton_Login.setForeground(new Color(0, 80, 75));
    }//GEN-LAST:event_ovalButton_Login_MouseExited

    private void ovalButton_Cancel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseClicked
        this.xoaForm();
    }//GEN-LAST:event_ovalButton_Cancel_MouseClicked

    private void ovalButton_Cancel_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseEntered
        ovalButton_Cancel.setForeground(new Color(204, 0, 51));
    }//GEN-LAST:event_ovalButton_Cancel_MouseEntered

    private void ovalButton_Cancel_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Cancel_MouseExited
        ovalButton_Cancel.setForeground(new Color(0, 80, 75));
    }//GEN-LAST:event_ovalButton_Cancel_MouseExited

    private void rectButton_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseClicked
        this.formStart.changePanel(this.formStart.loginForm, this.formStart.registerForm);
        System.out.println("Có sử dụng 1");
    }//GEN-LAST:event_rectButton_Register_MouseClicked

    private void rectButton_Register_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseEntered
        rectButton_Register.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_rectButton_Register_MouseEntered

    private void rectButton_Register_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_Register_MouseExited
        rectButton_Register.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_Register_MouseExited

    private void label_ForgetPassword_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ForgetPassword_MouseClicked
        this.formStart.changePanel(this.formStart.loginForm, this.formStart.forgetPasswordForm);
        System.out.println("Có sử dụng 3");
    }//GEN-LAST:event_label_ForgetPassword_MouseClicked

    private void label_ForgetPassword_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ForgetPassword_MousePressed
        label_ForgetPassword.setForeground(new Color(204, 204, 255));
    }//GEN-LAST:event_label_ForgetPassword_MousePressed

    private void label_ForgetPassword_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ForgetPassword_MouseReleased
        label_ForgetPassword.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_label_ForgetPassword_MouseReleased

    private void xoaForm() {
        textField_UserName.setText("");
        passwordField_Password.setText("");
        label_Error.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox_Password;
    private javax.swing.JLabel label_AppName;
    private javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Exit;
    private javax.swing.JLabel label_ForgetPassword;
    private javax.swing.JLabel label_Instruction;
    private javax.swing.JLabel label_Logo;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_PasswordIcon;
    private javax.swing.JLabel label_Recommend;
    private javax.swing.JLabel label_Title;
    private javax.swing.JLabel label_UserName;
    private javax.swing.JLabel label_UserNameIcon;
    private model.swing.OvalButton ovalButton_Cancel;
    private model.swing.OvalButton ovalButton_Login;
    private javax.swing.JPanel panel_LoginForm;
    private javax.swing.JPanel panel_Register;
    private javax.swing.JPasswordField passwordField_Password;
    private model.swing.RectButton rectButton_Register;
    private javax.swing.JSeparator separator_Password;
    private javax.swing.JSeparator separator_UserName;
    private javax.swing.JTextField textField_UserName;
    // End of variables declaration//GEN-END:variables
}
