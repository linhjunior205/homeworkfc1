package practice;

import java.util.Date;
import java.util.Scanner;


public class EMP_FULLTIME extends EMPLOYEE{
     private double coefficientSalary;
     
     
    public EMP_FULLTIME(String empID, String empName, Date empDateOfBirth, Date startDate, int pair) {
        super(empID, empName, empDateOfBirth, startDate);
        this.coefficientSalary = coefficientSalary;
    }

   
    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
    
    public void Input(){
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficientSalary: ");
        setCoefficientSalary(scanner.nextDouble());
    }
    
    public void Output(){
        super.Output();
        System.out.println("CoefficientSalary: " + getCoefficientSalary());
    }
    

    @Override
    public double calculateSalary() {
        return BASIC_SALARY * getCoefficientSalary()  + calculateAllowance();
    }

    @Override
    public double calculateAllowance() {
        int seniority = CalculateSeniority();
        if(seniority >= 10){
            return 1000000;
        } else if(seniority >= 5){
            return 500000;
        } else {
            return 0;
        }
    }
    
}
