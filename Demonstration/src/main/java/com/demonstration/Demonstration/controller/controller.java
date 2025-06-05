package com.demonstration.Demonstration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class controller {

    @GetMapping("/")
    public String sayHello(){
        return "Hello from Amoldeep Singh Dhillon!";
    }

}
