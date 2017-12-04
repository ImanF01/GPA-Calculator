/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.InputMismatchException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Iman
 */
public class FinalGradeView extends javax.swing.JFrame {
    
    private GPAController controller;

    /**
     * Creates new form FinalGradeView
     */
    
    public FinalGradeView() {
        controller = new GPAController();
        initComponents();
        
    }
    
    public FinalGradeView(GPAController controller) {
        this.controller = controller;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCurrentGrade = new javax.swing.JTextField();
        jLabelFinalWeight = new javax.swing.JLabel();
        jTextFieldDesiredGrade = new javax.swing.JTextField();
        jLabelDesiredGrade = new javax.swing.JLabel();
        jLabelCurrentGrade = new javax.swing.JLabel();
        jButtonCalculate = new javax.swing.JButton();
        jTextFieldFinalWeight = new javax.swing.JTextField();
        jLabelGradeNeeded = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(GPACalculator.APPLICATION_NAME + " " + GPACalculator.VERSION_NUMBER);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(208, 214, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(419, 360));

        jTextFieldCurrentGrade.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jTextFieldCurrentGrade.setToolTipText("");
        jTextFieldCurrentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCurrentGradeActionPerformed(evt);
            }
        });

        jLabelFinalWeight.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jLabelFinalWeight.setText("Final Weight:");
        jLabelFinalWeight.setToolTipText("Insert weight your final is of your grade (e.g. 10)");

        jTextFieldDesiredGrade.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jTextFieldDesiredGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDesiredGradeActionPerformed(evt);
            }
        });

        jLabelDesiredGrade.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jLabelDesiredGrade.setText("Desired Grade:");
        jLabelDesiredGrade.setToolTipText("Insert grade you want (e.g. 90)");

        jLabelCurrentGrade.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCurrentGrade.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jLabelCurrentGrade.setText("Current Grade:");
        jLabelCurrentGrade.setToolTipText("Insert current grade (e.g. 89.5)");

        jButtonCalculate.setBackground(new java.awt.Color(255, 153, 102));
        jButtonCalculate.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jButtonCalculate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalculate.setText("Calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jTextFieldFinalWeight.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jTextFieldFinalWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinalWeightActionPerformed(evt);
            }
        });

        jLabelGradeNeeded.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jLabelGradeNeeded.setText("Final Grade Needed: ");

        jButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpacalculator/icons8-home-50.png"))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonHelp.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHelp.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jButtonHelp.setText("?");
        jButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelDesiredGrade)
                                .addComponent(jLabelCurrentGrade))
                            .addComponent(jLabelFinalWeight))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDesiredGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCurrentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFinalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelGradeNeeded)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurrentGrade)
                    .addComponent(jTextFieldCurrentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDesiredGrade)
                    .addComponent(jTextFieldDesiredGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFinalWeight)
                    .addComponent(jTextFieldFinalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelGradeNeeded)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCurrentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCurrentGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCurrentGradeActionPerformed

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        String desiredGrade = jTextFieldDesiredGrade.getText();
        String currentGrade = jTextFieldCurrentGrade.getText();
        String finalWeight = jTextFieldFinalWeight.getText();
        double dGrade, cGrade, fWeight;
        
        try {
            // Attempt to take user Input
            dGrade = Double.parseDouble(desiredGrade) / 100.0;
            cGrade = Double.parseDouble(currentGrade) / 100.0;
            fWeight = Double.parseDouble(finalWeight) / 100.0;    
            
            // Calculate final grade required
            double grade = (dGrade - ((1-fWeight) * cGrade) ) / fWeight;
            
            // Debug Messages
            System.out.println(dGrade);
            System.out.println(cGrade);
            System.out.println(fWeight);
            System.out.print(grade);

            // Update display
            jLabelGradeNeeded.setText(String.format("Final Grade Needed: %.2f%%", grade * 100));
        } catch (Exception e) {
            // Inform user of invalid inputs   
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, String.format("Invalid input in the following fields:%n%n%s%s%s",
                    desiredGrade.isEmpty() || !desiredGrade.matches("\\d*\\.?\\d+") ? "Desired Grade\n" : "",
                    currentGrade.isEmpty() || !currentGrade.matches("\\d*\\.?\\d+") ? "Current Grade\n" : "",
                    finalWeight.isEmpty() || !finalWeight.matches("\\d*\\.?\\d+") ? "Final Weight\n" : ""
                    )
                , "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCalculateActionPerformed

    private void jTextFieldFinalWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinalWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFinalWeightActionPerformed

    private void jTextFieldDesiredGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDesiredGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDesiredGradeActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        this.dispose();
        new MenuScreen(controller).setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelpActionPerformed
       JOptionPane.showMessageDialog(this, "Current Grade: Insert current grade (e.g. 89.5)\nDesired Grade: Insert grade you want (e.g. 90)"
               + "\nFinal Weight: Insert weight your final is of your grade (e.g. 10)");
    }//GEN-LAST:event_jButtonHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabelCurrentGrade;
    private javax.swing.JLabel jLabelDesiredGrade;
    private javax.swing.JLabel jLabelFinalWeight;
    private javax.swing.JLabel jLabelGradeNeeded;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCurrentGrade;
    private javax.swing.JTextField jTextFieldDesiredGrade;
    private javax.swing.JTextField jTextFieldFinalWeight;
    // End of variables declaration//GEN-END:variables
}
