package com.mustafa.controller;

import com.mustafa.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){


        model.addAttribute("mentor",new Mentor());

        List<String> batchList = Arrays.asList("B6","B8","B10","B12","B15");
        model.addAttribute("batchList",batchList);

        return "mentor/mentor-register";
    }

}
