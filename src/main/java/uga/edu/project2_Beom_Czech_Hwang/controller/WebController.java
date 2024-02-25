// WebController.java

package uga.edu.project2_Beom_Czech_Hwang.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uga.edu.project2_Beom_Czech_Hwang.dto.Query6Request;
import uga.edu.project2_Beom_Czech_Hwang.model.Employee;
import uga.edu.project2_Beom_Czech_Hwang.model.Query1;
import uga.edu.project2_Beom_Czech_Hwang.model.Query2;
import uga.edu.project2_Beom_Czech_Hwang.model.Query3;
import uga.edu.project2_Beom_Czech_Hwang.model.Query4;
import uga.edu.project2_Beom_Czech_Hwang.model.Query5;
import uga.edu.project2_Beom_Czech_Hwang.model.Query6;
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

    @GetMapping("/query4")
    public ResponseEntity<?> getQuery4Results() {
        try {
            List<Query4> results = employeeService.getQuery4Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    @PostMapping("/query5")
    public ResponseEntity<?> getQuery5Results(@RequestBody Map<String, String> names) {
        try {
            // Log the received names
            System.out.println("Received names: " + names);

            String firstName1 = names.get("firstName1");
            String lastName1 = names.get("lastName1");
            String firstName2 = names.get("firstName2");
            String lastName2 = names.get("lastName2");

            // Log the extracted names
            System.out
                    .println("Extracted names: " + firstName1 + " " + lastName1 + ", " + firstName2 + " " + lastName2);

            List<Query5> results = employeeService.getQuery5Results(firstName1, lastName1, firstName2, lastName2);
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    @PostMapping("/query6")
    public ResponseEntity<?> getQuery6Results(@RequestBody Map<String, String> names) {
        try {
            // Log the received names
            System.out.println("Received names: " + names);

            String firstName1 = names.get("firstName1");
            String lastName1 = names.get("lastName1");
            String firstName2 = names.get("firstName2");
            String lastName2 = names.get("lastName2");

            // Log the extracted names
            System.out
                    .println("Extracted names: " + firstName1 + " " + lastName1 + ", " + firstName2 + " " + lastName2);

            List<Query6> results = employeeService.getQuery6Results(firstName1, lastName1, firstName2, lastName2);
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

}
