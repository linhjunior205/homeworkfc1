package practice;

import java.util.Date;
import java.util.Scanner;

public class EMP_PARTTIME extends EMPLOYEE {

    private int numberOfWorkdays;

    public EMP_PARTTIME(String empID, String empName, Date empDateOfBirth, Date startDate, int par) {
        super(empID, empName, empDateOfBirth, startDate);
        this.numberOfWorkdays = numberOfWorkdays;
    }

    

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numberOfWorkdays: ");
        setNumberOfWorkdays(scanner.nextInt());
    }

    public void Output() {
        super.Output();
        System.out.println("NumberOfWorkday: " + getNumberOfWorkdays());
    }

    @Override
    public double calculateSalary() {
        return BASIC_SALARY * getNumberOfWorkdays() / 26 + calculateAllowance();

    }

    @Override
    public double calculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        } else {
            return 0;
        }
    }

}
