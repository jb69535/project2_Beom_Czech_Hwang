package uga.edu.project2_Beom_Czech_Hwang.service;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/employees", "root", "Junmysql99@");
    }

    public List<String> getDepartmentsWithMaxGenderSalaryRatio() {
        List<String> departments = new ArrayList<>();
        // Implement your SQL logic here
        return departments;
    }

    // Add other methods for different queries
}
