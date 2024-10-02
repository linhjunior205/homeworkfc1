package studentver4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Teacher extends Person{
    
    private String department;
    private String teachingSubject;


    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
    
    

    @Override
    public void displayInfo() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date Of Bith: " + date.format(getDateOfBirth()));
        System.out.println("Department : " + getDepartment());
        System.out.println("Teaching subject: " + getTeachingSubject());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("Teacher update successfully with id : " + id);
    }

    @Override
    public void addPerson() {
        System.out.println("Teacher added successfully");
    }
    
    
}
