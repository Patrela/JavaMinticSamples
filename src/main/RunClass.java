package main;

import java.util.Calendar;
import model.Student;

/**
 *
 * @author cahuc
 */
public class RunClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.id = "w34343";
        std1.name = "Carlos";
        std1.lastName = "Carreño";

        //std1.gender = 'M';
        //std1.birthDay = Calendar.getInstance();
        std1.takeSurvey();

        Student std2 = new Student();
        std2.name = "Jimmy";

        std2.takeSurvey();

    }

}
