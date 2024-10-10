package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EMP_LIST {

    private ArrayList<EMPLOYEE> list = new ArrayList<>();

    public void AddNew(EMPLOYEE employee) {
        list.add(employee);
    }

    public void Update(String empID, EMPLOYEE employee) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empID)) {
                list.set(i, employee);
                return;
            }
        }
    }

    public void Delete(String empID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empID)) {
                list.remove(i);
                return;
            }
        }
    }

    public EMPLOYEE Find(String empID) {
        for (EMPLOYEE employee : list) {
            if (employee.getEmpID().equals(empID)) {
                return employee;
            }
        }
        return null;
    }

    public void Display() {
        for (EMPLOYEE employee : list) {
            employee.Output();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println("Allowance: " + employee.calculateAllowance());
        }
    }

    public static void main(String[] args) {
        EMP_LIST empList = new EMP_LIST();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Find employee");
            System.out.println("5. Display all employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter: 1. For full-time employee\n "
                            + "              2. For part-time employee: ");
                    int type = scanner.nextInt();
                    if (type == 1) {
                        EMP_FULLTIME employee = new EMP_FULLTIME("", "", new Date(), new Date(), 0);
                        employee.Input();
                        empList.AddNew(employee);
                    } else if (type == 2) {
                        EMP_PARTTIME employee = new EMP_PARTTIME("", "", new Date(), new Date(), 0);
                        employee.Input();
                        empList.AddNew(employee);
                    }
                    break;
                case 2:
                    System.out.print("Enter EmpID: ");
                    String empID = scanner.next();
                    System.out.print("Enter 1 for full-time employee, 2 for part-time employee: ");
                    type = scanner.nextInt();
                    if (type == 1) {
                        EMP_FULLTIME employee = new EMP_FULLTIME("", "", new Date(), new Date(), 0);
                        employee.Input();
                        empList.Update(empID, employee);
                    } else if (type == 2) {
                        EMP_PARTTIME employee = new EMP_PARTTIME("", "", new Date(), new Date(), 0);
                        employee.Input();
                        empList.Update(empID, employee);
                    }
                    break;
                case 3:
                    System.out.print("Enter EmpID: ");
                    empID = scanner.next();
                    empList.Delete(empID);
                    break;
                case 4:
                    System.out.print("Enter EmpID: ");
                    empID = scanner.next();
                    EMPLOYEE employee = empList.Find(empID);
                    if (employee != null) {
                        employee.Output();
                        System.out.println("Salary: " + employee.calculateSalary());
                        System.out.println("Allowance: " + employee.calculateAllowance());
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 5:
                    empList.Display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
