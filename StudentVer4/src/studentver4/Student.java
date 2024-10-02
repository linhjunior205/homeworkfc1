package studentver4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Student extends Person{
    
    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    
    

    @Override
    public void displayInfo() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Student ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date Of Birth: " + date.format(getDateOfBirth()));
        System.out.println("GPA: " + getGpa());
        System.out.println("Major: " + getMajor());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("Student successfully with id " + id);
    }

    @Override
    public void addPerson() {
        System.out.println("Student add successfully");
    }
    
    
}
