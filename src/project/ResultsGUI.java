/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;

/**
 *
 * @author pylyp
 */
public class ResultsGUI extends javax.swing.JFrame {

    /**
     * Creates new form ResultsGUI
     */
    Results res;
    Quiz quiz;
    
    public ResultsGUI() {
        initComponents();
        //Set background color for elements
        getContentPane().setBackground(Color.decode("#DDA0DD"));
        //Center form in screen
        setLocationRelativeTo(null);
    }
    
    public void setQuiz(Quiz quiz){
        this.quiz = quiz;
        Results res = new Results();
        
        if(quiz != null){ //If quiz is loaded
            int finalScore = res.calculateScore(quiz);
            pointsLBL.setText(finalScore + "/" + quiz.questionList.length);
            
            if(finalScore < 7){
                titleLBL.setText("You have failed the test. Better luck next time!");
            }else if(finalScore >= 7 && finalScore < 12){
                titleLBL.setText("You passed the text, congratulations!");
            }else if(finalScore > 12){
                titleLBL.setText("Your climate awareness is amazing, congratulations!");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        resultLBL = new javax.swing.JLabel();
        pointsLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        reviewBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(754, 503));
        setMinimumSize(new java.awt.Dimension(754, 503));

        titleLBL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLBL.setText("Test performance message");

        resultLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultLBL.setText("Your result is ");

        pointsLBL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pointsLBL.setText("Points");

        exitBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        reviewBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reviewBTN.setText("Review");
        reviewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pointsLBL)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(reviewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(resultLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pointsLBL)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reviewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        resultLBL.getAccessibleContext().setAccessibleName("Your result is ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void reviewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBTNActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ReviewGUI revGUI = new ReviewGUI();
        revGUI.setRev(quiz);
        revGUI.setVisible(true);
    }//GEN-LAST:event_reviewBTNActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel pointsLBL;
    private javax.swing.JLabel resultLBL;
    private javax.swing.JButton reviewBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
