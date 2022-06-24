package model;

/**
 *
 * @author cahuc
 */
public class User {

    private String name;
    private String email;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, String email, int id, int age) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
    }

    public void info() {
        System.out.println("--------------------------------");
        System.out.println("----------- USUARIO ------------");
        System.out.println("--------------------------------");
        System.out.println("Full name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("--------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

}
