package com.ust.capdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloWorldController {

    @GetMapping
    public String displayHello(){
        return "Hello World!";
    }
}
