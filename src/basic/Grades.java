package basic;

import utility.ScannerReader;

/**
 *
 * @author cahuc
 */
public class Grades {
    
    /*
        Escribir un algortimo que lea 5 notas de un estudiante y calcule su nota
        final, sabiendo que todas las notas tiene el mismo peso o porcentaje.
        Si la nota definitiva es menor a 3, deberá imprimir un mensaje indicando
        que reprobó o si es mayor o igual a 3, deberá imprimir un mensaje indicando
        que aprobó.
    
        El mensaje de retorno será con el siguiente formato:
        APROBÓ - 4.5
        REPROBÓ - 2.9
    */
    public static double[] gradesReader( int gradesNumber ){
        
        double[] grades = new double[gradesNumber];
        
        for( int i=0 ; i < gradesNumber ; i++ ){
            grades[i] = ScannerReader.readDouble( "Please give the "+ (i+1) +" grade " );
        }
        
        return grades;
    }
    
    public static double finalGradeCalculator( double[] grades ){
        
        double finalGrade = 0;
        
        for( int i=0 ; i < grades.length; i++ ){
            finalGrade = finalGrade + grades[i];
        }
        
        finalGrade = finalGrade / grades.length ;
        
        return finalGrade;
    }
}
