package studentver4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) throws ParseException {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new Student");
            System.out.println("2. Add new Teacher");
            System.out.println("3. Update Person By id");
            System.out.println("4. Delete Person By id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with highest GPA");
            System.out.println("7. Find tacher by department");
            System.out.println("8. Exit");

            System.out.println("choose an option; ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter student id: ");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter student full name: ");
                    String studentFullName = scanner.nextLine();
                    System.out.println("Enter student date of birth (dd/MM/yyyy): ");
                    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                   
                    
                    String dateOfBirthString = scanner.nextLine();
                    Date studentDateOfBirth = date.parse(dateOfBirthString);
                    
                    System.out.println("Enter student Gpa: ");
                    float studentGpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Enter student major: ");
                    String studentMajor = scanner.nextLine();

                    Student student = new Student(studentGpa, studentMajor, studentId, studentFullName, studentDateOfBirth);
                    personList.addStudent(student);
                    break;
                case 2:
                    System.out.print("Enter teacher id: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Enter teacher full name: ");
                    String teacherFullName = scanner.nextLine();
                    System.out.println("Enter teacher date of birth(dd/MM/YYYY): ");
                    
                    SimpleDateFormat linh = new SimpleDateFormat("dd/MM/yyyy");
                    
                    
                    String dateOfBirthString2 = scanner.nextLine();
                    Date teacherDateOfBirth = linh.parse(dateOfBirthString2);
                    System.out.print("Enter teacher department: ");
                    String teacherDepartment = scanner.nextLine();
                    System.out.print("Enter teacher teaching subject: ");
                    String teacherTeachingSubject = scanner.nextLine();

                    Teacher teacher = new Teacher(teacherDepartment, teacherTeachingSubject, teacherId, teacherFullName, teacherDateOfBirth);
                    personList.addTeacher(teacher);
                    break;

                case 3:
                    System.out.println("Enter person id to update: ");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;
                case 4:
                    System.out.println("Enter person id to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 5:
                    personList.displayEveryone();
                    break;

                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No student found");
                    }
                    break;
                case 7:
                    System.out.println("Enter department to find teacher: ");
                    String department = scanner.nextLine();
                    Teacher teacher1 = personList.findTeacherByDepartment(department);
                    if(teacher1 != null){
                        teacher1.displayInfo();
                    } else {
                        System.out.println("No teachers found in the department");
                    }
                    break;
                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
                            
            }
        }
    }
}
