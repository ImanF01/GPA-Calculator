/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author J3ranch
 */
public class GPAView extends javax.swing.JFrame {
    
    private GPAController controller = new GPAController();

    /**
     * Creates new form GPAView
     */
    
    private JLabel[] jLabelsAddForm = {new JLabel("Class Name"), new JLabel("Grade"), new JLabel("Honors/AP?")};
    private JTextField jTextFieldClass = new JTextField();
    private JComboBox jComboBoxGrade = new JComboBox(Grade.LETTER_GRADES);
    private JCheckBox jCheckBoxHonors = new JCheckBox();
    
    public GPAView() {
        initComponents();
        
        jTableGrades.getColumnModel().getColumn(0).setResizable(false);
        jTableGrades.getColumnModel().getColumn(0).setMinWidth(jTableGrades.getWidth() / 2);
        jTableGrades.getColumnModel().getColumn(1).setResizable(false);
        jTableGrades.getColumnModel().getColumn(2).setResizable(false);
        jTableGrades.getColumnModel().getColumn(3).setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupWeight = new javax.swing.ButtonGroup();
        jScrollPaneGrades = new javax.swing.JScrollPane();
        jTableGrades = new javax.swing.JTable();
        jLabelWeightOption = new javax.swing.JLabel();
        jRadioButtonUnweighted = new javax.swing.JRadioButton();
        jRadioButtonWeighted = new javax.swing.JRadioButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneGrades.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneGrades.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableGrades.setModel(controller.getGPATable());
        jTableGrades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableGrades.setShowVerticalLines(false);
        jTableGrades.getTableHeader().setReorderingAllowed(false);
        jScrollPaneGrades.setViewportView(jTableGrades);

        jLabelWeightOption.setText("Grade Weight:");

        buttonGroupWeight.add(jRadioButtonUnweighted);
        jRadioButtonUnweighted.setSelected(true);
        jRadioButtonUnweighted.setText("Unweighted");
        jRadioButtonUnweighted.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonUnweightedItemStateChanged(evt);
            }
        });

        buttonGroupWeight.add(jRadioButtonWeighted);
        jRadioButtonWeighted.setText("Weighted");
        jRadioButtonWeighted.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonWeightedItemStateChanged(evt);
            }
        });

        jButtonAdd.setText("Add Grade");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit Grade");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove Grade");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear All");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClear))
                    .addComponent(jScrollPaneGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelWeightOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonUnweighted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonWeighted)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWeightOption)
                    .addComponent(jRadioButtonUnweighted)
                    .addComponent(jRadioButtonWeighted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonRemove)
                    .addComponent(jButtonClear))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableGrades.getSelectedRow();
        
        if (selectedRow == -1)
            return;
        
        controller.removeGrade(jTableGrades.getSelectedRow());
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        controller.clearData();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        JLabel[] jLabelsAddForm = {new JLabel("Class Name"), new JLabel("Grade"), new JLabel("Honors/AP?")};
        JTextField jTextFieldClass = new JTextField();
        JComboBox jComboBoxGrade = new JComboBox(Grade.LETTER_GRADES);
        JCheckBox jCheckBoxHonors = new JCheckBox();
        
        int i = JOptionPane.showOptionDialog(this, new Object[]{jLabelsAddForm[0], jTextFieldClass, jLabelsAddForm[1], jComboBoxGrade, jLabelsAddForm[2], jCheckBoxHonors},
                                            "Add New Grade", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Add", "Cancel"}, null);
        
        if (i == JOptionPane.OK_OPTION)
            controller.addGrade(jTextFieldClass.getText(), jComboBoxGrade.getItemAt(jComboBoxGrade.getSelectedIndex()).toString(), jCheckBoxHonors.isSelected());
        jTableGrades.scrollRectToVisible(jTableGrades.getCellRect(jTableGrades.getRowCount() - 1, 0, true));
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jRadioButtonUnweightedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonUnweightedItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            controller.setWeightedStatus(false);
        }
    }//GEN-LAST:event_jRadioButtonUnweightedItemStateChanged

    private void jRadioButtonWeightedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonWeightedItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            controller.setWeightedStatus(true);
        }
    }//GEN-LAST:event_jRadioButtonWeightedItemStateChanged

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        JLabel[] jLabelsAddForm = {new JLabel("Class Name"), new JLabel("Grade"), new JLabel("Honors/AP?")};
        JTextField jTextFieldClass;
        JComboBox jComboBoxGrade = new JComboBox(Grade.LETTER_GRADES);
        JCheckBox jCheckBoxHonors;
        int selectedRow = jTableGrades.getSelectedRow();
        
        if (selectedRow == -1)
            return;
        
        try {
            jTextFieldClass = new JTextField(controller.getClassNameAt(selectedRow));
            jComboBoxGrade.setSelectedItem(controller.getLetterGradeAt(selectedRow));
            jCheckBoxHonors = new JCheckBox((String) null, controller.getHonorsAt(selectedRow));
        } catch (Exception e) {
            return;
        }
        
        int i = JOptionPane.showOptionDialog(this, new Object[]{jLabelsAddForm[0], jTextFieldClass, jLabelsAddForm[1], jComboBoxGrade, jLabelsAddForm[2], jCheckBoxHonors},
                                            "Edit Existing Grade", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Confirm"}, "Confirm");
        
        if (i == JOptionPane.OK_OPTION) {
            controller.editGradeAt(selectedRow, jTextFieldClass.getText(), jComboBoxGrade.getItemAt(jComboBoxGrade.getSelectedIndex()).toString(), jCheckBoxHonors.isSelected());
        }
    }//GEN-LAST:event_jButtonEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupWeight;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabelWeightOption;
    private javax.swing.JRadioButton jRadioButtonUnweighted;
    private javax.swing.JRadioButton jRadioButtonWeighted;
    private javax.swing.JScrollPane jScrollPaneGrades;
    private javax.swing.JTable jTableGrades;
    // End of variables declaration//GEN-END:variables
}
