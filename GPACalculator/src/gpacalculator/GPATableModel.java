/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author J3ranch
 */
public class GPATableModel extends AbstractTableModel{
    
    private List<Grade> grades;
    private String[] columnNames = {"Class", "Letter Grade", "Grade Point", "Honors/AP?"};
    private boolean isWeighted = false;
    
    public GPATableModel() {
        grades = new ArrayList<Grade>();
    }
    
    @Override
    public int getRowCount() {
        return grades.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        Grade grade = getGradeAt(row);
        
        switch(column) {
            case 0: 
                return grade.getClassName();
            case 1:
                return grade.getLetterGrade();
            case 2:
                return getWeightedStatus() && grade.getHonors() ? String.format("%.2f", grade.getGradePoint() + 1) : String.format("%.2f", grade.getGradePoint()) ;
            case 3:
                return grade.getHonors();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object object, int row, int column) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        // Safe casts due to controlled user edit
        switch (column) {
            case 0:
                grades.get(row).setClassName((String) object);
                break;
            case 1:
                grades.get(row).setLetterGrade((String) object);
                break;
            case 3:
                grades.get(row).setHonors((Boolean) object);
                break;
        }
        fireTableDataChanged();
    }
    
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        switch (column) {
            case 0:
            case 1:
            case 3: 
                return true;
            default:
                return false;
        }
    }
    
    // Sets the grading scale
    public void setWeightedStatus(boolean isWeighted) {
        this.isWeighted = isWeighted;
        fireTableDataChanged();
    }
    
    // Gets the current grading scale
    public boolean getWeightedStatus() {
        return isWeighted;
    }
    
    private Grade getGradeAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return grades.get(row);
    }
    
    public String getClassNameAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return getGradeAt(row).getClassName();
    }
    
    public String getLetterGradeAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return getGradeAt(row).getLetterGrade();
    }
    
    public double getGradePointAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return getWeightedStatus() && getHonorsAt(row) ? getGradeAt(row).getGradePoint() + 1 : getGradeAt(row).getGradePoint();
    }
    
    public Boolean getHonorsAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return getGradeAt(row).getHonors();
    }
    
    public void addGrade(String className, String letterGrade, Boolean isHonors) {
        if (className.isEmpty()) {
            grades.add(new Grade(letterGrade, isHonors));
        }
        else {
            grades.add(new Grade(className, letterGrade, isHonors));
        }
        fireTableDataChanged();
    }
    
    public void removeGradeAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        grades.remove(row);
        fireTableDataChanged();
    }
    
    // Deprecated Method
    /*
    public void editGradeAt(int row, String className, String letterGrde, Boolean isHonors) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        Grade grade = getGradeAt(row);
        grade.setClassName(className);
        grade.setLetterGrade(letterGrde);
        grade.setHonors(isHonors);
        fireTableDataChanged();
    }*/
    
    public void clearData() {
        grades.clear();
        fireTableDataChanged();
    }
    
    public double calculateGPA() {
        double totalGP = 0;
        for (int i = 0; i < getRowCount(); i++) {
                totalGP += getGradePointAt(i);
        }
        
        return totalGP / getRowCount();
    }
}
