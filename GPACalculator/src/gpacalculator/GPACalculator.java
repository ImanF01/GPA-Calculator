  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import javax.swing.JFrame;

/**
 *
 * @author Iman
 */
public class GPACalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Code for testing Grade class
        /*
        Grade testGrade = new Grade();
        for (String s : Grade.LETTER_GRADES) {
            testGrade.setLetterGrade(s);
            System.out.println(testGrade);
        }
        testGrade.setClassName("CIS 44");
        testGrade.setHonors(true);
        for (String s : Grade.LETTER_GRADES) {
            testGrade.setLetterGrade(s);
            System.out.println(testGrade);
        }
        */
        
        GPAController controller = new GPAController();
        controller.startApplication();
        
    }
}
