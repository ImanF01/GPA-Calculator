/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.awt.event.ItemEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author J3ranch
 */
public class GPAView extends javax.swing.JFrame {
    
    private GPAController controller;

    /**
     * Creates new form GPAView
     */
    
    private JLabel[] jLabelsAddForm = {new JLabel("Class Name"), new JLabel("Grade"), new JLabel("Honors/AP?")};
    private JTextField jTextFieldClass = new JTextField();
    private JComboBox jComboBoxGrade = new JComboBox(Grade.LETTER_GRADES);
    private JCheckBox jCheckBoxHonors = new JCheckBox();
    
    public GPAView(GPAController controller) {
        
        this.controller = controller;
        // Initialize JComponents
        initComponents();
        
        // Format columns of jTableGrades
        jTableGrades.getColumnModel().getColumn(0).setResizable(false);
        jTableGrades.getColumnModel().getColumn(0).setMinWidth(jTableGrades.getWidth() / 2);
        jTableGrades.getColumnModel().getColumn(1).setResizable(false);
        jTableGrades.getColumnModel().getColumn(2).setResizable(false);
        jTableGrades.getColumnModel().getColumn(3).setResizable(false);
        
        // Set Cell Editor of Grade to be a Combo Box
        jTableGrades.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JComboBox(Grade.LETTER_GRADES)));
        
        // Set Column Tooltips
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setToolTipText("Double click to edit");
        jTableGrades.getColumnModel().getColumn(0).setCellRenderer(renderer);
        
        DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
        renderer2.setToolTipText("Click to edit");
        jTableGrades.getColumnModel().getColumn(1).setCellRenderer(renderer2);
        
        // Add a table listener to update GPA as changes are made
        jTableGrades.getModel().addTableModelListener(new TableModelListener() {
            
            @Override
            public void tableChanged(TableModelEvent e) {
                updateGPA();
            }
        });
    }
    
    private void updateGPA() {
        jLabelTotalGPA.setText(String.format("Total GPA: %4.02f", controller.calculateGPA()));
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneGrades = new javax.swing.JScrollPane();
        jTableGrades = new javax.swing.JTable();
        jRadioButtonUnweighted = new javax.swing.JRadioButton();
        jRadioButtonWeighted = new javax.swing.JRadioButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelTotalGPA = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(208, 214, 232));

        jScrollPaneGrades.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneGrades.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneGrades.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        jTableGrades.setBackground(new java.awt.Color(208, 214, 232));
        jTableGrades.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTableGrades.setModel(controller.getGPATable());
        jTableGrades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableGrades.setShowVerticalLines(false);
        jTableGrades.getTableHeader().setReorderingAllowed(false);
        jScrollPaneGrades.setViewportView(jTableGrades);

        jRadioButtonUnweighted.setBackground(new java.awt.Color(208, 214, 232));
        buttonGroupWeight.add(jRadioButtonUnweighted);
        jRadioButtonUnweighted.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jRadioButtonUnweighted.setText("Unweighted");
        jRadioButtonUnweighted.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonUnweightedItemStateChanged(evt);
            }
        });

        jRadioButtonWeighted.setBackground(new java.awt.Color(208, 214, 232));
        buttonGroupWeight.add(jRadioButtonWeighted);
        jRadioButtonWeighted.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jRadioButtonWeighted.setText("Weighted");
        jRadioButtonWeighted.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonWeightedItemStateChanged(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(255, 153, 102));
        jButtonAdd.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("+");
        jButtonAdd.setToolTipText("Add a grade");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setBackground(new java.awt.Color(255, 153, 102));
        jButtonRemove.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("-");
        jButtonRemove.setToolTipText("Remove a grade");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 153, 102));
        jButtonClear.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear All");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelTotalGPA.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        jLabelTotalGPA.setText("Total GPA:  NaN");

        jButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Iman\\Downloads\\icons8-home-50.png")); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonHelp.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHelp.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButtonHelp.setText("?");
        jButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButtonUnweighted)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButtonWeighted))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPaneGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonRemove)
                            .addGap(10, 10, 10)
                            .addComponent(jButtonClear)
                            .addGap(169, 169, 169)
                            .addComponent(jLabelTotalGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonUnweighted)
                    .addComponent(jRadioButtonWeighted))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // Get selected row index
        int selectedRow = jTableGrades.getSelectedRow();
        
        // Return if nothing is selected
        if (selectedRow == -1)
            return;
        
        // Confirm remove
        int i = JOptionPane.showOptionDialog(this, "Remove selected Grade?", "Confirm Remove Grade", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Confirm", "Cancel"}, null);
        
        // Remove grade at selected row index
        if (i == JOptionPane.OK_OPTION)
            controller.removeGrade(jTableGrades.getSelectedRow());
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // Confirm clear all
        int i = JOptionPane.showOptionDialog(this, "Clear All?", "Confirm Clear All", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Confirm", "Cancel"}, null);
        
        // Clear all grades if user confirms
        if (i == JOptionPane.OK_OPTION)
            controller.clearData();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // Components for Add Form dialog
        JLabel[] jLabelsAddForm = {new JLabel("Class Name"), new JLabel("Grade"), new JLabel("Honors/AP?")};
        JTextField jTextFieldClass = new JTextField();
        JComboBox jComboBoxGrade = new JComboBox(Grade.LETTER_GRADES);
        JCheckBox jCheckBoxHonors = new JCheckBox();
        
        // Receive user input via dialog
        int i = JOptionPane.showOptionDialog(this, new Object[]{jLabelsAddForm[0], jTextFieldClass, jLabelsAddForm[1], jComboBoxGrade, jLabelsAddForm[2], jCheckBoxHonors},
                                            "Add New Grade", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Add", "Cancel"}, null);
        
        // Add grade if user confirms
        if (i == JOptionPane.OK_OPTION)
            controller.addGrade(jTextFieldClass.getText(), jComboBoxGrade.getItemAt(jComboBoxGrade.getSelectedIndex()).toString(), jCheckBoxHonors.isSelected());
        
        // Scroll to bottom to make new grade visible
        jTableGrades.scrollRectToVisible(jTableGrades.getCellRect(jTableGrades.getRowCount() - 1, 0, true));
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jRadioButtonUnweightedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonUnweightedItemStateChanged
        // Changes weighted status to false
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            controller.setWeightedStatus(false);
        }
    }//GEN-LAST:event_jRadioButtonUnweightedItemStateChanged

    private void jRadioButtonWeightedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonWeightedItemStateChanged
        // Changes weighted status to true
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            controller.setWeightedStatus(true);
        }
    }//GEN-LAST:event_jRadioButtonWeightedItemStateChanged

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        //Goes to MenuScreen 
        this.dispose();
        new MenuScreen(controller).setVisible(true); 
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelpActionPerformed
        JOptionPane.showMessageDialog(this, "Double click cell to edit class\nClick cell to edit letter grade");
    }//GEN-LAST:event_jButtonHelpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupWeight;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabelTotalGPA;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonUnweighted;
    private javax.swing.JRadioButton jRadioButtonWeighted;
    private javax.swing.JScrollPane jScrollPaneGrades;
    private javax.swing.JTable jTableGrades;
    // End of variables declaration//GEN-END:variables
}
