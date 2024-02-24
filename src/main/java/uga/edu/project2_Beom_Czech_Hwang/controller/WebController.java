// WebController.java

package uga.edu.project2_Beom_Czech_Hwang.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uga.edu.project2_Beom_Czech_Hwang.model.Query1;
import uga.edu.project2_Beom_Czech_Hwang.model.Query2;
import uga.edu.project2_Beom_Czech_Hwang.model.Query3;
import uga.edu.project2_Beom_Czech_Hwang.service.EmployeeService;

@Controller
@RequestMapping("dynamic")
public class WebController {

    private final EmployeeService employeeService;

    @Autowired
    public WebController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView mv = new ModelAndView("Home");
        mv.addObject("message", "Welcome to our application!");
        return mv;
    }

    @GetMapping("/query1")
    public ResponseEntity<?> getQuery1Results() {
        try {
            List<Query1> results = employeeService.getQuery1Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            // Log the exception, and return an appropriate response, such as an error
            // message or status code
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    @GetMapping("/query2")
    public ResponseEntity<?> getQuery2Results() {
        try {
            List<Query2> results = employeeService.getQuery2Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    @GetMapping("/query3")
    public ResponseEntity<?> getQuery3Results() {
        try {
            List<Query3> results = employeeService.getQuery3Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }
}
