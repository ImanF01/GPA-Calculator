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
    
    public static String APPLICATION_NAME = "Grade Tracker";
    public static String VERSION_NUMBER = "1.0.0";
    
    public static void main(String[] args) 
    {
        GPAController controller = new GPAController();
        controller.startApplication();
    }
}
