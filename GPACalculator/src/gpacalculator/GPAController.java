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
        new MenuScreen(this).setVisible(true);
    }
    
    // Get persistent table model (data)
    public GPATableModel getGPATable() {
        return gpaTable;
    }
    
    public String getClassNameAt(int row) {
        try {
            return gpaTable.getClassNameAt(row);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public String getLetterGradeAt(int row) {
        try {
            return gpaTable.getLetterGradeAt(row);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public boolean getHonorsAt(int row) {
        try {
            return gpaTable.getHonorsAt(row);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    public void addGrade(String className, String letterGrade, Boolean isHonors) {
        try {
            gpaTable.addGrade(className, letterGrade, isHonors);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    // Deprecated method
    /*
    public void editGradeAt(int row, String className, String letterGrade, Boolean isHonors) {
        try {
            gpaTable.editGradeAt(row, className, letterGrade, isHonors);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }*/
    
    public void removeGrade(int row) {
        try {
            gpaTable.removeGradeAt(row);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void setWeightedStatus(boolean isWeighted) {
        try {
            gpaTable.setWeightedStatus(isWeighted);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void clearData() {
        try {
            gpaTable.clearData();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public double calculateGPA() {
        try {
            return gpaTable.calculateGPA();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
}
