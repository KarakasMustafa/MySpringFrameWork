package com.mustafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping
    public String getRequestMapping(){


        return "home";

    }

    @RequestMapping(method = RequestMethod.GET,value = "/mustafa")
    public String getRequestMapping2(){
        return "home";

    }

    @RequestMapping(method = RequestMethod.POST,value = "/test")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingExample(){
        return "home";
    }

    @PostMapping("/spring")
    public String postMappingExample(){
        return "home";
    }

    @GetMapping("/home{name}")
    public String pathVariableExample(@PathVariable("name") String name){
        return "home";
    }




}
