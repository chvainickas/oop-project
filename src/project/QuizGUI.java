/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Daniel García
 */
public class QuizGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuizForm
     */
    User currentUser;
    int questionCount = 0;
    Quiz quiz;
    Question question;
    Connection conn = null;
    
    public QuizGUI() {
        initComponents();

        //Center form in screen
        setLocationRelativeTo(null);
        
        //Set background color for elements
        getContentPane().setBackground(Color.decode("#ACE1AF"));
        txtareaQuestion.setBackground(Color.decode("#ACE1AF"));
        jScrollPane1.setBorder(null);
        radAnswerA.setBackground(Color.decode("#ACE1AF"));
        radAnswerB.setBackground(Color.decode("#ACE1AF"));
        radAnswerC.setBackground(Color.decode("#ACE1AF"));
        radAnswerD.setBackground(Color.decode("#ACE1AF"));

        //Load questions and answers
        quiz = new Quiz();
        quiz.loadQuestions();
        quiz.loadAnswers();
        
        question = quiz.questionList[questionCount];
        Answer ansA = question.getAnswers()[0];
        Answer ansB = question.getAnswers()[1];
        Answer ansC = question.getAnswers()[2];
        Answer ansD = question.getAnswers()[3];

        //Load question and answers into gui
        lblQuestionTitle.setText("Question " + question.getNumber() + "/" + quiz.questionList.length + ": ");
        //load section
        lblSection.setText(question.getSection());
        txtareaQuestion.setText(question.getText());
        radAnswerA.setText(ansA.getText());
        radAnswerB.setText(ansB.getText());
        radAnswerC.setText(ansC.getText());
        radAnswerD.setText(ansD.getText());
        //Load image
        try{
            BufferedImage bufferedImage = ImageIO.read(getClass().getResource("img/" + question.getImgPath()));
            Image image = bufferedImage.getScaledInstance(375, 350, Image.SCALE_DEFAULT); 
            ImageIcon icon = new ImageIcon(image);
            lblImg.setIcon(icon);
        }catch(IOException e){
            System.out.println("Error in getting image: " + e);
        }
    }
    
    public void setUser(User currentUser)
    {
        this.currentUser = currentUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAnswers = new javax.swing.ButtonGroup();
        lblAnswerA = new javax.swing.JLabel();
        lblAnswerB = new javax.swing.JLabel();
        lblAnswerC = new javax.swing.JLabel();
        lblAnswerD = new javax.swing.JLabel();
        lblSectionTitle = new javax.swing.JLabel();
        lblQuestionTitle = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnNextQuestion = new javax.swing.JButton();
        lblSection = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaQuestion = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        radAnswerA = new javax.swing.JRadioButton();
        radAnswerB = new javax.swing.JRadioButton();
        radAnswerC = new javax.swing.JRadioButton();
        radAnswerD = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Climate quiz");

        lblAnswerA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAnswerA.setText("A.");

        lblAnswerB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAnswerB.setText("B.");

        lblAnswerC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAnswerC.setText("C.");

        lblAnswerD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAnswerD.setText("D.");

        lblSectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSectionTitle.setText("Section");

        lblQuestionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuestionTitle.setText("Question number");

        lblImg.setText("Image here");

        btnNextQuestion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNextQuestion.setText("Next");
        btnNextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextQuestionActionPerformed(evt);
            }
        });

        lblSection.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSection.setText("Section title");

        txtareaQuestion.setEditable(false);
        txtareaQuestion.setColumns(1);
        txtareaQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtareaQuestion.setLineWrap(true);
        txtareaQuestion.setRows(2);
        txtareaQuestion.setText("question here");
        txtareaQuestion.setWrapStyleWord(true);
        txtareaQuestion.setAutoscrolls(false);
        txtareaQuestion.setFocusable(false);
        jScrollPane1.setViewportView(txtareaQuestion);

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setText("Return to menu");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnGroupAnswers.add(radAnswerA);
        radAnswerA.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        radAnswerA.setText("Answer 1");
        radAnswerA.setMaximumSize(new java.awt.Dimension(89, 24));
        radAnswerA.setMinimumSize(new java.awt.Dimension(89, 24));
        radAnswerA.setPreferredSize(new java.awt.Dimension(89, 24));

        btnGroupAnswers.add(radAnswerB);
        radAnswerB.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        radAnswerB.setText("Answer 2");

        btnGroupAnswers.add(radAnswerC);
        radAnswerC.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        radAnswerC.setText("Answer 3");

        btnGroupAnswers.add(radAnswerD);
        radAnswerD.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        radAnswerD.setText("Answer 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(btnNextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSection, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSectionTitle)
                    .addComponent(lblSection))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestionTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnswerA)
                    .addComponent(radAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAnswerB))
                    .addComponent(radAnswerB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAnswerC))
                    .addComponent(radAnswerC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radAnswerD))
                .addGap(18, 18, 18)
                .addComponent(btnNextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextQuestionActionPerformed
        //Load next question and save answers
        boolean selected = false; //boolean to determine if any of the options was selected
        //Save user answer
        if(radAnswerA.isSelected()){
            quiz.userAnswers.add(quiz.questionList[questionCount].getAnswers()[0].getOption());
            selected = true;
        }else if(radAnswerB.isSelected()){
            quiz.userAnswers.add(quiz.questionList[questionCount].getAnswers()[1].getOption());
            selected = true;
        }else if(radAnswerC.isSelected()){
            quiz.userAnswers.add(quiz.questionList[questionCount].getAnswers()[2].getOption());
            selected = true;
        }else if(radAnswerD.isSelected()){
            quiz.userAnswers.add(quiz.questionList[questionCount].getAnswers()[3].getOption());
            selected = true;
        }else{
            //Display message that user can't go to next question until the current one is answered
            selected = false;
            JOptionPane.showMessageDialog(null, "Please select an option before continue");
        }
        if(selected)
        {
            if(questionCount<14)
            {
                //Load next question
                questionCount++; 
                question = quiz.questionList[questionCount];
                Answer ansA = question.getAnswers()[0];
                Answer ansB = question.getAnswers()[1];
                Answer ansC = question.getAnswers()[2];
                Answer ansD = question.getAnswers()[3];
                //Load image
                try{
                    BufferedImage bufferedImage = ImageIO.read(getClass().getResource("img/" + question.getImgPath()));
                    Image image = bufferedImage.getScaledInstance(375, 350, Image.SCALE_DEFAULT); 
                    ImageIcon icon = new ImageIcon(image);
                    lblImg.setIcon(icon);
                }catch(IOException e){
                    System.out.println("Error in getting image: " + e);
                }

                lblQuestionTitle.setText("Question " + question.getNumber() + "/" + quiz.questionList.length + ": ");
                //load section
                lblSection.setText(question.getSection());
                txtareaQuestion.setText(question.getText());
                //Clear previous selection
                btnGroupAnswers.clearSelection();
                radAnswerA.setText(ansA.getText());
                radAnswerB.setText(ansB.getText());
                radAnswerC.setText(ansC.getText());
                radAnswerD.setText(ansD.getText());

            }else{
                //Insert score in database
                int finalScore = quiz.calculateScore();
                ManageDB db = new ManageDB();
                ManageDB.setConnection();
                //Update score for current user
                if(this.currentUser != null)
                {
                   db.updateScore(this.currentUser.userID, finalScore); 
                }
                
                //Call to the results form (Maks results form)
                setVisible(false);
                ResultsGUI resultGUI = new ResultsGUI();
                //set quiz info at result GUI
                resultGUI.setQuiz(quiz);
                resultGUI.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnNextQuestionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new QuizIntroGUI().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroupAnswers;
    private javax.swing.JButton btnNextQuestion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnswerA;
    private javax.swing.JLabel lblAnswerB;
    private javax.swing.JLabel lblAnswerC;
    private javax.swing.JLabel lblAnswerD;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblQuestionTitle;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSectionTitle;
    private javax.swing.JRadioButton radAnswerA;
    private javax.swing.JRadioButton radAnswerB;
    private javax.swing.JRadioButton radAnswerC;
    private javax.swing.JRadioButton radAnswerD;
    private javax.swing.JTextArea txtareaQuestion;
    // End of variables declaration//GEN-END:variables
}
