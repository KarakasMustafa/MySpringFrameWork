package com.mustafa.controller;


import com.mustafa.datagenerator.DataGenerator;
import com.mustafa.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String employeeCreate(Model model){

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getStateList());
        return "employee/employee-create";
    }

    @PostMapping("/list")
    public String employeeList(){


        return "employee/employee-list";
    }
}
