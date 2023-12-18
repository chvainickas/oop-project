/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author edward
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminGUI() {
        initComponents();
        loadUserDataToTable();
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

    }

    private void loadUserDataToTable() {
        // read user csv file and populate list
        List<User> userList = readUserDataFromCSV();

        // creates a new table model
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[] { "UserID", "Username", "Password", "Email", "Role", "First Name", "Last Name", "Age" },
                0);

        // populates the table model with users
        for (User user : userList) {
            tableModel.addRow(new Object[] {
                    user.getUserID(),
                    user.getUserName(),
                    user.getUserPass(),
                    user.getEmail(),
                    user.getRole(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getAge()
            });
        }

        // applies the new model to the table
        usersTable.setModel(tableModel);
    }

    // helps read the csv file
    private List<User> readUserDataFromCSV() {
        List<User> userList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("src/project/users.csv"))) {
            String line;
            br.readLine(); // ignore headings

            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 8) {
                    User user = new User(
                            userData[0], userData[1], userData[2],
                            userData[3], Integer.parseInt(userData[4]),
                            userData[5], userData[6], Integer.parseInt(userData[7]));
                    userList.add(user);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return userList;
    }

    private void removeSelectedUser() {
        removeUserBtn.setEnabled(false);

        int selectedRow = usersTable.getSelectedRow();

        if (selectedRow != -1) {
            int userID = (int) usersTable.getValueAt(selectedRow, 0);

            DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
            model.removeRow(selectedRow);

            removeUserFromCSV(userID); // writes the update table into the csv

            removeUserBtn.setEnabled(true);

            // if the user is removed write message
            JOptionPane.showMessageDialog(this, "User removed successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        removeUserBtn.setEnabled(true);

    }

    private void performSearch() {
        String searchText = searchInput.getText().toLowerCase(); // convert to lowercase for case-insensitive search

        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        model.setRowCount(0); // clear existing rows

        List<User> userList = readUserDataFromCSV(); // assuming you have a method to read user data

        for (User user : userList) {
            // check if string is in the username
            if (user.getUserName().toLowerCase().contains(searchText)) {
                // add all matching users to the table
                model.addRow(new Object[] {
                        user.getUserID(), user.getUserName(), user.getUserPass(), user.getEmail(), user.getRole(),
                        user.getFirstName(), user.getLastName(), user.getAge(),
                });
            }
        }
    }

    private void removeUserFromCSV(int userID) {
        String filePath = "src/project/users.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = br.lines().collect(Collectors.toList()); // reads all lines into the list

            // finds the line with the specified userID
            lines.removeIf(line -> {
                String[] parts = line.split(",");
                if (parts.length >= 5) { // makes sure there is at least 5 fields in the csv
                    int currentUserID;
                    try {
                        currentUserID = Integer.parseInt(parts[4].trim());
                    } catch (NumberFormatException e) {
                        // if no userID don't remove anything
                        return false;
                    }

                    return currentUserID == userID;
                }
                return false;
            });

            // writes the new users into csv after change
            try (FileWriter writer = new FileWriter(filePath)) {
                for (String line : lines) {
                    writer.write(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // refreshes current users
    private void reloadUserData() {
        loadUserDataToTable();
        JOptionPane.showMessageDialog(this, "Table refreshed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanelLbl = new javax.swing.JLabel();
        tablePane = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        buttonsPane = new javax.swing.JPanel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        reloadBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminPanelLbl.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        adminPanelLbl.setText("All Users");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "UserID", "Username", "Password", "Email", "Role", "First Name", "Last Name", "Age"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
                    java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[] {
                    false, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablePane.setViewportView(usersTable);
        if (usersTable.getColumnModel().getColumnCount() > 0) {
            usersTable.getColumnModel().getColumn(0).setResizable(false);
        }

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        reloadBtn.setText("Reload Users");
        reloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setText("Remove User");
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Search Username:");

        javax.swing.GroupLayout buttonsPaneLayout = new javax.swing.GroupLayout(buttonsPane);
        buttonsPane.setLayout(buttonsPaneLayout);
        buttonsPaneLayout.setHorizontalGroup(
                buttonsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        buttonsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(searchInput)
                                                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(removeUserBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(reloadBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(buttonsPaneLayout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        buttonsPaneLayout.setVerticalGroup(
                buttonsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn)
                                .addGap(94, 94, 94)
                                .addComponent(addUserBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeUserBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reloadBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112,
                                        Short.MAX_VALUE)
                                .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)));

        closeBtn.getAccessibleContext().setAccessibleName("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(adminPanelLbl))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 683,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonsPane, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 62, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(adminPanelLbl)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonsPane, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(192, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reloadBtnActionPerformed
        // Reload the data from the CSV file
        loadUserDataToTable();

        // Show a success message or perform any other necessary actions
        JOptionPane.showMessageDialog(this, "Table reloaded successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    }// GEN-LAST:event_reloadBtnActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeUserBtnActionPerformed
        removeSelectedUser();
    }// GEN-LAST:event_removeUserBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }// GEN-LAST:event_closeBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
        performSearch();
    }// GEN-LAST:event_searchBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addUserBtnActionPerformed
        RegistrationGUI registrationForm = new RegistrationGUI();
        registrationForm.setVisible(true); // TODO add your handling code here:
    }// GEN-LAST:event_addUserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /*
         * //</editor-fold>
         * Create and display the form
         */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JLabel adminPanelLbl;
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reloadBtn;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
