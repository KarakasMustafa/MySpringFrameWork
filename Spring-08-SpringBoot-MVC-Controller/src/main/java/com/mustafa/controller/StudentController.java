package com.mustafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @GetMapping("/show")
    public String showForm(){

        return "home";
    }
}
