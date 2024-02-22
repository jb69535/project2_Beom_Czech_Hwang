package uga.edu.project2_Beom_Czech_Hwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uga.edu.project2_Beom_Czech_Hwang.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/maxGenderSalaryRatio")
    public List<String> maxGenderSalaryRatio() {
        return employeeService.getDepartmentsWithMaxGenderSalaryRatio();
    }

    // Define other endpoints for different queries
}
