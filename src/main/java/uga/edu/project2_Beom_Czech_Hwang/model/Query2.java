package uga.edu.project2_Beom_Czech_Hwang.model;

public class Query2 {
    private String fullName;
    private String deptName;
    private int howLong;

    // Constructor
    public Query2(String fullName, String deptName, int howLong) {
        this.fullName = fullName;
        this.deptName = deptName;
        this.howLong = howLong;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getHowLong() {
        return howLong;
    }
}
