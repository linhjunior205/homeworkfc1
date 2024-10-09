package testlinh;

import java.util.ArrayList;
import java.util.Date;

public class Testlinh {

    

// Interface IPerson
        interface IPerson {

            void displayInfo();
        }

// Abstract class Person
        abstract class Person {

            private String id;
            private String fullName;
            private Date dateOfBirth;

            public Person(String id, String fullName, Date dateOfBirth) {
                this.id = id;
                this.fullName = fullName;
                this.dateOfBirth = dateOfBirth;
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

            public Date getDateOfBirth() {
                return dateOfBirth;
            }

            public void setDateOfBirth(Date dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public abstract void displayInfo();
        }

// Class Student
        class Student extends Person implements IPerson {

            private float gpa;
            private String major;

            public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
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

            public void addStudent() {
                // Implementation for adding a new student
            }

            @Override
            public void displayInfo() {
                System.out.println("ID: " + getId());
                System.out.println("Full Name: " + getFullName());
                System.out.println("Date of Birth: " + getDateOfBirth());
                System.out.println("GPA: " + gpa);
                System.out.println("Major: " + major);
            }
        }

// Class StudentList
        class StudentList {

            private ArrayList<Student> studentList;

            public StudentList() {
                studentList = new ArrayList<>();
            }

            public ArrayList<Student> getStudentList() {
                return studentList;
            }

            public void setStudentList(ArrayList<Student> studentList) {
                this.studentList = studentList;
            }

            public void addStudent(Student student) {
                studentList.add(student);
            }

            public void deleteStudentById(String id) {
                studentList.removeIf(student -> student.getId().equals(id));
            }

            public Student findStudentByID(String id) {
                for (Student student : studentList) {
                    if (student.getId().equals(id)) {
                        return student;
                    }
                }
                return null;
            }

            public void displayAllStudents() {
                for (Student student : studentList) {
                    student.displayInfo();
                    System.out.println("------------------");
                }
            }

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
        }

// Class Processor
        class Processor {

            public static void main(String[] args) {
                StudentList studentList = new StudentList();

                // Add some initial students
                studentList.addStudent(new Student("S1", "John Doe", new Date(), 3.8f, "Computer Science"));
                studentList.addStudent(new Student("S2", "Jane Smith", new Date(), 3.5f, "Engineering"));

                // Main program loop
                while (true) {
                    System.out.println("Choose an option:");
                    System.out.println("1. Add a new student");
                    System.out.println("2. Update a student by id");
                    System.out.println("3. Delete a student by id");
                    System.out.println("4. Display all students");
                    System.out.println("5. Find the student with the highest GPA");
                    System.out.println("6. Exit");

                    // Get user input
                    int choice = 0;
                    try {
                        choice = Integer.parseInt(System.console().readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }

                    // Process user input
                    switch (choice) {
                        case 1:
                            // Add a new student
                            // Implement the logic to get student details from the user and create a new Student object
                            // Then use studentList.addStudent(newStudent) to add the new student to the list
                            break;
                        case 2:
                            // Update a student by id
                            // Implement the logic to get the student id and the updated details from the user
                            // Find the student using studentList.findStudentByID(id)
                            // If the student is found, update their details using setters
                            // If the student is not found, display an error message
                            break;
                        case 3:
                            // Delete a student by id
                            // Implement the logic to get the student id from the user
                            // Delete the student using studentList.deleteStudentById(id)
                            // If the student is not found, display an error message
                            break;
                        case 4:
                            // Display all students
                            studentList.displayAllStudents();
                            break;
                        case 5:
                            // Find the student with the highest GPA
                            Student topStudent = studentList.findTopStudent();
                            if (topStudent != null) {
                                System.out.println("Student with the highest GPA:");
                                topStudent.displayInfo();
                            } else {
                                System.out.println("No students in the list.");
                            }
                            break;
                        case 6:
                            System.out.println("Exiting program.");
                            System.exit(0);
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
            }
        }
    }


