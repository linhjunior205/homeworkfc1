package studentver4;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class PersonList {

    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        personList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
                return;
            }
        }
        System.out.println("Person not found with id: " + id);
    }

    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        float maxGpa = 0;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGpa() > maxGpa) {
                    maxGpa = student.getGpa();
                    topStudent = student;

                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department));
                return teacher;

            }
        }
        return null;
    }

}
