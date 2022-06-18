package main;

import basic.Grades;
import basic.Sales;
import utility.GraphicMessage;
import utility.ScannerReader;

/**
 *
 * @author cahuc
 */
public class RunClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = ScannerReader.readInt("Number of grades?");
        double[] grades = Grades.gradesReader(n);
        double finalGrade = Grades.finalGradeCalculator(grades);
        
        if (finalGrade<3){
            System.out.println("R - "+finalGrade);
        }else{
            System.out.println("A - "+finalGrade);
        }
       
    }
    
}
