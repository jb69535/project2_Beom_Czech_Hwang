package uga.edu.project2_Beom_Czech_Hwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("dynamic")
public class WebController {

    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView mv = new ModelAndView("Home");
        mv.addObject("message", "Welcome to our application!");
        return mv;
    }
}
