package com.example.springwarjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloController(){
        return "Hello World";
    }
    @GetMapping("/hello")
    public String helloController1(){
        return "Hello World Controller";
    }
}
