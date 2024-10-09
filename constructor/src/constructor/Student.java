package constructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Student {

    private String id;
    private String fullName;
    private float GPA;
    private Date dateOfBirth;
    private String major;

    public Student(String id, String fullName, float GPA, Date dateOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;

    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void enterStudentInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String id = input.nextLine();
        setId(id);
        System.out.println("Full Name: ");
        String fullName = input.nextLine();
        setFullName(fullName);
        System.out.println("Enter your Gpa: ");
        float gpa = Float.parseFloat(input.nextLine());
        setGPA(gpa);

        System.out.println("Date of birth: ");
        String dateOfBirthString = input.nextLine();
        SimpleDateFormat datecc = new SimpleDateFormat("dd/MM/yyyy");
        try {
            //bat ngoai le khi nhap sai dinh dang
            //nhap loi dinh dang se chay vao catch
            this.dateOfBirth = datecc.parse(dateOfBirthString);
        } catch (Exception e) {
            System.out.println("Wrong Format");
        }

        System.out.println("Enter Your Major: ");
        String major = input.nextLine();
        setMajor(major);

    }

    public String toString() {
        SimpleDateFormat datecc = new SimpleDateFormat("dd/MM/yyy");
        return "ID: " + id + "|" + " FullName: " + fullName + "|" + " GPA: " + GPA + "|" + " Dateofbirth: " + datecc.format(dateOfBirth) + "|" + " Major: " + major;
    }

    public void displayInfor() {
        System.out.println(toString());
    }
}
