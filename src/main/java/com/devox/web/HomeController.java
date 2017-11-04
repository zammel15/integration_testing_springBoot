package com.devox.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Value("${conferance.name:devox}")
    private String conferance ;

    @RequestMapping("/")
    public String home(){

        return "Hello" +" " + conferance ;
    }
}
