package assignment11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;

public class Processor {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();

        while (true) {
            System.out.println("----choose an option------ ");
            System.out.println("1.Add a new student: ");
            System.out.println("2.Update a student by id: ");
            System.out.println("3.Delete a student by id: ");
            System.out.println("4.Display all student: ");
            System.out.println("5.Find the student with the highest GPA: ");
            System.out.println("6.Exit.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Fullname: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Student GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();     

                    System.out.print("Enter Student Major: ");
                    String major = scanner.nextLine();

                    System.out.print("Enter student date of birth (dd-MM-yyyy): ");
                    String dateOfBirthString = scanner.nextLine();

                    try {
                        Student newStudent = new Student(id, fullName, dateOfBirthString, gpa, major);
                        studentList.addStudent(newStudent);
                        System.out.println("Student Added Successfully.");
                        System.out.println();
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter student id to update:");
                    String idToUpdate = scanner.nextLine();
                    
                    Student studentToUpdate = studentList.findStudentById(idToUpdate);
                    
                    if (studentToUpdate != null) {
                        System.out.println("Enter new full name:");
                        String newFullName = scanner.nextLine();
                        studentToUpdate.setFullName(newFullName);

                        System.out.println("Enter new date of birth (dd-MM-yyyy):");
                        String newDateOfBirthString = scanner.nextLine();
                        try {
                            studentToUpdate.setDateOfBirth(new SimpleDateFormat("dd-MM-yyyy").parse(newDateOfBirthString));
                        } catch (ParseException e) {
                            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                        }

                        System.out.println("Enter new GPA:");
                        float newGpa = scanner.nextFloat();
                        studentToUpdate.setGpa(newGpa);
                        scanner.nextLine();

                        System.out.println("Enter new major:");
                        String newMajor = scanner.nextLine();
                        studentToUpdate.setMajor(newMajor);

                        System.out.println("Student Updated Successfully.");
                        System.out.println();
                    } else {
                        System.out.println("Student not found.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter student id to delete:");
                    String idToDelete = scanner.nextLine();
                    
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    System.out.println();
                    break;
                case 4:
                    studentList.displayAllStudent();
                    System.out.println();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
