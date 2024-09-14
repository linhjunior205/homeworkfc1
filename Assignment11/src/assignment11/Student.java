package assignment11;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student extends Person implements IPerson {

    private float gpa;
    private String major;

    public Student(String id, String fullName, String dateOfBirthString, float gpa, String major) throws ParseException {
        super(id, fullName, new SimpleDateFormat("dd-MM-yyyy").parse(dateOfBirthString));
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}
    

    public void addStudent() {

    }
    

    @Override
    public void displayInfo() {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + date.format(dateOfBirth));
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("==================================");

    }

}
