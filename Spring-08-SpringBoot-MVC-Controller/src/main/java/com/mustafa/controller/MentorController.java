package com.mustafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MentorController {

    @GetMapping("/show")
    public String showForm(){
        System.out.println("Mentor");
        return "home";
    }
}
