package uga.edu.project2_Beom_Czech_Hwang.model;

public class Query4 {
    private String fullName;
    private int empNumber;

    // Constructor
    public Query4(String fullName, int empNumber) {
        this.fullName = fullName;
        this.empNumber = empNumber;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }


    public int getEmpNumber() {
        return empNumber;
    }
}