package uga.edu.project2_Beom_Czech_Hwang.model;

public class Query6 {
    private int empNo;
    private String e1Name;
    private String d1;
    private int empNo3;
    private String e3Name;
    private String d2;
    private int empNo2;
    private String e2Name;

    public Query6(int empNo, String e1Name, String d1, int empNo3, String e3Name, String d2, int empNo2, String e2Name) {
        this.empNo = empNo;
        this.e1Name = e1Name;
        this.d1 = d1;
        this.empNo3 = empNo3;
        this.e3Name = e3Name;
        this.d2 = d2;
        this.empNo2 = empNo2;
        this.e2Name = e2Name;
    }

    // Getters
    public int getEmpNo() { 
        return empNo; 
    }
    public int getEmpNo2() { 
        return empNo2; 
    }
    public int getEmpNo3() { 
        return empNo3; 
    }
    public String getE1Name() { 
        return e1Name; 
    }
    public String getE2Name() { 
        return e2Name; 
    }
    public String getD1() { 
        return d1; 
    }
    public String getD2() { 
        return d2; 
    }
    public String getE3Name() { 
        return e3Name; 
    }
}
