/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.ArrayList;
import java.util.List;
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
                return grade.getHonors() ? "Yes" : "No";        
        }
        return null;
    }
    
    public void setWeightedStatus(boolean isWeighted) {
        this.isWeighted = isWeighted;
        fireTableDataChanged();
    }
    
    public boolean getWeightedStatus() {
        return isWeighted;
    }
    
    public Grade getGradeAt(int row) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        return grades.get(row);
    }
    
    public void addGrade(String className, String letterGrade, boolean isHonors) {
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
    
    public void editGradeAt(int row, String className, String letterGrde, boolean isHonors) {
        if (row < 0 || row > grades.size())
            throw new IllegalArgumentException("Row out of bounds");
        
        Grade grade = getGradeAt(row);
        grade.setClassName(className);
        grade.setLetterGrade(letterGrde);
        grade.setHonors(isHonors);
        fireTableDataChanged();
    }
    
    public void clearData() {
        grades.clear();
        fireTableDataChanged();
    }
    
}