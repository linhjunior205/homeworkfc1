
package studentver2;

import java.text.ParseException;
import java.util.*;

public class Processor {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        while (true) {
            System.out.println("--------MENU--------");
            System.out.println("1. Add Student.");
            System.out.println("2. Update Student By ID.");
            System.out.println("3. Delete Student By ID.");
            System.out.println("4. Display All Student.");
            System.out.println("5. Find Top Student.");
            System.out.println("6. Display schoolarship student.");
            System.out.println("7. Display Tuition Of All student.");
            System.out.println("8. Exit.");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    studentList.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter Student ID to update: ");
                    String idToUpdate = scanner.nextLine();
                    studentList.updateStudentById(idToUpdate);
                    break;
                case 3:
                    System.out.println("Enter student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with highest GPA: ");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
//                    break;
//                case 6:
//                    List<Student> scholarshipStudents = studentList.findScholarshipStudents();
//                    if (!scholarshipStudents.isEmpty()) {
//                        System.out.println("Students with scholarships:");
//                        for (Student student : scholarshipStudents) {
//                            student.displayInfo();
//                        }
//                    } else {
//                        System.out.println("No students with scholarships found.");
//                    }
//                    break;
                case 7:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Total tuition fee of all students: " + totalTuition);
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    System.exit(choice);
                default:
                    System.out.println("Invalid choice , please try agian.");

            }
        }

    }
}
