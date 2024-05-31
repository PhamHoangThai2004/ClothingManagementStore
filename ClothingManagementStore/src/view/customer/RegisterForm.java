package view.customer;

import database.connect.CityDAO;
import database.connect.AccountDAO;
import execute.test.FormStart;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import model.entity.City;
import model.entity.Account;

public class RegisterForm extends javax.swing.JPanel {
    private FormStart formStart;
    private boolean showPassword;
    private boolean showRepeatPassword;
    
    public RegisterForm(FormStart formStart) {
        initComponents();
        this.formStart = formStart;
        ArrayList<City> list = City.getDSTinh();
        for (City c : list) {
            newComboBox_Location.addItem(c.getCityName());
        }
        newComboBox_Location.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Login = new javax.swing.JPanel();
        label_AppName = new javax.swing.JLabel();
        label_Instruction = new javax.swing.JLabel();
        rectButton_Login = new model.swing.RectButton();
        label_Logo = new javax.swing.JLabel();
        panel_RegisterForm = new javax.swing.JPanel();
        label_Exit = new javax.swing.JLabel();
        label_Title = new javax.swing.JLabel();
        label_Recommend = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();
        textField_UserName = new javax.swing.JTextField();
        label_UserNameIcon = new javax.swing.JLabel();
        separator_UserName = new javax.swing.JSeparator();
        label_Password = new javax.swing.JLabel();
        passwordField_Password = new javax.swing.JPasswordField();
        label_PasswordIcon = new javax.swing.JLabel();
        separator_Password = new javax.swing.JSeparator();
        ovalButton_Register = new model.swing.OvalButton();
        ovalButton_Cancel = new model.swing.OvalButton();
        separator_Location = new javax.swing.JSeparator();
        newComboBox_Location = new model.swing.NewComboBox();
        label_Location = new javax.swing.JLabel();
        label_LocationIcon = new javax.swing.JLabel();
        label_RepeatPassword = new javax.swing.JLabel();
        passwordField_RepeatPassword = new javax.swing.JPasswordField();
        label_RepeatPasswordIcon = new javax.swing.JLabel();
        separator_RepeatPassword = new javax.swing.JSeparator();
        label_Error = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Login.setBackground(new java.awt.Color(255, 255, 255));
        panel_Login.setPreferredSize(new java.awt.Dimension(300, 550));

        label_AppName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label_AppName.setForeground(new java.awt.Color(0, 80, 75));
        label_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_AppName.setText("SHOPE.ONLINE");

        label_Instruction.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Instruction.setForeground(new java.awt.Color(0, 80, 75));
        label_Instruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Instruction.setText("You want to quick access to the application?");

        rectButton_Login.setBackground(new java.awt.Color(0, 80, 75));
        rectButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        rectButton_Login.setText("LOGIN");
        rectButton_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rectButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectButton_Login_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectButton_LoginrectButton_Login_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rectButton_LoginrectButton_Login_MouseExited(evt);
            }
        });

        label_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer/LogoShop256px.png"))); // NOI18N

        javax.swing.GroupLayout panel_LoginLayout = new javax.swing.GroupLayout(panel_Login);
        panel_Login.setLayout(panel_LoginLayout);
        panel_LoginLayout.setHorizontalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_AppName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(label_Instruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(rectButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_LoginLayout.setVerticalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(label_AppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Logo)
                .addGap(18, 18, 18)
                .addComponent(label_Instruction)
                .addGap(18, 18, 18)
                .addComponent(rectButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        add(panel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_RegisterForm.setBackground(new java.awt.Color(0, 80, 75));
        panel_RegisterForm.setPreferredSize(new java.awt.Dimension(400, 550));

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
        label_Title.setText("REGISTER");

        label_Recommend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Recommend.setForeground(new java.awt.Color(255, 255, 255));
        label_Recommend.setText("Welcome to Shope.online. Please fill in your information ");

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
                label_PasswordIconMouseClicked(evt);
            }
        });

        separator_Password.setBackground(new java.awt.Color(255, 255, 255));
        separator_Password.setForeground(new java.awt.Color(255, 255, 255));

        ovalButton_Register.setBorder(null);
        ovalButton_Register.setForeground(new java.awt.Color(0, 80, 75));
        ovalButton_Register.setText("REGISTER");
        ovalButton_Register.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ovalButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovalButton_Register_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ovalButton_Register_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ovalButton_Register_MouseExited(evt);
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

        separator_Location.setBackground(new java.awt.Color(255, 255, 255));
        separator_Location.setForeground(new java.awt.Color(255, 255, 255));

        newComboBox_Location.setOpaque(true);

        label_Location.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Location.setForeground(new java.awt.Color(255, 255, 255));
        label_Location.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Location.setText("City");

        label_LocationIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_LocationIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer/Location24px.png"))); // NOI18N
        label_LocationIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        label_Error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel_RegisterFormLayout = new javax.swing.GroupLayout(panel_RegisterForm);
        panel_RegisterForm.setLayout(panel_RegisterFormLayout);
        panel_RegisterFormLayout.setHorizontalGroup(
            panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RegisterFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RegisterFormLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RegisterFormLayout.createSequentialGroup()
                        .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_RepeatPassword)
                            .addComponent(label_Location)
                            .addComponent(separator_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Password)
                            .addComponent(separator_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                                .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_UserNameIcon))
                            .addComponent(label_UserName)
                            .addComponent(label_Recommend)
                            .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                                    .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ovalButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                                    .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label_PasswordIcon)))
                            .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordField_RepeatPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newComboBox_Location, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(separator_Password)
                                    .addComponent(separator_RepeatPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_LocationIcon)
                                    .addComponent(label_RepeatPasswordIcon))))
                        .addGap(20, 20, 20))))
        );
        panel_RegisterFormLayout.setVerticalGroup(
            panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_RegisterFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Recommend)
                .addGap(18, 18, 18)
                .addComponent(label_UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_UserNameIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_PasswordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_RepeatPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField_RepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_RepeatPasswordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_RepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Location)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newComboBox_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_LocationIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovalButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ovalButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        add(panel_RegisterForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, -1));
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

    private void label_PasswordIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PasswordIconMouseClicked
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
    }//GEN-LAST:event_label_PasswordIconMouseClicked

    private void ovalButton_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Register_MouseClicked
        String userName = textField_UserName.getText();
        
        char passwordchars[] = passwordField_Password.getPassword();
        String password = new String(passwordchars);
        Arrays.fill(passwordchars, '0');
        
        char repeatPasswordchars[] = passwordField_RepeatPassword.getPassword();
        String repeatPassword = new String(repeatPasswordchars);
        Arrays.fill(repeatPasswordchars, '0');
        
        String location = (String) newComboBox_Location.getSelectedItem();
        System.out.println("Gia tru: " + password);
        if(userName.isEmpty() || password.isEmpty() || location == null) {
            label_Error.setText("Vui lòng điền đầy đủ thông tin");           
        }
        else {
            label_Error.setText("");
            if(password.equals(repeatPassword)) {
                label_Error.setText("");
                City c = new City(-1, location);
                City city = CityDAO.setOBJ().Select(c);
                
                LocalDate localDate = LocalDate.now();
                Date nowDate = Date.valueOf(localDate);
                Account account = new Account(userName, password, nowDate, 
                        city, "Customer", true);
                
                try {     
                    int kq = AccountDAO.setOBJ().Add(account);
                    if(kq > 0)  label_Error.setText("");
                    else  label_Error.setText("Tên tài khoản đã tồn tại");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else   label_Error.setText("Mật khẩu phải trùng nhau");
        }
        
    }//GEN-LAST:event_ovalButton_Register_MouseClicked

    private void ovalButton_Register_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Register_MouseEntered
        ovalButton_Register.setForeground(new Color(0, 0, 204));
    }//GEN-LAST:event_ovalButton_Register_MouseEntered

    private void ovalButton_Register_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalButton_Register_MouseExited
        ovalButton_Register.setForeground(new Color(0, 80, 75));
    }//GEN-LAST:event_ovalButton_Register_MouseExited

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
        this.formStart.changePanel(this.formStart.registerForm, this.formStart.loginForm);
        System.out.println("Có sử dụng 2");
    }//GEN-LAST:event_rectButton_Login_MouseClicked

    private void rectButton_LoginrectButton_Login_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_LoginrectButton_Login_MouseEntered
        rectButton_Login.setBackground(new Color(255, 202, 89));
    }//GEN-LAST:event_rectButton_LoginrectButton_Login_MouseEntered

    private void rectButton_LoginrectButton_Login_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectButton_LoginrectButton_Login_MouseExited
        rectButton_Login.setBackground(new Color(0, 80, 75));
    }//GEN-LAST:event_rectButton_LoginrectButton_Login_MouseExited

    private void xoaForm() {
        textField_UserName.setText("");
        passwordField_Password.setText("");
        passwordField_RepeatPassword.setText("");
        newComboBox_Location.setSelectedIndex(-1);
        label_Error.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_AppName;
    private javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Exit;
    private javax.swing.JLabel label_Instruction;
    private javax.swing.JLabel label_Location;
    private javax.swing.JLabel label_LocationIcon;
    private javax.swing.JLabel label_Logo;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_PasswordIcon;
    private javax.swing.JLabel label_Recommend;
    private javax.swing.JLabel label_RepeatPassword;
    private javax.swing.JLabel label_RepeatPasswordIcon;
    private javax.swing.JLabel label_Title;
    private javax.swing.JLabel label_UserName;
    private javax.swing.JLabel label_UserNameIcon;
    private model.swing.NewComboBox newComboBox_Location;
    private model.swing.OvalButton ovalButton_Cancel;
    private model.swing.OvalButton ovalButton_Register;
    private javax.swing.JPanel panel_Login;
    private javax.swing.JPanel panel_RegisterForm;
    private javax.swing.JPasswordField passwordField_Password;
    private javax.swing.JPasswordField passwordField_RepeatPassword;
    private model.swing.RectButton rectButton_Login;
    private javax.swing.JSeparator separator_Location;
    private javax.swing.JSeparator separator_Password;
    private javax.swing.JSeparator separator_RepeatPassword;
    private javax.swing.JSeparator separator_UserName;
    private javax.swing.JTextField textField_UserName;
    // End of variables declaration//GEN-END:variables
}
