package com.mustafa.controller;

import com.mustafa.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Mustafa");
        model.addAttribute("class","MVC");

        // Create some random values and print on UI
        int studentId = new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        model.addAttribute("numbers",numbers);


        // Print birthday
        LocalDate birthday =  LocalDate.now().minusYears(42);
        model.addAttribute("birthday",birthday);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }

}
