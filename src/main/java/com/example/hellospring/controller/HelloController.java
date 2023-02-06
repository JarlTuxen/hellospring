package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/firstmapping")
    public String firstMapping(){
        return "Hello World!";
    }

    @GetMapping("/")
    public String rootMapping(){
        return "Default Page!";
    }

    //GetMapping med parameter - returner indhold af input

    //skelet til /erdetfredag - Zellers Congruence
    @GetMapping("/erdetfredag")
    public String erdetfredag(){
        //FridayCalculator fridayCalculator = new FridayCalculator();
        return "skalligeregnedetud"; //fridayCalculator.erdetfredag();
    }

}
