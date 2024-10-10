package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class EMPLOYEE implements IEMPLOYEE {

    private String EmpID;
    private String EmpName;
    private Date EmpDateOfBirth;
    private Date StartDate;

    public EMPLOYEE(String empID, String empName, Date empDateOfBirth, Date startDate) {
        EmpID = empID;
        EmpName = empName;
        EmpDateOfBirth = empDateOfBirth;
        StartDate = startDate;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date empDateOfBirth) {
        EmpDateOfBirth = empDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EmpID: ");
        setEmpID(scanner.nextLine());
        System.out.println("Enter EmpName: ");
        setEmpName(scanner.nextLine());
        System.out.println("Enter EmpDateOfBirth (dd/MM/yyyy): ");
        String dobString = scanner.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setEmpDateOfBirth(date.parse(dobString));
        } catch (ParseException e) {
            System.out.println("Invalid date format, plesae use dd/MM/yyyy");
        }
        System.out.println("Enter StartDate(dd/MM/yyyy): ");
        String startDateString = scanner.nextLine();
        try {
            setStartDate(date.parse(startDateString));
        } catch (ParseException e) {
            System.out.println("Invalid date format, plesse use dd/MM/yyyy");
        }
        
    }

    public void Output() {
        
        System.out.println("EmpID: " + getEmpID());
        System.out.println("EmpName: " + getEmpName());
        System.out.println("EmpDateOfBirth: " + getEmpDateOfBirth());
        System.out.println("StartDate: " + getStartDate());
        System.out.println();

    }

    public int CalculateSeniority() {
       long starttime = getStartDate().getTime();
       long currentTime = new Date().getTime();
       long timeDiff = currentTime - starttime;
       int seniority = (int)(timeDiff/(365 *24*60*60*1000));
       return seniority;
    }

    @Override
    public abstract double calculateSalary();
       
    

    @Override
    public abstract double calculateAllowance();
       
    
}


