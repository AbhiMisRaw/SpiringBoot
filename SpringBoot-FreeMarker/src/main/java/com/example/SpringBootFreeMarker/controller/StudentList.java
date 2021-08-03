package com.example.SpringBootFreeMarker.controller;

import com.example.SpringBootFreeMarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList{
    @RequestMapping("/list")
    @ResponseBody
    public String list(Model model){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Tom",80.5));
        list.add(new Student(2,"Thomas",87.5));
        list.add(new Student(3,"Tommy",10.5));
        list.add(new Student(4,"Trevor",81.5));
        model.addAttribute("list",list);
        return "list";
    }
}
