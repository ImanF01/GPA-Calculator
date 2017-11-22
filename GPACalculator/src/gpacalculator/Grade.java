/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.Arrays;

/**
 *
 * @author Willis
 */
public class Grade {
    // Array of all accepted letter grades
    public static final String[] LETTER_GRADES = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
    
    // Constant letter grades for convenient usage in methods
    public static final String A_PLUS = "A+";
    public static final String A = "A";
    public static final String A_MINUS = "A-";
    public static final String B_PLUS = "B+";
    public static final String B = "B";
    public static final String B_MINUS = "B-";
    public static final String C_PLUS = "C+";
    public static final String C = "C";
    public static final String C_MINUS = "C-";
    public static final String D_PLUS = "D+";
    public static final String D = "D";
    public static final String D_MINUS = "D-";
    public static final String F = "F";
    
    // Class Fields
    private String className;
    private String letterGrade;
    private double gradePoint;
    private Boolean isHonors;
    
    // Default Constructor (should only be called for testing purposes)
    public Grade() {
        this("Unspecified Class", A_PLUS, false);
    }
    
    // Minumum argument Constructor (minimum information required from user to create a useful object)
    public Grade(String letterGrade) {
        this("Unspecified Class", letterGrade, false);
    }
    
    // Constructor that allows user to specify class name for organization
    public Grade(String className, String letterGrade) {
        this(className, letterGrade, false);
    }
    
    // Constructor that allows user to specifiy whether a course is honors and affected by weighted GPA
    public Grade(String letterGrade, Boolean isHonors) {
        this("Unspecified Class", letterGrade, isHonors);
    }
    
    // Full Argument Constructor
    public Grade(String className, String letterGrade, Boolean isHonors) {
        setClassName(className);
        setLetterGrade(letterGrade);
        setGradePoint();
        setHonors(isHonors);
    }
    
    // Sets className
    public void setClassName(String className) {
        this.className = className;
    }
    
    // Gets className
    public String getClassName() {
        return className;
    }
    
    // Sets letterGrade
    public void setLetterGrade(String letterGrade) {
        // Check to see if input is valid
        if (!Arrays.asList(LETTER_GRADES).contains(letterGrade))
            // Throw exception if input is invalid
            throw new IllegalArgumentException("Grade.setLetterGrade(String letterGrade) : Letter grade is not a recognized value");
        else {
            // Sets letterGrade to user value
            this.letterGrade = letterGrade;
            // Sets gradePoint to reflect letterGrade
            setGradePoint();
        }
    }
    
    // Gets letterGrade
    public String getLetterGrade() {
        return letterGrade;
    }
    
    // Sets gradePoint to reflect letterGrade (called automatically when changes are made to letterGrade)
    private void setGradePoint() {
        // Sets gradePoint to an unweighted value between 4 and 0
        gradePoint = 4 - Arrays.asList(LETTER_GRADES).indexOf(letterGrade) / 3;
    }
    
    // Gets gradePoint
    public double getGradePoint() {
        return gradePoint;
    }
    
    // Sets isHonors (whether the class is honors or not)
    public void setHonors(Boolean isHonors) {
        this.isHonors = isHonors;
    }
    
    // Gets isHonors
    public Boolean getHonors() {
        return isHonors;
    }
    
    // toString that prints all Class Fields (should only be called for testing)
    @Override
    public String toString() {
        return String.format("[ %-15s ][ isHonors: %-5s ][ Letter Grade: %-2s ][ Unweighted Grade Point: %4.2f ][ Weighted Grade Point: %4.2f ]",
                getClassName().length() > 15 ? getClassName().substring(0,12) + "..." : getClassName(), 
                getHonors(), getLetterGrade(), getGradePoint(), getHonors() ? getGradePoint() + 1 : getGradePoint());
    }
}
