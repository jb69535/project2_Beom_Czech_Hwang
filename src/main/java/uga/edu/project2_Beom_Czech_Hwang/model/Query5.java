package uga.edu.project2_Beom_Czech_Hwang.model;

public class Query5 {
    
    private int empNo1;
    private String empName1;
    private String deptNo;
    private String deptName;
    private int empNo2;
    private String empName2;
    

    // Constructor
    public Query5(int empNo1, String empName1, String deptNo, String deptName, int empNo2, String empName2) {
        this.empNo1 = empNo1;
        this.empName1 = empName1;
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.empNo2 = empNo2;
        this.empName2 = empName2;
    }

    // Getters and Setters
    public int getEmpNo1() {
        return empNo1;
    }
    public int getEmpNo2() {
        return empNo2;
    }
    public String getEmpName1() {
        return empName1;
    }
    public String getEmpName2() {
        return empName2;
    }
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
