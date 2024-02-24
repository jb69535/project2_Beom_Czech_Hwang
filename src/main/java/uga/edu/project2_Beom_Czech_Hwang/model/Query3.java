package uga.edu.project2_Beom_Czech_Hwang.model;

public class Query3 {
    private String deptNo;
    private String deptName;
    private int decadeStart;
    private int numberOfEmployees;
    private double averageSalary;

    public Query3(String deptNo, String deptName, int decadeStart, int numberOfEmployees, 
    double averageSalary) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.decadeStart = decadeStart;
        this.numberOfEmployees = numberOfEmployees;
        this.averageSalary = averageSalary;
    }
    
    // Getters
    public String getDeptNo() {
        return deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getDecadeStart() {
        return decadeStart;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAverageSalary() {
        return averageSalary;
    }
}
