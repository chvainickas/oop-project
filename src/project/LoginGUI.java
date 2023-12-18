/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author edward
 */
public class LoginGUI extends javax.swing.JFrame {
    private User currentUser;

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
        
        //Set color
        getContentPane().setBackground(Color.decode("#FF8282"));
        inputPane.setBackground(Color.decode("#FF8282"));
        buttonsPanel.setBackground(Color.decode("#FF8282"));
        
        verifyLoginBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            verifyLoginBtnActionPerformed(evt);
        });
        registerUserBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            registerUserBtnActionPerformed(evt);
        });
    }

    // verify login logic
    private void verifyLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String enteredUsername = usernameInput.getText();
        String enteredPassword = passwordInput.getText();

        List<User> userList = User.readUserDataFromCSV();

        boolean loginSuccessful = false;
        for (User user : userList) {
            if (enteredUsername.equals(user.getUserName()) && enteredPassword.equals(user.getUserPass())) {
                currentUser = user;

                MainMenuGUI mainMenu = new MainMenuGUI(user);
                mainMenu.welcomeMsg(user);
                mainMenu.setVisible(true);
                this.dispose();

                loginSuccessful = true;
                break;
            }
        }

        if (!loginSuccessful) {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Login Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }



    private void registerUserBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // registration form
        RegistrationGUI registrationForm = new RegistrationGUI();
        registrationForm.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormLbl = new javax.swing.JLabel();
        inputPane = new javax.swing.JPanel();
        usernameInput = new javax.swing.JTextField();
        usernameLbl = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        registerUserBtn = new javax.swing.JButton();
        verifyLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginFormLbl.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        loginFormLbl.setText("Login");

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        usernameLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLbl.setText("Username:");

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLbl.setText("Password:");

        javax.swing.GroupLayout inputPaneLayout = new javax.swing.GroupLayout(inputPane);
        inputPane.setLayout(inputPaneLayout);
        inputPaneLayout.setHorizontalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addComponent(usernameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inputPaneLayout.setVerticalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        registerUserBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerUserBtn.setText("Register");
        registerUserBtn.setToolTipText("");

        verifyLoginBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verifyLoginBtn.setText("Login");
        verifyLoginBtn.setActionCommand("");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerUserBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(verifyLoginBtn)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerUserBtn)
                    .addComponent(verifyLoginBtn))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(loginFormLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(loginFormLbl)
                .addGap(83, 83, 83)
                .addComponent(inputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel inputPane;
    private javax.swing.JLabel loginFormLbl;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton registerUserBtn;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JButton verifyLoginBtn;
    // End of variables declaration//GEN-END:variables
}
