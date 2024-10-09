package studentver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentList {

    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter student date of birth (dd/MM/YYYY): ");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        String dateOfBirthString = scanner.nextLine();
        Date dateOfBirth = date.parse(dateOfBirthString);
        System.out.print("Enter student GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();

        Student newStudent = new Student(id, fullName, dateOfBirth, gpa, major);
        studentList.add(newStudent);
        System.out.println("Student added successfully.");

    }

    public void updateStudentById(String id) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                System.out.print("Enter new student full name: ");
                String newFullName = scanner.nextLine();

                System.out.print("Enter new student date of birth (dd/MM/yyyy): ");
                String newDateOfBirthStr = scanner.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date newDateOfBirth = dateFormat.parse(newDateOfBirthStr);

                System.out.print("Enter new student GPA: ");
                float newGpa = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter new student major: ");
                String newMajor = scanner.nextLine();

                student.setFullName(newFullName);
                student.setDateOfBirth(newDateOfBirth);
                student.setGpa(newGpa);
                student.setMajor(newMajor);
                student.setSchoolarahip(newGpa >= 9 ? true : false);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

//    public void deleteStudentById(String id) {
//        for (Student student : studentList) {
//            if (student.id.equals(id)) {
//                studentList.remove(student);
//            }
//        }
//    }
    public void deleteStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                studentList.remove(i);
                System.out.println("Student with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public Student findStudentById(String id) {
        Student s = new Student();
        for (Student student : studentList) {
            if (student.id.equals(id)) {
                s = student;
            }
        }
        return s;
    }
//    public void displayAllStudent(){
//        for(Student student : studentList){
//            student.displayInfo();
//        }
//    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : studentList) {
                student.displayInfo();
                System.out.println("----------------------");
            }
        }
    }
//    public Student findTopStudent(){
//        Student topstudent = new Student();
//        for(Student student : studentList){
//            if(topstudent.gpa<student.gpa){
//                topstudent = student;
//            }
//        }
//        return topstudent;
//    }

    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

//    public ArrayList<Student> findSchoolarshipStudents(){
//        ArrayList<Student> sl= new ArrayList<>();
//        for(Student student : studentList){
//            if(student.checkSchoolarShip()== true){
//                sl.add(student);
//            }
//        }
//        return sl;
//    }
    public ArrayList<Student> findScholarshipStudents() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isSchoolarahip()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;
    }

    public double calculateTuitionOfAllStudents() {
        double totalTuition = 0;
        for (Student student : studentList) {
            totalTuition += student.getTuition();
        }
        return totalTuition;
    }

//    public double caculateTuitionOfAllStudents(){
//        double all = 0;
//        for(Student student : studentList){
//            all+= student.tuition;
//        }
//        return all;
//    }
}
