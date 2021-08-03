package com.example.SpringBootThymeleaf.controller;

import com.example.SpringBootThymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("demo")
    public String demo(Model model){
        model.addAttribute("me" , "Hello Abhi's Thymeleaf");
        double grade = 95;
        model.addAttribute("grade" , grade);
        model.addAttribute("GPA" , convertGPA(grade));
        return "demo";
    }
    private String convertGPA(double grade){
        if(grade >= 90){
            return "A";
        }else if(grade <90 && grade >= 80){
            return "B";
        } else if(grade<80 && grade>= 70){
            return "C";
        }else if(grade < 70 && grade >= 60){
            return "D";
        }
        else return "F";
    }
    @RequestMapping("demo2")
    public String demo2(Model model){
        List<User> la= new ArrayList<>();
        la.add(new User(1,"Abhi" , 25));
        la.add(new User(2,"Aniket" , 20));
        la.add(new User(3,"Achal" , 15));
        la.add(new User(4,"Gaurav" , 10));
        model.addAttribute("list" , la);
        return "demo2";
    }
    @RequestMapping("demo3")
    public String demo3(HttpServletRequest req , Model model){
        //Request
        req.setAttribute("request","request Data");
        //Session
        req.getSession().setAttribute("session" , "session data");
        //Application
        req.getSession().getServletContext().setAttribute("application" , "application Data");
        return "demo3";
    }
}
