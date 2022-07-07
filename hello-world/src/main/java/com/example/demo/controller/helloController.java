package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@ComponentScan()
public class helloController {

    @GetMapping("")
    public String GenKenobi(){
        return "Hello there";
    }
}
