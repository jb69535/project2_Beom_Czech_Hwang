// DepartmentRatio.java

package uga.edu.project2_Beom_Czech_Hwang.model;

// DepartmentRatio.java (a new class to hold your query results)
public class DepartmentRatio {

    private String deptName;
    private Double ratio;

    // Constructor, getters, and setters
    public DepartmentRatio(String deptName, Double ratio) {
        this.deptName = deptName;
        this.ratio = ratio;
    }

    // Getters and setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
