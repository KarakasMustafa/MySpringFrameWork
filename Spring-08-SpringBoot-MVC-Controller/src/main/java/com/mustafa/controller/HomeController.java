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

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx(@PathVariable("name") String name,@PathVariable("email") String email){
        System.out.println("name is: " + name);
        System.out.println("email is: " + email);
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx2(@PathVariable("name") String name){
        System.out.println("name is: " + name);
        return "home";
    }

    @GetMapping("home/test")
    public String requestParamEx(@RequestParam("test") String test){
        System.out.println("name is: " +test);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx2(@RequestParam(value = "course",required = false) String course ){
        System.out.println("name is: " +course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParam2(@RequestParam(value = "name",required = false,defaultValue = "Mustafa") String name){

        System.out.println("name is: " + name);
        return "home";
    }




}
