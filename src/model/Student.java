package model;

import java.util.Calendar;

/**
 *
 * @author cahuc
 */
public class Student {
 
    private String id;
    public String name;
    public String lastName;
    
    private char gender;
    private Calendar birthDay;
    
    private int debt;
 
    public Student(){
        this.debt = 0;
    }
    
    public Student( String id ){
        this.id = id;
    }

    public Student(String id, String name, String lastName, char gender, Calendar birthDay) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
    }
    
    
    
    
    public void takeSurvey(){
        
        System.out.println("DONE. Thank you "+name);
    }
    
    
    // SETTERS y GETTERS
    
    
    // MODIFICADORES DE ACCESO (public, private, protected

    public String getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Calendar getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }
    
    
}
