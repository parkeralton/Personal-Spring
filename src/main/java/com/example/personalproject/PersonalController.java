package com.example.personalproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalController {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
