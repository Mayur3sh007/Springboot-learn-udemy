package com.firstprojectudemy.firsty.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Injecting properties from application properties file like .env
    @Value("${ai.name}")
    private String aiNAME;

    @Value("${ai.version}")
    private String aiVERSION;

    @GetMapping("/ai-info")
    public String getInfo() {
        return "AI Name: " + aiNAME + " Version: " + aiVERSION;
    }

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
