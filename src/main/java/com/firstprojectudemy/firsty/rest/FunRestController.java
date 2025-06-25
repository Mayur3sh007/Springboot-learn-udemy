package com.firstprojectudemy.firsty.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // we'll expose a / endpoint to return "Hello World"
    @GetMapping("/")
    public String sayHelloWorld() {
        return "Hello World";
    }
    //exposing new endpoint
    @GetMapping("/workout")
    public String doJim() {
        return "Yeahhh Buddasasy!";
    }//exposing new endpoint
    @GetMapping("/study")
    public String std() {
        return "FOCUS!";
    }
}
