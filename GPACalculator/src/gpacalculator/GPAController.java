/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import javax.swing.JFrame;

/**
 *
 * @author J3ranch
 */
public class GPAController {
    private GPATableModel gpaTable = new GPATableModel();
    
    public void startApplication() {
        GPAView mainFrame = new GPAView();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true); 
    }
    
    public GPATableModel getGPATable() {
        return gpaTable;
    }
    
    public String getClassNameAt(int row) {
        try {
            return gpaTable.getGradeAt(row).getClassName();
        } catch (Exception e) {
            System.out.println("GPAController.getClassNameAt(int row) : Invalid row entered");
        }
        return null;
    }
    
    public String getLetterGradeAt(int row) {
        try {
            return gpaTable.getGradeAt(row).getLetterGrade();
        } catch (Exception e) {
            System.out.println("GPAController.getLetterGradeAt(int row) : Invalid row entered");
        }
        return null;
    }
    
    public boolean getHonorsAt(int row) {
        try {
            return gpaTable.getGradeAt(row).getHonors();
        } catch (Exception e) {
            System.out.println("GPAController.getHonorsAt(int row) : Invalid row entered");
        }
        return false;
    }
    
    public void addGrade(String className, String letterGrade, boolean isHonors) {
        try {
            gpaTable.addGrade(className, letterGrade, isHonors);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void editGradeAt(int row, String className, String letterGrade, boolean isHonors) {
        try {
            gpaTable.editGradeAt(row, className, letterGrade, isHonors);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void removeGrade(int row) {
        try {
            gpaTable.removeGradeAt(row);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void setWeightedStatus(boolean isWeighted) {
        try {
            gpaTable.setWeightedStatus(isWeighted);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void clearData() {
        try {
            gpaTable.clearData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}