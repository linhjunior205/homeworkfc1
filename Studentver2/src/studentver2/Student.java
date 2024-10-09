package studentver2;

import java.util.*;
import java.text.*;

public class Student extends Person implements IPerson {

    private float gpa;
    private String major;
    private double tuition;
    private boolean schoolarship;

    public Student() {
    }

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.tuition = 10000000;
        this.schoolarship = gpa >= 9 ? true : false;
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

    public double getTuition() {
        if (schoolarship) {
            return tuition / 2;
        } else {
            return tuition;
        }
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public boolean isSchoolarahip() {
        return schoolarship;
    }

    public void setSchoolarahip(boolean schoolarahip) {
        this.schoolarship = schoolarahip;
    }

//    public void addStudent() throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter id: ");
//        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
//        String id = scanner.nextLine();
//        setId(id);
//        System.out.println("Enter Full Name: ");
//        String fullName = scanner.nextLine();
//        setFullName(fullName);
//        System.out.println("Date of Birh ");
//        String dateOfBirthString = scanner.nextLine();
//        Date dateOfBirth = date.parse(dateOfBirthString);
//        setDateOfBirth(dateOfBirth);
//        System.out.println("GPA: ");
//        float gpa = Float.parseFloat(scanner.nextLine());
//        setGpa(gpa);
//        System.out.println("Major: ");
//        String major = scanner.nextLine();
//        setMajor(major);
//        System.out.println("Tuition : ");
//        double tuition = Double.parseDouble(scanner.nextLine());
//        
//        
//    }
//    public boolean checkSchoolarShip() {
//        if (gpa >= 9) {
//            setSchoolarahip(true);
//            return true;
//        } else {
//            setSchoolarahip(false);
//            return false;
//        }
//    }
//
//    public double caculateTuition(){
//        final float discount = 0.5f;
//        if (gpa>=9) {
//            tuition=tuition/2;
//            return tuition;
//        }
//        return 0;
//    }
    @Override
    public void displayInfo() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date Of Birth: " + date.format(getDateOfBirth()));
        System.out.println("Gpa: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Tuition: " + getTuition());
        System.out.println("Schoolarship: " + (schoolarship ? "yes" : "NO"));

    }

}
